SUMMARY = "Library for Capabilities (linux-privs) Support"
DESCRIPTION = "Capabilities are a measure to limit the omnipotence of the superuser. \
Currently a program started by root or setuid root has the power to do \
anything. Capabilities (Linux-Privs) provide a more fine-grained access \
control. Without kernel patches, you can use this library to drop \
capabilities within setuid binaries. If you use patches, this can be \
done automatically by the kernel."
LICENSE = "BSD-3-Clause | GPL-2.0-only"

PV = "2.69"

RPM_NAME = "libcap2-2.69-1.1.aarch64.rpm"
RPM_HASH = "56a0d4f4616baf6836d86fcae1fa2dc55d0ecc06cb024dfadedb0843e49f9e2af703b87b6ad941fed6cb40f4397c651e1069406222c0ac9449ad90e148c84dd6"

RPROVIDES:${PN} += "libcap.so.2()(64bit) \
libcap2 \
libcap2(aarch-64)"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.33)(64bit)"

inherit rpm
