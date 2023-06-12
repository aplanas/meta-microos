SUMMARY = "Javadoc for ongres-scram"
DESCRIPTION = "This package contains javadoc for ongres-scram"
LICENSE = "BSD-2-Clause"

PV = "2.1"

RPM_NAME = "ongres-scram-javadoc-2.1-2.10.noarch.rpm"
RPM_HASH = "6793a4e638ed24b0e1e55943dca0749a1d403c506b7330d6e2ca43cc2db820068011e8098d5376c83cca2d31f05fe7452a0fd9e9630fbd2561c9f1dcb876e910"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ongres-scram-javadoc"
RDEPENDS:${PN} += "javapackages-filesystem"

inherit rpm
