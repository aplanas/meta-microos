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

RPM_NAME = "perl-Carp-Assert-More-2.3.0-1.1.noarch.rpm"
RPM_HASH = "942161ed0c36054fec726fa7e030706ecf3e53e34afa1a47800f570369f31b40d264e2f93f42efc256a9088c062a134da1ff2154cb255b4941e1e5de384b591e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl(Carp::Assert::More) \
perl-Carp-Assert-More"
RDEPENDS:${PN} += "perl(:MODULE_COMPAT_5.36.0) \
perl(Test::Exception)"

inherit rpm
