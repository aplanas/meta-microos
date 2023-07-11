SUMMARY = "Line clipping tool"
DESCRIPTION = "Line clipping: Cohen-Sutherland"
LICENSE = "MIT"

PV = "1.0.0"

RPM_NAME = "python311-pylineclip-1.0.0-2.12.noarch.rpm"
RPM_HASH = "ce952cb9b04ef623716feb0ea6aacf769722df6712c5629c3554393b5a85b3c6bf0bb916002acb3eebbc6625a1aa0165d288e324970c83288b8d8b35ad19b495"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-pylineclip \
python3.11dist-pylineclip \
python311-pylineclip \
python3dist-pylineclip"

RDEPENDS:${PN} += "python-abi"

inherit rpm
