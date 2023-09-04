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

RPM_NAME = "perl-Carp-Assert-More-2.3.0-1.3.noarch.rpm"
RPM_HASH = "2de968b4e52a9d8f31a7bdc6480307fe57dc0e7f017088704617cdc6dc0365db03728d6e17b300b26b7ffe6e43e55adab7de208807e2d78c1cb794164a178c30"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-Carp--Assert--More \
perl-Carp-Assert-More"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.38.0 \
perl-Test--Exception"

inherit rpm
