SUMMARY = "Libsmi Shared Libraries"
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

RPM_NAME = "libsmi2-0.4.8-25.8.aarch64.rpm"
RPM_HASH = "df87d91e0a28409d26fffd4c4be51be78209bf693ab864ee52da85083bd7d4abd9c13301665721147e637f12e8c6493f6936ae02fb7565e533d48491638d5768"

RPROVIDES:${PN} += "libsmi.so.2 \
libsmi2"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libsmi"

inherit rpm
