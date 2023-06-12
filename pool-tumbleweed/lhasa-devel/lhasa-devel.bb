SUMMARY = "Development files for liblhasa, a LHARC decompression library"
DESCRIPTION = "liblhasa is the backend to the Lhasa tool, offering decompressing for \
'.lzh' (LHA/LHarc) and '.lzs' (LArc) archives. \
 \
This package contains the development headers for the library found \
in liblhasa0."
LICENSE = "ISC"

PV = "0.4.0"

RPM_NAME = "lhasa-devel-0.4.0-1.1.aarch64.rpm"
RPM_HASH = "b3f7f8c0c30f18c7a91d0fb5716c030153d7e13e664fb9ac67e9a3ce42d57ca1fcf98e9224c5d7b50f6a057ac34537a469b53d57d2343ff7843e1a67a481cecd"

RPROVIDES:${PN} += "lhasa-devel \
lhasa-devel(aarch-64) \
pkgconfig(liblhasa)"
RDEPENDS:${PN} += "/usr/bin/pkg-config \
liblhasa0"

inherit rpm
