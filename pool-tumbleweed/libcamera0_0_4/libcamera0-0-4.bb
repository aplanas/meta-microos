SUMMARY = "A complex camera support library in C++"
DESCRIPTION = "libcamera is an experimental camera user-space API. \
 \
A camera may consist of multiple sensors or function blocks, and can \
expose multiple kernel device nodes in /dev for different stages of \
the pipeline. The libcamera API groups and exposes these pieces as \
what users consider one 'camera'."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "0.0.4"

RPM_NAME = "libcamera0_0_4-0.0.4-2.3.aarch64.rpm"
RPM_HASH = "5c306dd5e4ef7c8cdb13ff22447402c6b4076dacfcd5582fb14f653188de46089219400b8055bce092511ad909f97cec34a8e0db65e40c2e86f701a9800a4aaa"

RPROVIDES:${PN} += "libcamera.so.0.0.4 \
libcamera0-0-4"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libcamera-base.so.0.0.4 \
libgcc-s.so.1 \
libgnutls.so.30 \
libm.so.6 \
libstdc++.so.6 \
libudev.so.1 \
libyaml-0.so.2"

inherit rpm
