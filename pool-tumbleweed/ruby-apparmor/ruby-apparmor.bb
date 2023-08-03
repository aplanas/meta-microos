SUMMARY = "Ruby interface for libapparmor functions"
DESCRIPTION = "This package provides the ruby interface to AppArmor. It is used for ruby \
applications interfacing with AppArmor."
LICENSE = "GPL-2.0-only & LGPL-2.1-or-later"

PV = "3.1.6"

RPM_NAME = "ruby-apparmor-3.1.6-2.1.aarch64.rpm"
RPM_HASH = "169796e0a276ced257502c3f7cfd5e2adabc16d63538dd443a28f517717460d1d58d36c7464c0755000b341efdad96d2316cead4346d4a0a6ac091edaaa197f1"

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
