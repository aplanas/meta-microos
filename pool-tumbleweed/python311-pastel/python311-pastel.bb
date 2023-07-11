SUMMARY = "String colorization for Python"
DESCRIPTION = "Pastel is a library to colorize strings in the terminal."
LICENSE = "MIT"

PV = "0.2.1"

RPM_NAME = "python311-pastel-0.2.1-2.1.noarch.rpm"
RPM_HASH = "c51fff0fd2b79b926befe59f7c78982522197dfde9e087157ebc25c050c310fe7dfd2d21cccc6aa747956e67f667e2a4019ee19e242bb37aed9293c84d84b1eb"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-pastel \
python3.11dist-pastel \
python311-pastel \
python3dist-pastel"

RDEPENDS:${PN} += "python-abi"

inherit rpm
