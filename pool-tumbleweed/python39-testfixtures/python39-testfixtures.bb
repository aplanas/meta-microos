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

RPM_NAME = "python39-testfixtures-7.0.4-1.5.noarch.rpm"
RPM_HASH = "4910995b03e0f857bf75bb350984461a4735dd8fbdbdc49540b64aeea0ebd010304e361a31c48b5ca219bacf1f71b4d8e4df6bf603206d78a088b848cf29699d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-testfixtures \
python39-testfixtures \
python3dist-testfixtures"

RDEPENDS:${PN} += "python-abi"

inherit rpm
