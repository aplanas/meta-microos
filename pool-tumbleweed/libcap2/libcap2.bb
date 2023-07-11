SUMMARY = "Library for Capabilities (linux-privs) Support"
DESCRIPTION = "Capabilities are a measure to limit the omnipotence of the superuser. \
Currently a program started by root or setuid root has the power to do \
anything. Capabilities (Linux-Privs) provide a more fine-grained access \
control. Without kernel patches, you can use this library to drop \
capabilities within setuid binaries. If you use patches, this can be \
done automatically by the kernel."
LICENSE = "BSD-3-Clause | GPL-2.0-only"

PV = "2.69"

RPM_NAME = "libcap2-2.69-1.2.aarch64.rpm"
RPM_HASH = "1f674a81f2e3d92caaec7e547c7e89a1bcb568a069d9bfc81def5f83c98f1ac1f050a44d37a0f007917fab640ceba3a22737d2b8358bd520dd80e3a465113d31"

RPROVIDES:${PN} += "libcap.so.2 \
libcap2"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm
