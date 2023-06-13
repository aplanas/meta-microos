SUMMARY = "Graphical tool to Undelete Files"
DESCRIPTION = "QPhotoRec is a Graphical User Interface (Qt based GUI) version of PhotoRec. \
More user friendly, it recognizes the same file formats."
LICENSE = "GPL-2.0-only"

PV = "7.1"

RPM_NAME = "qphotorec-7.1-4.13.aarch64.rpm"
RPM_HASH = "d88847e192248e8673efa102b9a16faff927eb9ca55b43dfffe2ab774aeb08b138218eb9d40af3eb179e67a45f0818554a7efb3010f520fc9535e59f80e228b6"

RPROVIDES:${PN} += "application() \
application(qphotorec.desktop) \
qphotorec \
qphotorec(aarch-64)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
libQt5Core.so.5()(64bit) \
libQt5Core.so.5(Qt_5)(64bit) \
libQt5Gui.so.5()(64bit) \
libQt5Gui.so.5(Qt_5)(64bit) \
libQt5Widgets.so.5()(64bit) \
libQt5Widgets.so.5(Qt_5)(64bit) \
libc.so.6()(64bit) \
libewf.so.3()(64bit) \
libewf.so.3(V_20230212)(64bit) \
libext2fs.so.2()(64bit) \
libgcc_s.so.1()(64bit) \
libjpeg.so.8()(64bit) \
libntfs-3g.so.89()(64bit) \
libstdc++.so.6()(64bit) \
libz.so.1()(64bit)"

inherit rpm
