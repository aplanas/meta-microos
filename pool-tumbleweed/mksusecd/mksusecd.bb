SUMMARY = "Tool to create SUSE Linux installation ISOs"
DESCRIPTION = "This is a tool to create SUSE Linux installation ISOs."
LICENSE = "GPL-3.0+"

PV = "2.12"

RPM_NAME = "mksusecd-2.12-1.1.aarch64.rpm"
RPM_HASH = "66ae1c3738113d9586c7ece44de60e182cc5ac176952ce0674d3eefc077935ed5e342d301796e05620266057c4b3d47554bc3e131f59af38425c179c95c5e20b"

RPROVIDES:${PN} += "mksusecd"

RDEPENDS:${PN} += "/usr/bin/perl \
checkmedia \
createrepo-implementation \
dosfstools \
gpg2 \
libc.so.6 \
libuuid.so.1 \
mkisofs \
mtools \
squashfs \
xz"

inherit rpm
