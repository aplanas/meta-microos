SUMMARY = "Development files for the xBRZ library"
DESCRIPTION = "xBRZ is a bitmap upscaler employing pattern recognition and \
substituion rules. ('xBRZ' = Scale By Rules, Zenju enhanced variant.)"
LICENSE = "GPL-3.0-only"

PV = "1.8"

RPM_NAME = "xbrz-devel-1.8-2.4.aarch64.rpm"
RPM_HASH = "6476580f7a828476c2d4625da866ec3d126167a7d652e488256ff8e180630d6b2a283e8158b14a7f2104204cf6e2b9f0674f7ca123c1046ef61d84a6746f38ed"

RPROVIDES:${PN} += "xbrz-devel \
xbrz-devel(aarch-64)"

RDEPENDS:${PN} += "libxbrz-1_8"

inherit rpm
