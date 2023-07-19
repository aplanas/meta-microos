SUMMARY = "Tool to create SUSE Linux installation ISOs"
DESCRIPTION = "This is a tool to create SUSE Linux installation ISOs."
LICENSE = "GPL-3.0+"

PV = "2.11"

RPM_NAME = "mksusecd-2.11-1.1.aarch64.rpm"
RPM_HASH = "75dd0d8973d6727a508580cdeead98a677b48f37fa3e216cc6c70653e01a3b2b91bf66468a6185aebefac944059ae7fe810a0e85a2fb75501e9653dd27ee58e7"

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
