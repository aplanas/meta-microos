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

RPM_NAME = "python39-testfixtures-7.0.4-1.3.noarch.rpm"
RPM_HASH = "19a58b3f8b59a490d5ca83afda3d3eb2aacb55b3dee119172a57b4fbcf76d07103541924a48fc72c25c27ad80851d1b46e3f8986f17d1b71fefd55fb1a334f02"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(testfixtures) \
python39-testfixtures \
python3dist(testfixtures)"

RDEPENDS:${PN} += "python(abi)"

inherit rpm
