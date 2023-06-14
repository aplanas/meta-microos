SUMMARY = "Tools for loading replacement kernels into memory"
DESCRIPTION = "Kexec is a user space utility for loading another kernel and asking the \
currently running kernel to do something with it. A currently running \
kernel may be asked to start the loaded kernel on reboot, or to start \
the loaded kernel after it panics."
LICENSE = "GPL-2.0-or-later"

PV = "2.0.26"

RPM_NAME = "kexec-tools-2.0.26-3.1.aarch64.rpm"
RPM_HASH = "6c25b94053f9a120f115d976c25b0dd7f3f26d1e1632c3dcc06895d97fefbd18a0cf73028eb1ce4123dfd26ab9ad2803629436906ec2b90d9bcbc5c97f4c30ac"

RPROVIDES:${PN} += "kexec-tools"

RDEPENDS:${PN} += "/bin/sh \
/usr/bin/perl \
ld-linux-aarch64.so.1 \
libc.so.6 \
libz.so.1 \
perl-Bootloader \
suse-module-tools \
systemd"

inherit rpm
