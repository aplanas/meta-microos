SUMMARY = "UIM Input Method Engine for SCIM"
DESCRIPTION = "UIM Input Method Engine for SCIM. \
 \
 \
 \
Authors: \
-------- \
    James Su <suzhe@tsinghua.org.cn>"
LICENSE = "GPL-2.0+"

PV = "0.2.0"

RPM_NAME = "scim-uim-0.2.0-225.28.aarch64.rpm"
RPM_HASH = "8816c418fc5da5e6daddafcf8b18186becb823f58e47144f15416526c85f21ac4c48b6cbd2320cf2eca593aba50062ca26268065f6c4645e60ea05213d963c9f"

RPROVIDES:${PN} += "scim-uim"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libscim-1.0.so.8 \
libstdc++.so.6 \
libuim-scm.so.0 \
libuim.so.8"

inherit rpm
