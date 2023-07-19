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

RPM_NAME = "libguestfs-inspect-icons-1.50.1-4.1.noarch.rpm"
RPM_HASH = "632ef7c6061ce798a1d5a39ab1b3f1b741e3685fc5d7ccc81cede44961c3109ea2d1dddbdcbb50e126becef246883bdd3bcb4fb39b0fcea3067e3dde193c4add"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libguestfs-inspect-icons"

RDEPENDS:${PN} += "icoutils \
libguestfs"

inherit rpm
