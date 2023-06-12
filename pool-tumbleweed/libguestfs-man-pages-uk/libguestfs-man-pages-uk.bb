SUMMARY = "Ukrainian (uk) man pages for libguestfs"
DESCRIPTION = "libguestfs-man-pages-uk contains Ukrainian (uk) man pages \
for libguestfs."
LICENSE = "GPL-2.0-or-later"

PV = "1.50.1"

RPM_NAME = "libguestfs-man-pages-uk-1.50.1-3.1.noarch.rpm"
RPM_HASH = "1cf94308f6fa20624fd1b5c07f8b9e95285581a4360f2dfd2f0987884c3d218864ac78ee8272afe0a3c5e241687a7170deef4a75949ff86e7a8b32eb8c2723a2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libguestfs-man-pages-uk"
RDEPENDS:${PN} += "libguestfs"

inherit rpm
