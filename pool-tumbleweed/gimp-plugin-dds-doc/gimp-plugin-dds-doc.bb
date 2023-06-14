SUMMARY = "Plugin for GIMP providing support for the DDS format -- Documentation"
DESCRIPTION = "This GIMP plugin allows to load and save images in the Direct Draw \
Surface (DDS) format. \
 \
This package contains documentation for the following features of the \
DDS plugin: \
 \
 + Saving general images \
 + Saving cube map images \
 + Saving volume map images"
LICENSE = "GPL-2.0+"

PV = "3.0.1"

RPM_NAME = "gimp-plugin-dds-doc-3.0.1-3.32.aarch64.rpm"
RPM_HASH = "25f6adef701bed4b9d14e6a9c5da2193fa39dff811fe9352d993ecea5ed151aa48e7517e83c6b615f3d21a60e69f38763fa16fa9f145c03220d10e42d45d30b3"

RPROVIDES:${PN} += "gimp-plugin-dds-doc"

RDEPENDS:${PN} += "gimp-plugin-dds"

inherit rpm
