SUMMARY = "LeechCraft MtpSync Module"
DESCRIPTION = "This package allows to synchronize with MTP devices via LeechCraft."
LICENSE = "BSL-1.0"

PV = "0.6.70+git.14794.g33744ae6ce"

RPM_NAME = "leechcraft-lmp-mtpsync-0.6.70+git.14794.g33744ae6ce-3.1.aarch64.rpm"
RPM_HASH = "831892c505f9820d2cc8d9309cac87e0a6349944d319fd9a4fd1cefaec68f6681d67a482d20e89ea2d575b3e804438542b4c4e85e45ae8fde4bd9316231b10e5"

RPROVIDES:${PN} += "leechcraft-lmp-mtpsync \
leechcraft-lmp-mtpsync(aarch-64) \
libleechcraft_lmp_mtpsync.so()(64bit)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
leechcraft-devmon \
leechcraft-lmp \
libQt5Core.so.5()(64bit) \
libQt5Core.so.5(Qt_5)(64bit) \
libQt5Gui.so.5()(64bit) \
libQt5Gui.so.5(Qt_5)(64bit) \
libc.so.6()(64bit) \
libgcc_s.so.1()(64bit) \
libmtp.so.9()(64bit) \
libstdc++.so.6()(64bit)"

inherit rpm
