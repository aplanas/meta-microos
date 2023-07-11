SUMMARY = "Development headers and files for littlewizard"
DESCRIPTION = "The littlewizard-devel package contains libraries and header files for \
littlewizard developing."
LICENSE = "GPL-2.0-or-later"

PV = "1.2.2"

RPM_NAME = "littlewizard-devel-1.2.2-17.17.aarch64.rpm"
RPM_HASH = "bbc66dfe2c628eebb0f8b61dabc8afbb556c3edb0b2aaca2d65b999056f38937956c61fd93cf9105ed2daa89b8b3115ad10aa5529b20387cc2c7b5a6b9cc2d2f"

RPROVIDES:${PN} += "littlewizard-devel"

RDEPENDS:${PN} += "littlewizard"

inherit rpm
