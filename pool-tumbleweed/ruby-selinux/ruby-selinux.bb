SUMMARY = "Ruby bindings for the SELinux runtime library"
DESCRIPTION = "libselinux provides an interface to get and set process and file \
security contexts and to obtain security policy decisions. \
 \
This subpackage contains Ruby extensions to use SELinux from that \
language."
LICENSE = "SUSE-Public-Domain"

PV = "3.5"

RPM_NAME = "ruby-selinux-3.5-3.2.aarch64.rpm"
RPM_HASH = "fef53038e53ae5a054dc317f50029bd0ed647ef65f7f6bf032d3dd8c92ee5d42e052385a4e57e25c1eadc591379bcc1eae4cfb4382c8f4dcbf5fa4275a88186b"

RPROVIDES:${PN} += "ruby-selinux"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libruby3.2.so.3.2 \
libselinux.so.1 \
libselinux1 \
ruby"

inherit rpm
