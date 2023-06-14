SUMMARY = "Mono bindings for AT-SPI"
DESCRIPTION = "C-Sharp/Mono bindings for Assistive Technology Service Provider Interface"
LICENSE = "MIT"

PV = "1.1.1"

RPM_NAME = "at-spi-sharp-1.1.1-2.2.noarch.rpm"
RPM_HASH = "bd62c9c1b333ff9e0f5b2ba2b415c00e45a1b7f6e000055ffa13264bf5f15a74b454917fa4f42c53ef136b7c3d3601054f3a57e52e5de7bbb8f0bd4d20563613"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "at-spi-sharp \
mono-at-spi-sharp"

RDEPENDS:${PN} += "mono-Mono.Posix \
mono-System \
mono-System.Core \
mono-System.Xml \
mono-core \
mono-mscorlib"

inherit rpm
