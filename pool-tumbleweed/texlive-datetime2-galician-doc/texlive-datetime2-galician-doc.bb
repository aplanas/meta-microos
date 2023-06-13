SUMMARY = "Documentation for texlive-datetime2-galician"
DESCRIPTION = "This package includes the documentation for texlive-datetime2-galician"
LICENSE = "LPPL-1.0"

PV = "2023.201.1.0svn47631"

RPM_NAME = "texlive-datetime2-galician-doc-2023.201.1.0svn47631-52.1.noarch.rpm"
RPM_HASH = "34dd2c134fa2c7e111cb0c9f538ad556c38609d081069db81336397fe69991a8ebe85918428a29b0e438ca87786af089915f402c999db102e5dc238812c17158"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-datetime2-galician-doc"

RDEPENDS:${PN} += ""

inherit rpm
