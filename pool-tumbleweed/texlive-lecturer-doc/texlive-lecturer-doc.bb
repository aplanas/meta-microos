SUMMARY = "Documentation for texlive-lecturer"
DESCRIPTION = "This package includes the documentation for texlive-lecturer"
LICENSE = "LPPL-1.0"

PV = "2023.209.svn23916"

RPM_NAME = "texlive-lecturer-doc-2023.209.svn23916-55.1.noarch.rpm"
RPM_HASH = "879287b42a0bd017f9088ac19516023273922ae3af098244958953ad819055b334b824042d503f71bfa3cd127124a8d992f21981f06da9c77b0d648c29112647"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-lecturer-doc"

RDEPENDS:${PN} += ""

inherit rpm
