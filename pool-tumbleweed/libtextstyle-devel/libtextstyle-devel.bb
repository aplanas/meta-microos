SUMMARY = "Devel package for libtextstyle"
DESCRIPTION = "This package provides headers and static libraries for libtextstyle"
LICENSE = "LGPL-2.1-or-later"

PV = "0.21.1"

RPM_NAME = "libtextstyle-devel-0.21.1-2.2.aarch64.rpm"
RPM_HASH = "7321a39c6ea7e7341a27159556dbd42126ae6dd96c1a8d77b4c5f5d52d2b50f28de0908f404149114cd51dc2c5c6a9098d4c7a2393c0fa4e3a41390c2d572614"

RPROVIDES:${PN} += "libtextstyle-devel"

RDEPENDS:${PN} += "libtextstyle0"

inherit rpm
