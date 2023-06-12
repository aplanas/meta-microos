SUMMARY = "Development files for libt3key, a terminal key sequence db library"
DESCRIPTION = "libt3key is library that provides a database of mappings from escape \
sequences as generated by different consoles and terminals or \
emulators, to key symbols. \
 \
This subpackage contains libraries and header files for developing \
applications that want to make use of libt3key."
LICENSE = "GPL-3.0-only"

PV = "0.2.10"

RPM_NAME = "libt3key-devel-0.2.10-1.14.aarch64.rpm"
RPM_HASH = "9f8ffe0c55c2926fa39aa6b298b791fe5e1dc6c7581783e9c9e62517da37f82176a8acd5b60ca4188c18e897db065fc2bde02cd1cd327a6e61fd2d1ebf397359"

RPROVIDES:${PN} += "libt3key-devel \
libt3key-devel(aarch-64) \
pkgconfig(libt3key)"
RDEPENDS:${PN} += "/usr/bin/pkg-config \
libt3key1 \
pkgconfig(libt3config) \
pkgconfig(tinfo)"

inherit rpm