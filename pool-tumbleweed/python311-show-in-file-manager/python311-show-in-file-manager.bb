SUMMARY = "Open the system file manager and select files in it"
DESCRIPTION = "Show in File Manager is a Python package to open the system file manager \
and optionally select files in it. The point is not to open the files, but \
to select them in the file manager, thereby highlighting the files and allowing \
the user to quickly do something with them."
LICENSE = "MIT"

PV = "1.1.4"

RPM_NAME = "python311-show-in-file-manager-1.1.4-1.13.noarch.rpm"
RPM_HASH = "bf77c15c876ace9163f84c34dbc0270d687f4271af96b0961e030c64bd24eaa60ef2b2ef6142da1d4fc6c011904074d16cfd9acf0b7d2d68c9c2d3cb23ffa650"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-show-in-file-manager \
python3.11dist-show-in-file-manager \
python311-show-in-file-manager \
python3dist-show-in-file-manager"

RDEPENDS:${PN} += "/usr/bin/python3.11 \
/usr/bin/sh \
python-abi \
python311-packaging \
python311-pyxdg \
update-alternatives"

inherit rpm
