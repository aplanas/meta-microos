SUMMARY = "Injected bundles for wpewebkit"
DESCRIPTION = "WPE allows embedders to create simple and performant systems based on \
Web platform technologies. It is designed with hardware acceleration \
in mind, leveraging common 3D graphics APIs for best performance."
LICENSE = "BSD-3-Clause & LGPL-2.1"

PV = "2.40.3"

RPM_NAME = "wpewebkit-2_0-injected-bundles-2.40.3-1.2.aarch64.rpm"
RPM_HASH = "f568449a0a4f1d3354fd1e3ef4ad45b7aafd0c6fed086837834874d927bdc66add85f3e1908e1833002fdf2b3f332231cd4de2fd37c23513a0ec17a4acaf8830"

RPROVIDES:${PN} += "libWPEInjectedBundle.so \
wpewebkit-2-0-injected-bundles"

RDEPENDS:${PN} += "libWPEWebKit-2.0.so.1"

inherit rpm
