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

RPM_NAME = "python311-testfixtures-7.0.4-1.5.noarch.rpm"
RPM_HASH = "856ddb72a9759ba47b52121f576b7249638829bf7b8eca984afb2dc38dd0424affb52f4787cb72773f75d9c831db0fa5532da5c6563e10a8bc1b64e8303fc23e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-testfixtures \
python3.11dist-testfixtures \
python311-testfixtures \
python3dist-testfixtures"

RDEPENDS:${PN} += "python-abi"

inherit rpm
