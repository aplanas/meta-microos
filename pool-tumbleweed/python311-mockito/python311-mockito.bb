SUMMARY = "Spying framework"
DESCRIPTION = "Mockito is a spying framework originally based on the Java library with the same name."
LICENSE = "MIT"

PV = "1.4.0"

RPM_NAME = "python311-mockito-1.4.0-1.5.noarch.rpm"
RPM_HASH = "568a4ddfd2ef636aed252d0cba93bab2bf38cb87a8a0df39b33b7ae96f08a6e730dd9ddfe82ccc46ceb40ee459f4273fae19d2d44e099063b1b7e754fda1defb"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-mockito \
python3.11dist-mockito \
python311-mockito \
python3dist-mockito"

RDEPENDS:${PN} += "python-abi"

inherit rpm
