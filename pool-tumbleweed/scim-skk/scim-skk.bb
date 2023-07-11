SUMMARY = "SKK Input Method Engine for SCIM"
DESCRIPTION = "SKK Input Method Engine for SCIM"
LICENSE = "GPL-2.0+"

PV = "0.5.2"

RPM_NAME = "scim-skk-0.5.2-318.30.aarch64.rpm"
RPM_HASH = "9829a5aaeb0644defb72a6c0454514aaaf21327571e7fba7a1aa1f49541716a4e8db71ddaa5cdc2f2fdae6e75abcd3b7e655cbef9d38eb236c5a18bf337069f3"

RPROVIDES:${PN} += "scim-skk"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libgdk-3.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgtk-3.so.0 \
libscim-1.0.so.8 \
libscim-gtkutils-1.0.so.8 \
libstdc++.so.6 \
skkdic"

inherit rpm
