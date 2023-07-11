SUMMARY = "Open the system file manager and select files in it"
DESCRIPTION = "Show in File Manager is a Python package to open the system file manager \
and optionally select files in it. The point is not to open the files, but \
to select them in the file manager, thereby highlighting the files and allowing \
the user to quickly do something with them."
LICENSE = "MIT"

PV = "1.1.4"

RPM_NAME = "python310-show-in-file-manager-1.1.4-1.13.noarch.rpm"
RPM_HASH = "b22ace349493b6dc61d90dd99645639111f4f0fa08242fc88925b531ece76b95dc5fac953a2afbdb7c7aad0ade9802ee6bc207753fbbf4a503f9a7765521d0f0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-show-in-file-manager \
python310-show-in-file-manager \
python3dist-show-in-file-manager"

RDEPENDS:${PN} += "/usr/bin/python3.10 \
/usr/bin/sh \
python-abi \
python310-packaging \
python310-pyxdg \
update-alternatives"

inherit rpm
