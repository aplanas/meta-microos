SUMMARY = "Unicode/Charset conversion library for twin"
DESCRIPTION = "Unicode <-> charset conversion routines for twin."
LICENSE = "GPL-2.0-or-later & LGPL-2.0-or-later"

PV = "0.9.0+17"

RPM_NAME = "libtutf-devel-0.9.0+17-3.6.aarch64.rpm"
RPM_HASH = "17a786456b9dde0307272603eff78cc014323531cddf823a6a24f6a38b83a072dd26e5cabf3baa7ade4d180338c619dd755a56205b2ba26b44ff3af518926f00"

RPROVIDES:${PN} += "libTutf-devel \
libtutf-devel"

RDEPENDS:${PN} += "libtutf1"

inherit rpm
