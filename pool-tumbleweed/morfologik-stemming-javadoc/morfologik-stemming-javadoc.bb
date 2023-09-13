SUMMARY = "Javadoc for morfologik-stemming"
DESCRIPTION = "This package contains javadoc for morfologik-stemming."
LICENSE = "BSD-3-Clause"

PV = "2.1.9"

RPM_NAME = "morfologik-stemming-javadoc-2.1.9-2.1.noarch.rpm"
RPM_HASH = "74f4ccb7312e5f44865b64b5edbd99cb438535a94b936da74a3484adddf1c989501dc09a50063d2299511af5ab52ab87c32a981bd336f97a5b71198c2cceffdd"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "morfologik-stemming-javadoc"

RDEPENDS:${PN} += "javapackages-filesystem"

inherit rpm
