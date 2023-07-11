SUMMARY = "Introspection bindings for the LibBlockDev library"
DESCRIPTION = "This package provides the GObject Introspection bindings for LibBlockDev, which \
provides low-level manipulation of block devices."
LICENSE = "LGPL-2.1-only"

PV = "2.28"

RPM_NAME = "typelib-1_0-BlockDev-2_0-2.28-1.6.aarch64.rpm"
RPM_HASH = "75edf408327a75f6c8f95a75e26c60edf8c79cf8ba65d7ad56a150f069fc0d6cffa96ebdb0a6a511457c8a5dc283a0328c0e786252bc09944520f70d92137995"

RPROVIDES:${PN} += "typelib-1-0-BlockDev-2-0 \
typelib-BlockDev"

RDEPENDS:${PN} += "libbd-utils.so.2 \
libblockdev.so.2 \
typelib-GLib \
typelib-GObject \
typelib-Gio"

inherit rpm
