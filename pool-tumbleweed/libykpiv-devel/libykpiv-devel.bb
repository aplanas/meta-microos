SUMMARY = "Development files for the Yubikey NEO PIV applet library"
DESCRIPTION = "This package contains the header file needed to develop applications that use \
Yubikey NEO PIV applet library."
LICENSE = "BSD-2-Clause"

PV = "2.3.1"

RPM_NAME = "libykpiv-devel-2.3.1-1.2.aarch64.rpm"
RPM_HASH = "a1252ed94a224064a1cdbf9310b4ed0a219e10861f769c1f72c9192c24f30d71a51d874a3227e685ae335beef829f783daf41047dc3c021b4f8628469da297f3"

RPROVIDES:${PN} += "libykpiv-devel \
libykpiv-devel(aarch-64) \
pkgconfig(ykpiv)"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libykpiv2 \
pkgconfig(libcrypto)"

inherit rpm
