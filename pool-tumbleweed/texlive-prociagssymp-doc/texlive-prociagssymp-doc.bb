SUMMARY = "Documentation for texlive-prociagssymp"
DESCRIPTION = "This package includes the documentation for texlive-prociagssymp"
LICENSE = "LPPL-1.0"

PV = "2023.201.svn63242"

RPM_NAME = "texlive-prociagssymp-doc-2023.201.svn63242-52.1.noarch.rpm"
RPM_HASH = "4f2ac3614e3eb28fe7d751798a34e54f40a722b10e3361eb6119dcce13bdc0b60be8ce15f26c835e5597691e94cd69f50380613b5a3447d511fdf6be3162c3d8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-prociagssymp-doc"

RDEPENDS:${PN} += ""

inherit rpm
