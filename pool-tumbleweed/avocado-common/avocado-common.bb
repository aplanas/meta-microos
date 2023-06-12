SUMMARY = "Avocado Test Framework"
DESCRIPTION = "Avocado is a set of tools and libraries (what people call these days a \
framework) to perform automated testing. \
 \
This package contains common infrastructure files."
LICENSE = "GPL-2.0-only"

PV = "69.0"

RPM_NAME = "avocado-common-69.0-6.10.noarch.rpm"
RPM_HASH = "de3db5a06d9947ca237acf55885a5f57057b25e216b2a261ed2b979f4ff63edbd16baec1218758cbe8bc49305ef081f84cb5766e14b96374ebc4e854fbbe6aa5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "avocado-common \
config(avocado-common)"
RDEPENDS:${PN} += "/bin/sh"

inherit rpm
