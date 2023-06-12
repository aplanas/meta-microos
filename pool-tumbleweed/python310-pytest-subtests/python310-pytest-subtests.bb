SUMMARY = "Python unittest subTest() support and subtests fixture"
DESCRIPTION = "Python unittest subTest() support and subtests fixture."
LICENSE = "MIT"

PV = "0.11.0"

RPM_NAME = "python310-pytest-subtests-0.11.0-1.1.noarch.rpm"
RPM_HASH = "cfd23c77d449280552adc088b96bf41bd748ccbb9be7ac36c6a0454bf82447ac16c5c970cc48b361160b247720f065bedc84588a51be51a54dad6b495d1f6f06"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-pytest-subtests \
python3.10dist(pytest-subtests) \
python310-pytest-subtests \
python3dist(pytest-subtests)"
RDEPENDS:${PN} += "python(abi) \
python310-pytest"

inherit rpm
