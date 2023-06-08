SUMMARY = "Modplug input plugin for the C* Music Player"
DESCRIPTION = "This package provides modplug (tracker) input support for the C* Music Player."
LICENSE = "GPL-2.0-only"

PV = "2.10.0"

RPM_NAME = "cmus-plugin-modplug-2.10.0-1.8.aarch64.rpm"
RPM_HASH = "cfcb427bd9d85d2ec044801d34c2252de73b846694f8ffcb4e68303bea455f985e4e3f297c56279142d90f3109f341dc39ceac4457ff924a29cf7b42ad5d6ae5"

RPROVIDES:${PN} += "cmus-plugin-modplug cmus-plugin-modplug(aarch-64)"
RDEPENDS:${PN} += "cmus ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.17)(64bit) libmodplug.so.1()(64bit)"

inherit rpm
