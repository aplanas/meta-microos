SUMMARY = "Utility library used by the authselect tool"
DESCRIPTION = "Common library files for authselect. This package is used by the authselect \
command line tool and any other potential front-ends."
LICENSE = "GPL-3.0-or-later"

PV = "1.4.0+git.0.2c30265"

RPM_NAME = "libauthselect3-1.4.0+git.0.2c30265-3.3.aarch64.rpm"
RPM_HASH = "68902a575ab50585a7970c5ef15f30202e5834071aa0ac606958340d435221fc53a609dbd940c43b9edd9726bc5b98bfd480ec0c606c9352d7d620dd2ff698b2"

RPROVIDES:${PN} += "libauthselect.so.3 \
libauthselect3"

RDEPENDS:${PN} += "/sbin/ldconfig \
authselect-profiles \
ld-linux-aarch64.so.1 \
libc.so.6 \
libselinux.so.1"

inherit rpm
