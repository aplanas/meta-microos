SUMMARY = "The GNU Compiler Atomic Operations Runtime Library"
DESCRIPTION = "The runtime library for atomic operations of the GNU Compiler Collection (GCC)."
LICENSE = "GPL-3.0-or-later-with-GCC-exception-3.1"

PV = "13.1.1+git7597"

RPM_NAME = "libatomic1-13.1.1+git7597-1.1.aarch64.rpm"
RPM_HASH = "151f19e1b13e5ae24afd03016d5229100f1abe52a90ee1752963efb7fa2871420cc1acd74826097f5163146c4fba3a43515d793c7abf3c0d862afbb59272581e"

RPROVIDES:${PN} += "libatomic.so.1 \
libatomic1"

RDEPENDS:${PN} += "/sbin/ldconfig \
libc.so.6"

inherit rpm
