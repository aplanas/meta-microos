SUMMARY = "Open the system file manager and select files in it"
DESCRIPTION = "Show in File Manager is a Python package to open the system file manager \
and optionally select files in it. The point is not to open the files, but \
to select them in the file manager, thereby highlighting the files and allowing \
the user to quickly do something with them."
LICENSE = "MIT"

PV = "1.1.4"

RPM_NAME = "python310-show-in-file-manager-1.1.4-1.11.noarch.rpm"
RPM_HASH = "670838f97df5de4fd0df0561d319f630aa2b0535c8b2b03bc951fa634a1f0c9ed8c456a2172f615d433992f8c47afdd1f487aa87a06ce611f961728270cc1799"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-show-in-file-manager \
python3.10dist-show-in-file-manager \
python310-show-in-file-manager \
python3dist-show-in-file-manager"

RDEPENDS:${PN} += "/usr/bin/python3.10 \
/usr/bin/sh \
python-abi \
python310-packaging \
python310-pyxdg \
update-alternatives"

inherit rpm
