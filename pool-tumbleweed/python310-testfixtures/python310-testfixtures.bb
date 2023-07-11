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

RPM_NAME = "python310-testfixtures-7.0.4-1.5.noarch.rpm"
RPM_HASH = "1b6366fa199480cfeef50a0c475f834eaabf6dc186a4f06186ffe759ea2a51fe5cd40cb88011b79f6550081ecddfea82520e3a04e0f2052e984fc0acaa7abf43"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-testfixtures \
python310-testfixtures \
python3dist-testfixtures"

RDEPENDS:${PN} += "python-abi"

inherit rpm
