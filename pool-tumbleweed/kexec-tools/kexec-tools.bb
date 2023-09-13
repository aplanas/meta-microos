SUMMARY = "Tools for loading replacement kernels into memory"
DESCRIPTION = "Kexec is a user space utility for loading another kernel and asking the \
currently running kernel to do something with it. A currently running \
kernel may be asked to start the loaded kernel on reboot, or to start \
the loaded kernel after it panics."
LICENSE = "GPL-2.0-or-later"

PV = "2.0.27"

RPM_NAME = "kexec-tools-2.0.27-1.1.aarch64.rpm"
RPM_HASH = "5dfe9a0e1a1cfc37aeadf76cfe5990272d17b3f082c60c2841154f9ed03bff9dd2c026710f46b077298e2c7bb944405332bb4e8e3b3c1bb90f68cb3edc15c3ca"

RPROVIDES:${PN} += "kexec-tools"

RDEPENDS:${PN} += "/usr/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6 \
libz.so.1 \
perl-Bootloader \
suse-module-tools \
systemd"

inherit rpm
