SUMMARY = "Graphical tool to Undelete Files"
DESCRIPTION = "QPhotoRec is a Graphical User Interface (Qt based GUI) version of PhotoRec. \
More user friendly, it recognizes the same file formats."
LICENSE = "GPL-2.0-only"

PV = "7.1"

RPM_NAME = "qphotorec-7.1-4.15.aarch64.rpm"
RPM_HASH = "8c8a18e87d1c08e5040195144b8d724b7ad4d0e6f288390ddd9f5fda99bd5a325ba0ac7bec9979d75542cce454f20e68ee8ae45ab454ee8098a9de646f11fe82"

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
