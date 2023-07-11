SUMMARY = "Subdivision surface evaluation library"
DESCRIPTION = "OpenSubdiv is a set of libraries that implement subdivision surface \
(subdiv) evaluation on massively parallel CPU and GPU architectures. \
This code path is optimized for drawing deforming surfaces with \
static topology at interactive framerates. \
 \
OpenSubdiv is an API for use by 3rd party digital content creation \
tools. It is not an application, nor a tool that can be used directly \
to create digital assets."
LICENSE = "Apache-2.0"

PV = "3.4.4"

RPM_NAME = "libosdCPU3_4_4-3.4.4-1.9.aarch64.rpm"
RPM_HASH = "1c3072dd8d603e94ab264775f006125d8f8db37c99adb2be8dfc959f80a3f1110a61f9913a247f219543021a3033a93e3c9f4385f7f8e468ad07fe7108637a4e"

RPROVIDES:${PN} += "libosdCPU.so.3.4.4 \
libosdCPU3-4-4 \
libosdGPU.so.3.4.4"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libgomp.so.1 \
libm.so.6 \
libstdc++.so.6 \
libtbb.so.12"

inherit rpm
