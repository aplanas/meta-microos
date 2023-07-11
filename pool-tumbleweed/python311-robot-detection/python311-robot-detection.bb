SUMMARY = "HTTP User Agent Bot Detection"
DESCRIPTION = "Library for detecting if a HTTP User Agent header is likely to be a bot."
LICENSE = "GPL-3.0-or-later"

PV = "0.4.0"

RPM_NAME = "python311-robot-detection-0.4.0-3.1.noarch.rpm"
RPM_HASH = "733a651e2e34f98a75760f8e9fcc1da8e8d23bd28d611664f397b35afae3dbb70e1c953264b347383addcffd2a93e82aa7c7b86c501336e89153af89a0dab58e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-robot-detection \
python3.11dist-robot-detection \
python311-robot-detection \
python3dist-robot-detection"

RDEPENDS:${PN} += "python-abi \
python311-six"

inherit rpm
