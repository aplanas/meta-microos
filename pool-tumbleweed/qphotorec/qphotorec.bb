SUMMARY = "Graphical tool to Undelete Files"
DESCRIPTION = "QPhotoRec is a Graphical User Interface (Qt based GUI) version of PhotoRec. \
More user friendly, it recognizes the same file formats."
LICENSE = "GPL-2.0-only"

PV = "7.1"

RPM_NAME = "qphotorec-7.1-4.13.aarch64.rpm"
RPM_HASH = "d88847e192248e8673efa102b9a16faff927eb9ca55b43dfffe2ab774aeb08b138218eb9d40af3eb179e67a45f0818554a7efb3010f520fc9535e59f80e228b6"

RPROVIDES:${PN} += "qphotorec"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libQt5Core.so.5 \
libQt5Gui.so.5 \
libQt5Widgets.so.5 \
libc.so.6 \
libewf.so.3 \
libext2fs.so.2 \
libgcc-s.so.1 \
libjpeg.so.8 \
libntfs-3g.so.89 \
libstdc++.so.6 \
libz.so.1"

inherit rpm
