SUMMARY = "Kernel crash dump scripts and utilities"
DESCRIPTION = "kdump is a package that includes several scripts for kdump, including \
the kdump service and configuration files \
 \
The kernel package and this package are all that are required for a \
crash dump to occur. However, if you wish to debug the crash dump \
yourself you will need several debugging packages installed for each \
kernel flavor and release you wish to debug. \
 \
For example, if you are debugging kernel-default, you will need: \
- kernel-default-debuginfo \
- kernel-default-devel \
- kernel-default-devel-debuginfo \
 \
These packages are not needed to create the dump and can be installed \
after a crash dump has occured."
LICENSE = "GPL-2.0-or-later"

PV = "1.9.3"

RPM_NAME = "kdump-1.9.3-1.1.aarch64.rpm"
RPM_HASH = "6b4c439dfa4eea9461a1a67aa56dcb87a675aaa5c2a3dcbe1714de7471790087f2b2012c1fb35876efeb239b4524e40010b01c92ec8ea49754626e82da91b4be"

RPROVIDES:${PN} += "kdump \
kexec-tools-/etc/init.d/kdump"

RDEPENDS:${PN} += "/usr/bin/bash \
/usr/bin/mkdir \
/usr/bin/rm \
/usr/bin/sed \
/usr/bin/sh \
/usr/bin/touch \
dracut \
fillup \
kexec-tools \
ld-linux-aarch64.so.1 \
libblkid.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6 \
makedumpfile"

inherit rpm
