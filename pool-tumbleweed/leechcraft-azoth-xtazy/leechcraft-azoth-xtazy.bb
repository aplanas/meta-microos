SUMMARY = "LeechCraft Azoth Module for publishing current user tune"
DESCRIPTION = "This package provides an Azoth plugin which allows to publish \
the current user tune."
LICENSE = "BSL-1.0"

PV = "0.6.70+git.14794.g33744ae6ce"

RPM_NAME = "leechcraft-azoth-xtazy-0.6.70+git.14794.g33744ae6ce-3.1.aarch64.rpm"
RPM_HASH = "0ead60f5da8777d8bd7f6d3ff7f6a73e890729c1b5b007995ff6f4fe4328eac0dbd55df649c7ed1372b9d709b7f644b316dc509968b212bb4094aa5f4ed68e8b"

RPROVIDES:${PN} += "leechcraft-azoth-xtazy \
libleechcraft-azoth-xtazy.so"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
leechcraft-azoth \
leechcraft-xtazy \
libQt5Core.so.5 \
libQt5Widgets.so.5 \
libc.so.6 \
libgcc-s.so.1 \
libleechcraft-util-qt5.so.0.6.75 \
libleechcraft-xsd-qt5.so.0.6.75.2 \
libstdc++.so.6"

inherit rpm
