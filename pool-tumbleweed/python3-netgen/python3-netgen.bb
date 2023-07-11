SUMMARY = "NETGEN python bindings"
DESCRIPTION = "Python bindings for NETGEN."
LICENSE = "LGPL-2.1-only"

PV = "6.2.2301"

RPM_NAME = "python3-netgen-6.2.2301-1.5.aarch64.rpm"
RPM_HASH = "89545bee63c746aa74881c35358c24f7450f16149e5185967fe9a8130436faa3238763be6adf6e2cb5655677441a196ed6e558c9fd26bba1ed0618f499163ac5"

RPROVIDES:${PN} += "libngguipy.so \
libngpy.so \
netgen-/usr/lib64/python3.11/site-packages/netgen/libngpy.so \
python3-netgen"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libngcore.so \
libnggui.so \
libnglib.so \
libpython3.11.so.1.0 \
libstdc++.so.6 \
python-abi"

inherit rpm
