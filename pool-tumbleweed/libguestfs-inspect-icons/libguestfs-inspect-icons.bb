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

RPM_NAME = "libguestfs-inspect-icons-1.50.1-3.3.noarch.rpm"
RPM_HASH = "9fa6be7526938bd74c88092a8979121f2a581e3d1c54b9100d28d7a1c5c4bc23aa7036578bcc02d031c7af62fb37187fc0ae9564bb40fa106e9c7a93f1ac09ea"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libguestfs-inspect-icons"

RDEPENDS:${PN} += "icoutils \
libguestfs"

inherit rpm
