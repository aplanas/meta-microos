SUMMARY = "Ruby interface for libapparmor functions"
DESCRIPTION = "This package provides the ruby interface to AppArmor. It is used for ruby \
applications interfacing with AppArmor."
LICENSE = "GPL-2.0-only & LGPL-2.1-or-later"

PV = "3.1.6"

RPM_NAME = "ruby-apparmor-3.1.6-4.1.aarch64.rpm"
RPM_HASH = "49d4fcd3cdc0d975bfe502ab171d77513744c249b6a79a5676a37824756a48e8324191f7fc4ebb0d380dd725cada373bae8110db82c97320b25c3d283e11011f"

RPROVIDES:${PN} += "ruby-apparmor \
ruby-libapparmor"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libapparmor.so.1 \
libapparmor1 \
libc.so.6 \
libm.so.6 \
libruby3.2.so.3.2 \
ruby"

inherit rpm
