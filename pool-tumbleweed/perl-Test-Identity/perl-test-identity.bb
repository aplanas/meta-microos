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

RPM_NAME = "perl-Test-Identity-0.01-1.26.noarch.rpm"
RPM_HASH = "619d4b4c7d87d973a0939767de4bec651d61606cbd92b32ff3f144cc9b37d4e8e07964112ffa45c0b7e37a885ae8676b1c4e31f2ee531248334e661b6aca0f9a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-Test--Identity \
perl-Test-Identity"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.38.0"

inherit rpm
