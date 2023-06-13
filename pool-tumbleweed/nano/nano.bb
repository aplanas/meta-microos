SUMMARY = "Pico editor clone with enhancements"
DESCRIPTION = "GNU nano is a small and friendly text editor. It aims to emulate \
the Pico text editor while also offering a few enhancements."
LICENSE = "GPL-3.0-or-later"

PV = "7.2"

RPM_NAME = "nano-7.2-1.3.aarch64.rpm"
RPM_HASH = "c32c9494e151ba2d4fd9de594a88e5e1c2a34616087c4688c2293edc506cb4fba1c988f2724e1b1430a09bb74399ffa1269a1058ec8edf8ca7b9b8e789713cc3"

RPROVIDES:${PN} += "config(nano) \
nano \
nano(aarch-64)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
libc.so.6()(64bit) \
libmagic.so.1()(64bit) \
libncursesw.so.6()(64bit) \
libtinfo.so.6()(64bit)"

inherit rpm
