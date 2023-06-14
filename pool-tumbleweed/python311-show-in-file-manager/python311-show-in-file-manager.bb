SUMMARY = "Open the system file manager and select files in it"
DESCRIPTION = "Show in File Manager is a Python package to open the system file manager \
and optionally select files in it. The point is not to open the files, but \
to select them in the file manager, thereby highlighting the files and allowing \
the user to quickly do something with them."
LICENSE = "MIT"

PV = "1.1.4"

RPM_NAME = "python311-show-in-file-manager-1.1.4-1.11.noarch.rpm"
RPM_HASH = "cc355b10dea5c0305ee4fbdf3b028a792cd7fb0cfaf6abcc14309d5a4b60cac7f1a902cbec2ffa41ff3bd576969a19ba106369d437fba527ae7bb12f6689623f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist-show-in-file-manager \
python311-show-in-file-manager \
python3dist-show-in-file-manager"

RDEPENDS:${PN} += "/bin/sh \
/usr/bin/python3.11 \
python-abi \
python311-packaging \
python311-pyxdg \
update-alternatives"

inherit rpm
