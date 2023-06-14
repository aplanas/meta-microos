SUMMARY = "Freecell Solver development package"
DESCRIPTION = "Development package for the libfreecell-solver library"
LICENSE = "MIT"

PV = "6.8.0"

RPM_NAME = "freecell-solver-devel-6.8.0-1.3.aarch64.rpm"
RPM_HASH = "fd5b1b6580d1b70313297d941bc8938e4940a9572d0f4aab6680b5a7cf3600c724b6e22e0403b28916e164c1cfdc114b4337dae9399ad472556faad690495d11"

RPROVIDES:${PN} += "freecell-solver-devel \
pkgconfig-libfreecell-solver"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libfreecell-solver0"

inherit rpm
