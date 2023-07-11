SUMMARY = "Convenience assertions for common situations"
DESCRIPTION = "Carp::Assert::More is a convenient set of assertions to make the habit of \
writing assertions even easier. \
 \
Everything in here is effectively syntactic sugar. There's no technical \
difference between calling one of these functions: \
 \
    assert_datetime( $foo ); \
    assert_isa( $foo, 'DateTime' ); \
 \
that are provided by Carp::Assert::More and calling these assertions from \
Carp::Assert \
 \
    assert( defined $foo ); \
    assert( ref($foo) eq 'DateTime' ); \
 \
My intent here is to make common assertions easy so that we as programmers \
have no excuse to not use them."
LICENSE = "Artistic-2.0"

PV = "2.3.0"

RPM_NAME = "perl-Carp-Assert-More-2.3.0-1.2.noarch.rpm"
RPM_HASH = "9c64cd29ab4a8863e24ff9bfcba73f63867e3ec6ac04b6a26214c8dc03ef3ee57376eb4da872999844b2ec3d4f56f09884e46f3fba884238bdb3839243272329"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-Carp--Assert--More \
perl-Carp-Assert-More"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.36.1 \
perl-Test--Exception"

inherit rpm
