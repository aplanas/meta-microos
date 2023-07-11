SUMMARY = "Documentation for metslib"
DESCRIPTION = "The metslib-doc package provides documentation for the metslib library."
LICENSE = "CPL-1.0 | GPL-3.0-or-later"

PV = "0.5.3"

RPM_NAME = "metslib-doc-0.5.3-2.8.noarch.rpm"
RPM_HASH = "73d6a4379d9e33bcb1eb60ec4461a4bc8cb0da9dd71373c5acc49f236b4207e30c496872554e4f52c817da15a9307f6bac8da32a4be04905f5ae7b01b86876e7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "metslib-doc"

RDEPENDS:${PN} += ""

inherit rpm
