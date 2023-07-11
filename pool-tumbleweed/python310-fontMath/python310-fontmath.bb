SUMMARY = "A set of objects for performing math operations on font data"
DESCRIPTION = "A set of objects for performing math operations on font data."
LICENSE = "MIT"

PV = "0.9.3"

RPM_NAME = "python310-fontMath-0.9.3-1.5.noarch.rpm"
RPM_HASH = "842cc62450eef2e9a52673756440d6460be06733a6bf11fc24041ce183bf000d709c79e5312e8a63c4d3a0c684cf9eb96bd995ddcf8c288f2e0c04431637620a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-fontmath \
python310-fontMath \
python3dist-fontmath"

RDEPENDS:${PN} += "python-abi \
python310-FontTools"

inherit rpm
