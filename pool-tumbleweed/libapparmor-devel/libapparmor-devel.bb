SUMMARY = "Development headers and libraries for libapparmor"
DESCRIPTION = "These libraries are needed for developing software that makes use of the \
AppArmor API."
LICENSE = "LGPL-2.1-or-later"

PV = "3.1.6"

RPM_NAME = "libapparmor-devel-3.1.6-2.1.aarch64.rpm"
RPM_HASH = "9d0df55b1a2b86aa77efdce02826630e265abe910261969d9bf592fa43991dda0ff72e954b5955d6e58bdda36217369d58761b618bf09212d90f89c35650a6a9"

RPROVIDES:${PN} += "libapparmor-/usr/include/sys/apparmor.h \
libapparmor-devel \
pkgconfig-libapparmor"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libapparmor1"

inherit rpm
