SUMMARY = "Utilities for analysing and setting file capabilities"
DESCRIPTION = "The libcap-ng-utils package contains applications to analyse the \
Linux process capabilities of programs running on a system. It also \
lets you set the filesystem-based capabilities."
LICENSE = "GPL-2.0-or-later"

PV = "0.8.3"

RPM_NAME = "libcap-ng-utils-0.8.3-2.1.aarch64.rpm"
RPM_HASH = "d2123e64a81cb7ad78bb2d287eb3c29cddcdd16a9b3f9f99aa3ae49326caffd7bf45179a2270a075f279e395519e74544dd98373718648536b1eb3cd381bec2e"

RPROVIDES:${PN} += "libcap-ng-utils"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libcap-ng.so.0"

inherit rpm
