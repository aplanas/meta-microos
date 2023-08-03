SUMMARY = "Documentation for texlive-logbox"
DESCRIPTION = "This package includes the documentation for texlive-logbox"
LICENSE = "LPPL-1.0"

PV = "2023.209.1.0svn24499"

RPM_NAME = "texlive-logbox-doc-2023.209.1.0svn24499-55.1.noarch.rpm"
RPM_HASH = "012f203128f69d3be3167d02d6e9c90a1344dc275b4ce305898caa2d8d957eedc08a57f366a12e17855657235a89eb5d2c60e49ae97e863e989e28322b3b9d30"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-logbox-doc"

RDEPENDS:${PN} += ""

inherit rpm
