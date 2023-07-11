SUMMARY = "Static library for libfallocate"
DESCRIPTION = "This package contains the static library for apps \
apps that want to use libfallocate statically."
LICENSE = "LGPL-2.1-or-later"

PV = "0.1.1"

RPM_NAME = "libfallocate-devel-static-0.1.1-17.16.aarch64.rpm"
RPM_HASH = "0252488541514e380f889a636111ea7da6f7fbca333d04e7938a90c4be82a37087d5f787f062f46874ac2826ef712f2a59281d336deb6da5e4b458de5380ba54"

RPROVIDES:${PN} += "libfallocate-devel-static"

RDEPENDS:${PN} += "libfallocate-devel"

inherit rpm
