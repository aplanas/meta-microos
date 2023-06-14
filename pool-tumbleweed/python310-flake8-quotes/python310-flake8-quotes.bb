SUMMARY = "Flake8 lint for quotes"
DESCRIPTION = "Flake8 Extension to lint for quotes."
LICENSE = "MIT"

PV = "3.3.2"

RPM_NAME = "python310-flake8-quotes-3.3.2-1.3.noarch.rpm"
RPM_HASH = "344cd01b1cd25c2beb3c70cf376c84f1826ae069508daf3b99bcebff4af90b80f4b2d515c053b4fabf992eefe6d68f0788e65b7e55c533b37ef3ad10a8caf650"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-flake8-quotes \
python3.10dist-flake8-quotes \
python310-flake8-quotes \
python3dist-flake8-quotes"

RDEPENDS:${PN} += "python-abi \
python310-flake8"

inherit rpm
