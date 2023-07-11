SUMMARY = "A multi-platform gui for pass"
DESCRIPTION = "QtPass is a multi-platform GUI for pass, the standard unix password manager."
LICENSE = "GPL-3.0-only"

PV = "1.3.2"

RPM_NAME = "QtPass-1.3.2-1.20.aarch64.rpm"
RPM_HASH = "30d6ba639ba0ca3249571b55a7836c593390e8afc055a63353e1caf55712d48fe561d15c75840d157549cdcbe4345a06e94b525e0fe08d741c3a6c0038c4dcda"

RPROVIDES:${PN} += "QtPass"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libQt5Core.so.5 \
libQt5Gui.so.5 \
libQt5Network.so.5 \
libQt5Widgets.so.5 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6 \
password-store"

inherit rpm
