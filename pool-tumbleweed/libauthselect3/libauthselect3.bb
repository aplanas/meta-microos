SUMMARY = "Utility library used by the authselect tool"
DESCRIPTION = "Common library files for authselect. This package is used by the authselect \
command line tool and any other potential front-ends."
LICENSE = "GPL-3.0-or-later"

PV = "1.4.0+git.0.2c30265"

RPM_NAME = "libauthselect3-1.4.0+git.0.2c30265-3.2.aarch64.rpm"
RPM_HASH = "bd71328048150724ab83875a3d0e4a32c3c5078cd5f05b9b3db49c906078802cc4ffa006b6a775f7e095f6a2791c78f30a264519115e8d18977c55df154ad29c"

RPROVIDES:${PN} += "libauthselect.so.3()(64bit) \
libauthselect.so.3(AUTHSELECT_1.0.1)(64bit) \
libauthselect.so.3(AUTHSELECT_1.0.2)(64bit) \
libauthselect.so.3(AUTHSELECT_1.0.3)(64bit) \
libauthselect.so.3(AUTHSELECT_1.1.0)(64bit) \
libauthselect.so.3(AUTHSELECT_1.2.3)(64bit) \
libauthselect3 \
libauthselect3(aarch-64)"

RDEPENDS:${PN} += "/sbin/ldconfig \
authselect-profiles \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.33)(64bit) \
libselinux.so.1()(64bit) \
libselinux.so.1(LIBSELINUX_1.0)(64bit)"

inherit rpm
