SUMMARY = "Ruby bindings for the SELinux runtime library"
DESCRIPTION = "libselinux provides an interface to get and set process and file \
security contexts and to obtain security policy decisions. \
 \
This subpackage contains Ruby extensions to use SELinux from that \
language."
LICENSE = "SUSE-Public-Domain"

PV = "3.5"

RPM_NAME = "ruby-selinux-3.5-4.1.aarch64.rpm"
RPM_HASH = "46993b3f4cf15bfde67291e3e4e525b75d280fe3638fa14105ad8d3055c7dbf155f1771f204e34a4cd103211110aee61332e7e65b2757c2e0114a91ef3a1b6e9"

RPROVIDES:${PN} += "ruby-selinux"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libruby3.2.so.3.2 \
libselinux.so.1 \
libselinux1 \
ruby"

inherit rpm
