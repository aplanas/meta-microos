SUMMARY = "Development files for ecryptfs-utils"
DESCRIPTION = "A stacked cryptographic filesystem for Linux."
LICENSE = "GPL-2.0-only"

PV = "111"

RPM_NAME = "ecryptfs-utils-devel-111-7.5.aarch64.rpm"
RPM_HASH = "6289a2277716e6b79dc2235bef710a80b5b611af0d38c611026b7eb85f2a51ef40c1378ec486b4fbe68396bbd6a81e587765e875c9e262b49ca1b80ed0d353f2"

RPROVIDES:${PN} += "ecryptfs-utils-devel \
pkgconfig-libecryptfs"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libecryptfs1"

inherit rpm
