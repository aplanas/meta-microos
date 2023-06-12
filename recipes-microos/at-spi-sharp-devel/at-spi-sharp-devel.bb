SUMMARY = "Development package for at-spi-sharp mono bindings"
DESCRIPTION = "Development package that contains the pkgconfig file for at-spi-sharp."
LICENSE = "MIT"

PV = "1.1.1"

RPM_NAME = "at-spi-sharp-devel-1.1.1-2.2.noarch.rpm"
RPM_HASH = "f8e4637c33c9389bb010142f28c56009477143428732b975d26210cfcd572be7465c23bf9a04064f239960cf5b5d6105b42fbb3c4b6cdc53c2355a3e5c185363"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "at-spi-sharp-devel \
pkgconfig(at-spi-sharp)"
RDEPENDS:${PN} += "/usr/bin/pkg-config \
at-spi-sharp"

inherit rpm
