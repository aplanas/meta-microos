SUMMARY = "NETGEN python bindings"
DESCRIPTION = "Python bindings for NETGEN."
LICENSE = "LGPL-2.1-only"

PV = "6.2.2301"

RPM_NAME = "python3-netgen-6.2.2301-1.4.aarch64.rpm"
RPM_HASH = "cdb03428c70a086f241bd12c18498a9f6aaecbcb6b6dd00701964cec9a5a6b33bdb8a6ebfb44ae9be177a77dc46eaa36fb54d11ac66cc1f1d28919a52eac2226"

RPROVIDES:${PN} += "libngguipy.so \
libngpy.so \
netgen-/usr/lib64/python3.10/site-packages/netgen/libngpy.so \
python3-netgen"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libngcore.so \
libnggui.so \
libnglib.so \
libpython3.10.so.1.0 \
libstdc++.so.6 \
python-abi"

inherit rpm
