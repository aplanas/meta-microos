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

PV = "1.9.5"

RPM_NAME = "kdump-1.9.5-1.1.aarch64.rpm"
RPM_HASH = "bb2c9e30d349e6d484b9123e3b9a3113f121dedcd7fecae6b08b4af39335ae3eadd4f4b2d691fc9906a7dc51d908be0150cc03f5e6dca4f93012a935c8262347"

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
