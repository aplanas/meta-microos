SUMMARY = "Colorization of help messages in Click"
DESCRIPTION = "Colorization of help messages in Click"
LICENSE = "MIT"

PV = "0.9.1"

RPM_NAME = "python310-click-help-colors-0.9.1-2.1.noarch.rpm"
RPM_HASH = "eca2ac9e8dbe92496eac564e22836df34418de48171474b039eb150e8347f5d8cbaf0dcc5ca4d560928cc354993ae8aa7643c37c31132b045dfde9aebf18045a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-click-help-colors \
python3.10dist(click-help-colors) \
python310-click-help-colors \
python3dist(click-help-colors)"
RDEPENDS:${PN} += "python(abi) \
python310-click"

inherit rpm
