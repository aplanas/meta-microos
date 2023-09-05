SUMMARY = "A complex camera support library in C++"
DESCRIPTION = "libcamera is an experimental camera user-space API. \
 \
A camera may consist of multiple sensors or function blocks, and can \
expose multiple kernel device nodes in /dev for different stages of \
the pipeline. The libcamera API groups and exposes these pieces as \
what users consider one 'camera'."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "0.1.0"

RPM_NAME = "libcamera0_1-0.1.0-1.1.aarch64.rpm"
RPM_HASH = "7058fd761a4e665c618ec244cd35b46ff6eae6eb75cd76f9b53530d3ba168e4e4710c62e350132a1f81e6fea06817c9af54cc59d27ca6870b07afd3eaa0b0b4c"

RPROVIDES:${PN} += "libcamera.so.0.1 \
libcamera0-1"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libcamera-base.so.0.1 \
libgcc-s.so.1 \
libgnutls.so.30 \
libm.so.6 \
libstdc++.so.6 \
libudev.so.1 \
libyaml-0.so.2"

inherit rpm
