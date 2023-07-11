SUMMARY = "Non-ABI stable API for the Qt5 Virtual Keyboard"
DESCRIPTION = "This package provides private headers of libqt5-qtvirtualkeyboard that are \
normally not used by application development and that do not have any ABI or \
API guarantees. The packages that build against these have to require \
the exact Qt version."
LICENSE = "GPL-3.0"

PV = "5.15.10+kde0"

RPM_NAME = "libqt5-qtvirtualkeyboard-private-headers-devel-5.15.10+kde0-1.1.aarch64.rpm"
RPM_HASH = "b9a19f03a594e594c32439281c51a7b887cffbaf61ba27d75f50f28750330be57f48169896e009d231de528f0c5663eecb2e5b4afd88bbd970945d48190e431f"

RPROVIDES:${PN} += "libqt5-qtvirtualkeyboard-private-headers-devel"

RDEPENDS:${PN} += "libQt5Core-private-headers-devel \
libQt5Gui-private-headers-devel \
libqt5-qtvirtualkeyboard-devel"

inherit rpm
