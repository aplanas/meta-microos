SUMMARY = "Colorization of help messages in Click"
DESCRIPTION = "Colorization of help messages in Click"
LICENSE = "MIT"

PV = "0.9.1"

RPM_NAME = "python311-click-help-colors-0.9.1-2.3.noarch.rpm"
RPM_HASH = "5dbfb9a2ec278da454e2905944d8408a3ff3e0cd19da59fcb49f0eb88401f395279ee652aa61e71b325d97e7067e86f7873c5a476c525139b3bb85cf7b7a79fd"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-click-help-colors \
python3.11dist-click-help-colors \
python311-click-help-colors \
python3dist-click-help-colors"

RDEPENDS:${PN} += "python-abi \
python311-click"

inherit rpm
