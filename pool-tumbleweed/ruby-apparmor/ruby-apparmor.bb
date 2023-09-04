SUMMARY = "Ruby interface for libapparmor functions"
DESCRIPTION = "This package provides the ruby interface to AppArmor. It is used for ruby \
applications interfacing with AppArmor."
LICENSE = "GPL-2.0-only & LGPL-2.1-or-later"

PV = "3.1.6"

RPM_NAME = "ruby-apparmor-3.1.6-2.2.aarch64.rpm"
RPM_HASH = "a106b96b0bac36de0a9aee6b2323df66ca86dfcc014b92943f226882770659145eb0158e37cf30259cfe9344097a9992c81d04a79f69673e9f489994789dcd34"

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
