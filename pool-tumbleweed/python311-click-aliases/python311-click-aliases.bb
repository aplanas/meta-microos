SUMMARY = "Command aliases for Click"
DESCRIPTION = "Command aliases for Click."
LICENSE = "MIT"

PV = "1.0.1"

RPM_NAME = "python311-click-aliases-1.0.1-3.14.noarch.rpm"
RPM_HASH = "4935661aab8e81a0762c2f9f83dc33476ce99a1d809dc5f2daf2c166672aee524438f6969b038b3506a1a96d6b460c17c1619a233c4a70a7f88f9215df3ae82a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-click-aliases \
python3.11dist-click-aliases \
python311-click-aliases \
python3dist-click-aliases"

RDEPENDS:${PN} += "python-abi \
python311-click"

inherit rpm
