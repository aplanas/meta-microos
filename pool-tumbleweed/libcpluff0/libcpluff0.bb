SUMMARY = "A plug-in framework for C"
DESCRIPTION = "C-Pluff is a plug-in framework for C programs."
LICENSE = "MIT"

PV = "0.2.0"

RPM_NAME = "libcpluff0-0.2.0-2.9.aarch64.rpm"
RPM_HASH = "bede0c57c0e63a7817c7adabb88181fd7cdbff12e3ad11216659dd9a78574c8c630e67a709b7ad83bb58f37d24f9c220f4aa40d4e7df901d40324a20104828f7"

RPROVIDES:${PN} += "libcpluff.so.0 \
libcpluff0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libexpat.so.1"

inherit rpm
