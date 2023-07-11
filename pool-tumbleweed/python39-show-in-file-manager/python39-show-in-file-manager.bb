SUMMARY = "Open the system file manager and select files in it"
DESCRIPTION = "Show in File Manager is a Python package to open the system file manager \
and optionally select files in it. The point is not to open the files, but \
to select them in the file manager, thereby highlighting the files and allowing \
the user to quickly do something with them."
LICENSE = "MIT"

PV = "1.1.4"

RPM_NAME = "python39-show-in-file-manager-1.1.4-1.13.noarch.rpm"
RPM_HASH = "2e90b2c06c828bcde6c732d401ac224a7c3fb954ddb5210eb8285111920d7c3e30122b0f4202d012a549b86f1482837958b35d1d04f297c002c1338fd334a961"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-show-in-file-manager \
python39-show-in-file-manager \
python3dist-show-in-file-manager"

RDEPENDS:${PN} += "/usr/bin/python3.9 \
/usr/bin/sh \
python-abi \
python39-packaging \
python39-pyxdg \
update-alternatives"

inherit rpm
