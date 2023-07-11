SUMMARY = "Assert the Referential Identity of a Reference"
DESCRIPTION = "This module provides a single testing function, 'identical'. It asserts \
that a given reference is as expected; that is, it either refers to the \
same object or is 'undef'. It is similar to 'Test::More::is' except that it \
uses 'refaddr', ensuring that it behaves correctly even if the references \
under test are objects that overload stringification or numification. \
 \
It also provides better diagnostics if the test fails: \
 \
 $ perl -MTest::More=tests,1 -MTest::Identity -e'identical [], {}' \
 1..1 \
 not ok 1 \
  \
  \
  \
 \
 $ perl -MTest::More=tests,1 -MTest::Identity -e'identical [], []' \
 1..1 \
 not ok 1"
LICENSE = "Artistic-1.0 | GPL-1.0+"

PV = "0.01"

RPM_NAME = "perl-Test-Identity-0.01-1.25.noarch.rpm"
RPM_HASH = "c114ae0957c1e17bcb6e88e14395c324aaae2d55f9f46ff0d7267ab8aa38cbcccf8cfae2a931ed9e032d2abf2051c90c983689bee23a5842ce2f64db24064eb4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-Test--Identity \
perl-Test-Identity"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.36.1"

inherit rpm
