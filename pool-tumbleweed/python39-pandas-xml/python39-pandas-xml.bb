SUMMARY = "The python pandas[xml] extra"
DESCRIPTION = "This package provides the [xml] extra for python-pandas"
LICENSE = "BSD-3-Clause"

PV = "2.0.3"

RPM_NAME = "python39-pandas-xml-2.0.3-1.2.noarch.rpm"
RPM_HASH = "658afa90b12c78ead0784374c3cec60d34a149d15207cc07cf5266b9c2165069625c3b603cf9247502519dd26919b8923bfd9b862f091e6ed3042975674c2c07"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python39-pandas-xml"

RDEPENDS:${PN} += "python39-lxml \
python39-pandas"

inherit rpm
