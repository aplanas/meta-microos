SUMMARY = "LeechCraft VK.com Streaming Module"
DESCRIPTION = "This package provides a VK.com music streaming plugin for Leechcraft."
LICENSE = "BSL-1.0"

PV = "0.6.70+git.14794.g33744ae6ce"

RPM_NAME = "leechcraft-touchstreams-0.6.70+git.14794.g33744ae6ce-3.1.aarch64.rpm"
RPM_HASH = "37122abb5cee5e230e5fff94e42f608aaa9a79112ae4836f3c51a0fd6761eef4d92f35e8635de6d6eb31fd6662da023053e01a713cdcdbe942ec54c763836cdc"

RPROVIDES:${PN} += "leechcraft-touchstreams \
libleechcraft-touchstreams.so"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
leechcraft \
leechcraft-lmp \
leechcraft-musiczombie \
libQt5Core.so.5 \
libQt5Gui.so.5 \
libQt5Network.so.5 \
libQt5Widgets.so.5 \
libc.so.6 \
libgcc-s.so.1 \
libleechcraft-util-qt5.so.0.6.75 \
libleechcraft-util-sll-qt5.so.0.6.75.1 \
libleechcraft-util-svcauth-qt5.so.0.6.75 \
libleechcraft-xsd-qt5.so.0.6.75.2 \
libstdc++.so.6"

inherit rpm
