SUMMARY = "UDisks module for LSM"
DESCRIPTION = "This package contains the UDisks module for LSM support."
LICENSE = "GPL-2.0-or-later"

PV = "2.9.4"

RPM_NAME = "libudisks2-0_lsm-2.9.4-6.4.aarch64.rpm"
RPM_HASH = "d4808df2861c0376343068eef7561aa89171ab9c8d13657dc1272246412a6cff0eb1d7758e2555298e89e2d2883664370bdef870adbbc5b1bfb7c171f94cbe92"

RPROVIDES:${PN} += "config-libudisks2-0-lsm \
libudisks2-0-lsm \
libudisks2-lsm.so"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libconfig.so.11 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgudev-1.0.so.0 \
libstoragemgmt \
libstoragemgmt.so.1 \
libudisks2-0"

inherit rpm
