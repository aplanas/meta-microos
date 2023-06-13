SUMMARY = "Ruby interface for libapparmor functions"
DESCRIPTION = "This package provides the ruby interface to AppArmor. It is used for ruby \
applications interfacing with AppArmor."
LICENSE = "GPL-2.0-only & LGPL-2.1-or-later"

PV = "3.1.4"

RPM_NAME = "ruby-apparmor-3.1.4-1.1.aarch64.rpm"
RPM_HASH = "f02587b0763dac6c337ed3f2845b192df084e8bf7594be218f7a36badec64672523039eefc379db8e8ede3f026cde3c0dc0fa0f6b5ad4db6f8acef32a3154dfe"

RPROVIDES:${PN} += "ruby-apparmor \
ruby-apparmor(aarch-64) \
ruby-libapparmor"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libapparmor.so.1()(64bit) \
libapparmor.so.1(APPARMOR_1.0)(64bit) \
libapparmor.so.1(APPARMOR_1.1)(64bit) \
libapparmor.so.1(APPARMOR_2.10)(64bit) \
libapparmor.so.1(APPARMOR_2.11)(64bit) \
libapparmor.so.1(APPARMOR_2.9)(64bit) \
libapparmor.so.1(PRIVATE)(64bit) \
libapparmor1 \
libc.so.6(GLIBC_2.17)(64bit) \
libm.so.6()(64bit) \
libruby3.2.so.3.2()(64bit) \
ruby"

inherit rpm
