SUMMARY = "Tools for loading replacement kernels into memory"
DESCRIPTION = "Kexec is a user space utility for loading another kernel and asking the \
currently running kernel to do something with it. A currently running \
kernel may be asked to start the loaded kernel on reboot, or to start \
the loaded kernel after it panics."
LICENSE = "GPL-2.0-or-later"

PV = "2.0.26.0"

RPM_NAME = "kexec-tools-2.0.26.0-1.1.aarch64.rpm"
RPM_HASH = "3ba5efe2ae1749e4cfc8c322c067e1bf41bd9bc151ca292618f169ca3d86fb90e1fc170e3a589c77bf32076073bca3cdc6d5a5ab4b07508f65e50f85258df9ce"

RPROVIDES:${PN} += "kexec-tools"

RDEPENDS:${PN} += "/usr/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6 \
libz.so.1 \
perl-Bootloader \
suse-module-tools \
systemd"

inherit rpm
