SUMMARY = "Russian documentation for MathGL"
DESCRIPTION = "MathGL is a library for making scientific graphics. It provides data \
plotting and handling of large data arrays, as well as window and \
console modes and for embedding into other programs. \
 \
This package provides Russian documentation for MathGL."
LICENSE = "GPL-3.0-only"

PV = "8.0.1"

RPM_NAME = "mathgl-doc-ru-8.0.1-4.2.noarch.rpm"
RPM_HASH = "019d43087cce05915fd26b6100e39d9e3d5009de947681f36ad89e52ca25b0b00694bf24583e6a1be120a657624011c1de86f28056b6685b9279d96047c392cf"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-mathgl-doc-ru \
mathgl-doc-ru"

RDEPENDS:${PN} += "mathgl-doc"

inherit rpm
