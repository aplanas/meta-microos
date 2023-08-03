SUMMARY = "The Build Enviroment from Calligra"
DESCRIPTION = "This package contains the build environment needed to compile Calligra \
applications."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "3.2.1"

RPM_NAME = "calligra-devel-3.2.1-7.21.aarch64.rpm"
RPM_HASH = "66f0c44a996fb5118e5a868781d5209f256a05653d6e45e16cc93b0693673667c0a257444cdcaae9de9fb2a76bff1a7759dd8ad5822d2a83de8fd5680fc034fa"

RPROVIDES:${PN} += "calligra-devel"

RDEPENDS:${PN} += "calligra"

inherit rpm
