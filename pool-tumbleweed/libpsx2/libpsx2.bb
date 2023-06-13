SUMMARY = "Library for Capabilities (linux-privs) Support"
DESCRIPTION = "Capabilities are a measure to limit the omnipotence of the superuser. \
Currently a program started by root or setuid root has the power to do \
anything. Capabilities (Linux-Privs) provide a more fine-grained access \
control. Without kernel patches, you can use this library to drop \
capabilities within setuid binaries. If you use patches, this can be \
done automatically by the kernel."
LICENSE = "BSD-3-Clause | GPL-2.0-only"

PV = "2.69"

RPM_NAME = "libpsx2-2.69-1.1.aarch64.rpm"
RPM_HASH = "563dde1014bd7251ecab4dfa70e342cf50ba216bb506d99bda2688b4528afe8587ccc99f57e819992bfbbb08fca609a15e394e016240e947f5964661a50e259f"

RPROVIDES:${PN} += "libpsx.so.2()(64bit) \
libpsx2 \
libpsx2(aarch-64)"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.34)(64bit)"

inherit rpm
