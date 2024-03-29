SUMMARY = "Additional dependencies for inspecting guest icons"
DESCRIPTION = "libguestfs-inspect-icons is a metapackage that pulls in additional \
dependencies required by libguestfs to pull icons out of non-Linux \
guests.  Install this package if you want libguestfs to be able to \
inspect non-Linux guests and display icons from them. \
 \
The only reason this is a separate package is to avoid core libguestfs \
having to depend on Perl."
LICENSE = "GPL-2.0-or-later"

PV = "1.50.1"

RPM_NAME = "libguestfs-inspect-icons-1.50.1-4.2.noarch.rpm"
RPM_HASH = "e8512826784aeb75170f6e62eacec57791d40e7366989577319232ccdcefddf94976d9da8a4bc696636cb10f64ba246e4606075da40bbd5bc0ed89748eaa22b5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libguestfs-inspect-icons"

RDEPENDS:${PN} += "icoutils \
libguestfs"

inherit rpm
