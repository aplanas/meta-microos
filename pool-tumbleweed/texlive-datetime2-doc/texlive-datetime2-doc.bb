SUMMARY = "Documentation for texlive-datetime2"
DESCRIPTION = "This package includes the documentation for texlive-datetime2"
LICENSE = "LPPL-1.0"

PV = "2023.204.1.5.7svn63102"

RPM_NAME = "texlive-datetime2-doc-2023.204.1.5.7svn63102-54.1.noarch.rpm"
RPM_HASH = "3cb835ff6a7e7ca36c727697ca752dfef8d1e12a26862eafdf442fe9d1351380b67002d503d8afbc2198ce54ffd8cafb0c8651ed166b06cd32ad26e253439107"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-datetime2-doc"

RDEPENDS:${PN} += ""

inherit rpm
