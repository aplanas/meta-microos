SUMMARY = "Development files for libnitrokey"
DESCRIPTION = "Libnitrokey is a project to communicate with Nitrokey Pro and Storage devices \
in a clean and easy manner. \
 \
This package holds the development files."
LICENSE = "LGPL-3.0-only"

PV = "3.8"

RPM_NAME = "libnitrokey-devel-3.8-1.3.aarch64.rpm"
RPM_HASH = "b51fc859097f5dc2fd21fe445be9fc9631fe2866b334eb845836a13f1761ff84a3b54b3459c1e2e5b6be84642f9a16f40a1cd5c3d8d01b7b6830fbe86b949b73"

RPROVIDES:${PN} += "libnitrokey-devel \
libnitrokey-devel(aarch-64) \
pkgconfig(libnitrokey-1)"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libnitrokey3 \
pkgconfig(hidapi-libusb)"

inherit rpm
