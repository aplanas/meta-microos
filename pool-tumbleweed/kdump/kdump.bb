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

PV = "1.0.2+git50.g4b01402"

RPM_NAME = "kdump-1.0.2+git50.g4b01402-1.3.aarch64.rpm"
RPM_HASH = "36183fb14281b31341156e54f1881a9871475d4ab4ef03bfea1224c41e230406459b471408774f43f493b37d8d15bb6fee673212a7802123612a2d4ffa74fee6"

RPROVIDES:${PN} += "kdump \
kdump(aarch-64) \
kexec-tools:/etc/init.d/kdump"

RDEPENDS:${PN} += "/bin/bash \
/bin/sh \
/usr/bin/mkdir \
/usr/bin/rm \
/usr/bin/sed \
/usr/bin/touch \
curl \
dracut \
fillup \
kexec-tools \
ld-linux-aarch64.so.1()(64bit) \
libblkid.so.1()(64bit) \
libc.so.6()(64bit) \
libcurl.so.4()(64bit) \
libelf.so.1()(64bit) \
libesmtp.so.6.2.0()(64bit) \
libgcc_s.so.1()(64bit) \
libmount.so.1()(64bit) \
libstdc++.so.6()(64bit) \
libz.so.1()(64bit) \
makedumpfile \
openssh"

inherit rpm
