SUMMARY = "Static library for libfallocate"
DESCRIPTION = "This package contains the static library for apps \
apps that want to use libfallocate statically."
LICENSE = "LGPL-2.1-or-later"

PV = "0.1.1"

RPM_NAME = "libfallocate-devel-static-0.1.1-17.15.aarch64.rpm"
RPM_HASH = "c25a21d23f7c8455d5d3d0774e6bfb0ddda37752e97d4bdb2235f570ad771f9bc62a0d5c50dd7ddd845fbdaa6724fe90ea9c7d7d5f594effd81acd67afbb9854"

RPROVIDES:${PN} += "libfallocate-devel-static \
libfallocate-devel-static(aarch-64)"
RDEPENDS:${PN} += "libfallocate-devel"

inherit rpm
