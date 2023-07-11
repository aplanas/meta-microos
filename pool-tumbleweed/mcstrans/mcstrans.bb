SUMMARY = "SELinux Translation Daemon"
DESCRIPTION = "Security-enhanced Linux is a feature of the Linux kernel and a number \
of utilities with enhanced security functionality designed to add \
mandatory access controls to Linux.  The Security-enhanced Linux \
kernel contains new architectural components originally developed to \
improve the security of the Flask operating system. These \
architectural components provide general support for the enforcement \
of many kinds of mandatory access control policies, including those \
based on the concepts of Type Enforcement, Role-based Access \
Control, and Multi-level Security. \
 \
mcstrans provides a translation daemon to translate SELinux categories \
from internal representations to user defined representation."
LICENSE = "GPL-2.0-or-later"

PV = "3.5"

RPM_NAME = "mcstrans-3.5-1.4.aarch64.rpm"
RPM_HASH = "ab752ac473ac9988b63b4d1873cce77a4febd413bea9f8bbd7a4dce10f37a7d7b9e329a8e9285804efb9489d9a1011925522002e1ea00130e41c233d6906c55b"

RPROVIDES:${PN} += "mcstrans \
setransd"

RDEPENDS:${PN} += "/usr/bin/sh \
aaa-base \
ld-linux-aarch64.so.1 \
libc.so.6 \
libcap.so.2 \
libpcre2-8.so.0 \
libselinux.so.1 \
systemd"

inherit rpm
