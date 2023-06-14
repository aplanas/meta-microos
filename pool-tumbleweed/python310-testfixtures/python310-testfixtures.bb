SUMMARY = "A collection of helpers and mock objects for unit tests and doc tests"
DESCRIPTION = "TestFixtures is a collection of helpers and mock objects that are \
useful when writing unit tests or doc tests. \
 \
If you're wondering why 'yet another mock object library', testing is \
often described as an art form and as such some styles of library will \
suit some people while others will suit other styles. This library \
contains common test fixtures the author found himself \
repeating from package to package and so decided to extract them into \
their own library and give them some tests of their own!"
LICENSE = "MIT"

PV = "7.0.4"

RPM_NAME = "python310-testfixtures-7.0.4-1.3.noarch.rpm"
RPM_HASH = "4657ea07970b1833fdd844232286dcdb5bf48844442f87fca0531d96f7c52bdf78e5d271e8f000d92691bbb7c64d99e12f5acb739385345ccbf84e4926dee3c9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-testfixtures \
python3.10dist-testfixtures \
python310-testfixtures \
python3dist-testfixtures"

RDEPENDS:${PN} += "python-abi"

inherit rpm
