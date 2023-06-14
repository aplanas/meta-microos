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

RPM_NAME = "libosdCPU3_4_4-3.4.4-1.8.aarch64.rpm"
RPM_HASH = "a003a9782f2acb5baff3b56e4a25c00b0c98c59686541304b1d3645b3eb214635ce31841af4e715284fa5bc8e3045621d9ba64f9b3b743f1af0c7c73b6028b3f"

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
