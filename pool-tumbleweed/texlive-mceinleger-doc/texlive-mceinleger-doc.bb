SUMMARY = "Documentation for texlive-mceinleger"
DESCRIPTION = "This package includes the documentation for texlive-mceinleger"
LICENSE = "GPL-2.0-or-later"

PV = "2023.201.svn15878"

RPM_NAME = "texlive-mceinleger-doc-2023.201.svn15878-52.1.noarch.rpm"
RPM_HASH = "4dc58fd9d9404dad5effca4c004613c629a55e770144eab7cec038c97fb2bfe6a160a1d23c258476c87b7916417118102ec9bdc2d74bb0479323ebe503a67a7d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-mceinleger-doc"
RDEPENDS:${PN} += ""

inherit rpm
