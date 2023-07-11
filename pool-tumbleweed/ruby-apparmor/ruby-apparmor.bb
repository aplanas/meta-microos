SUMMARY = "Ruby interface for libapparmor functions"
DESCRIPTION = "This package provides the ruby interface to AppArmor. It is used for ruby \
applications interfacing with AppArmor."
LICENSE = "GPL-2.0-only & LGPL-2.1-or-later"

PV = "3.1.6"

RPM_NAME = "ruby-apparmor-3.1.6-1.1.aarch64.rpm"
RPM_HASH = "4acdb92b41ec10f8a00090253404a1bf6cb565e352e84e5ecc2c1b901b8512c1cf27beb444c0374ca2145a9cdc951cbf20a5a40a61d1b8d18aecf1339038e96b"

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
