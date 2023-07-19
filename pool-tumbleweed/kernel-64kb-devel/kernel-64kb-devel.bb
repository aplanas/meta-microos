SUMMARY = "Development files necessary for building kernel modules"
DESCRIPTION = "This package contains files necessary for building kernel modules (and \
kernel module packages) against the 64kb flavor of the kernel. \
 \
 \
Source Timestamp: 2023-07-11 06:23:11 +0000 \
GIT Revision: 5ab030f1f07fd96746960bce337ec62fc11b6a9a \
GIT Branch: stable"
LICENSE = "GPL-2.0-only"

PV = "6.4.3"

RPM_NAME = "kernel-64kb-devel-6.4.3-1.1.aarch64.rpm"
RPM_HASH = "2557eeb0ebdd51b06d638233ac35d8e3e895079f0cff1643365be2095d52030bec943bcbabef0a6228022f41dff6d91b223b97e0de1ce1c93cfe9d48d4663ee5"

RPROVIDES:${PN} += "kernel-64kb-devel \
multiversion-kernel"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
dwarves \
jq \
kernel-devel \
libc.so.6 \
libcrypto.so.3 \
libelf-devel \
libelf.so.1"

inherit rpm
