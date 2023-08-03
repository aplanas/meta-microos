SUMMARY = "Documentation for texlive-librebodoni"
DESCRIPTION = "This package includes the documentation for texlive-librebodoni"
LICENSE = "OFL-1.1"

PV = "2023.209.svn64431"

RPM_NAME = "texlive-librebodoni-doc-2023.209.svn64431-55.1.noarch.rpm"
RPM_HASH = "b7cc2f4cdc8a9c0705a422655806b952cc15626fa3437056de0e133e580e7a8fc46c886f46cb39a6e2fb4f2369b5b045143c7913e072ec61cdb55e22eb064fd3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-librebodoni-doc"

RDEPENDS:${PN} += ""

inherit rpm
