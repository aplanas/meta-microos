SUMMARY = "Tools based on libdxfrw"
DESCRIPTION = "This package includes tools based on libdxfrw."
LICENSE = "GPL-2.0-or-later"

PV = "2.2.0+git.20221210"

RPM_NAME = "libdxfrw-tools-2.2.0+git.20221210-1.1.aarch64.rpm"
RPM_HASH = "cffad9a3ca8c33741d5012adfb29d7b41a165561a04a9ac09d52c503bb5cc8c60d767cd73ae8db4203d1fd6114656b32240b4009cfe4590f31a402c846fccfea"

RPROVIDES:${PN} += "libdxfrw-tools"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libdxfrw.so.1 \
libgcc-s.so.1 \
libstdc++.so.6"

inherit rpm
