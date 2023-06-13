SUMMARY = "Ruby bindings for the SELinux runtime library"
DESCRIPTION = "libselinux provides an interface to get and set process and file \
security contexts and to obtain security policy decisions. \
 \
This subpackage contains Ruby extensions to use SELinux from that \
language."
LICENSE = "SUSE-Public-Domain"

PV = "3.5"

RPM_NAME = "ruby-selinux-3.5-2.1.aarch64.rpm"
RPM_HASH = "90de4f1bd73ca4c6b53618bb34ea5b48e8e1bfa6fa6d3f26ff645684153e1c9d245021e59b1f0b0b327b86180901c7dbf8fce9a2d5dd7b252d0c1bdfc3fd089d"

RPROVIDES:${PN} += "ruby-selinux \
ruby-selinux(aarch-64)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
libc.so.6()(64bit) \
libruby3.2.so.3.2()(64bit) \
libselinux.so.1()(64bit) \
libselinux1 \
ruby"

inherit rpm
