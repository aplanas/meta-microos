SUMMARY = "Development files for blueprint-compiler"
DESCRIPTION = "A markup language for GTK user interface files."
LICENSE = "LGPL-3.0-or-later"

PV = "0.6.0"

RPM_NAME = "blueprint-compiler-devel-0.6.0-1.1.noarch.rpm"
RPM_HASH = "8e812ee6271505abc879868c5abdcfe28a9f92d0328800569c71074c1d4b3905b3f35f2e6366998e1556f4c8e1695533da2d4aca249880b7b26eb606ef6422e5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "blueprint-compiler-devel \
pkgconfig(blueprint-compiler)"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
blueprint-compiler"

inherit rpm
