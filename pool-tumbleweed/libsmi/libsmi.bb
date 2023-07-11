SUMMARY = "A Library to Access SMI MIB Information"
DESCRIPTION = "The purpose of libsmi is to \
 \
* Give network management applications a concise programmer-friendly \
   interface to access MIB module information \
 \
* Separate the knowledge on SMI from the main parts of management \
   applications \
 \
* Allow addition of new kinds of MIB repositories without the need to \
adapt applications that make use of libsmi"
LICENSE = "MIT"

PV = "0.4.8"

RPM_NAME = "libsmi-0.4.8-25.8.aarch64.rpm"
RPM_HASH = "dcabf3a230ae99ad2ec2ddfaaac6f58a9ca4672bd0108994bc775194ed935a2be650e174befab3455e71297e0f7e94febbd986058e8118fd8f06bb5f5a85d380"

RPROVIDES:${PN} += "libsmi"

RDEPENDS:${PN} += "/usr/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6 \
libm.so.6 \
libsmi.so.2"

inherit rpm
