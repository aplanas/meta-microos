SUMMARY = "A complex camera support library in C++"
DESCRIPTION = "libcamera is an experimental camera user-space API. \
 \
A camera may consist of multiple sensors or function blocks, and can \
expose multiple kernel device nodes in /dev for different stages of \
the pipeline. The libcamera API groups and exposes these pieces as \
what users consider one 'camera'."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "0.0.4"

RPM_NAME = "libcamera-base0_0_4-0.0.4-2.3.aarch64.rpm"
RPM_HASH = "041c4604685c179264a91b33a036f53116fa026dfd3f478252ac89464afc0fabe8f78f04be01886ffa60f6441ec3772633da71569e9120a1b3a3a37caf9c60b3"

RPROVIDES:${PN} += "libcamera-base.so.0.0.4 \
libcamera-base0-0-4"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libdw.so.1 \
libgcc-s.so.1 \
libstdc++.so.6 \
libunwind.so.8"

inherit rpm
