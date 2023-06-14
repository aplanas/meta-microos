SUMMARY = "Command aliases for Click"
DESCRIPTION = "Command aliases for Click."
LICENSE = "MIT"

PV = "1.0.1"

RPM_NAME = "python311-click-aliases-1.0.1-3.12.noarch.rpm"
RPM_HASH = "d8a1218983e1b87f48b931beb270a25f27f5128b40585071f66a35b3dd3b4bd3dac0aa30cdd5afd0a625cda4aafc2db990050cf6ae530318cea5b8f55c2b86a1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist-click-aliases \
python311-click-aliases \
python3dist-click-aliases"

RDEPENDS:${PN} += "python-abi \
python311-click"

inherit rpm
