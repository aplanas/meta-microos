SUMMARY = "HTML documentation for ldas-tools-framecpp API"
DESCRIPTION = "This package provides the API documentation for ldas-tools-framecpp in HTML format."
LICENSE = "GPL-2.0-or-later"

PV = "2.7.0"

RPM_NAME = "ldas-tools-framecpp-doc-2.7.0-2.13.noarch.rpm"
RPM_HASH = "1a2d521b9d3f4d07596d04db7e932ec912d81720d4461b4038b16c6c422581d25149e47a139020102cf9072eaa5ef8cb55ce9752d5b468326d767f43b4e08f2a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ldas-tools-framecpp-doc"

RDEPENDS:${PN} += ""

inherit rpm
