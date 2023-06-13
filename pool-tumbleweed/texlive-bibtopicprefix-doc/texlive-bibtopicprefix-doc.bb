SUMMARY = "Documentation for texlive-bibtopicprefix"
DESCRIPTION = "This package includes the documentation for texlive-bibtopicprefix"
LICENSE = "LPPL-1.0"

PV = "2023.201.1.10svn15878"

RPM_NAME = "texlive-bibtopicprefix-doc-2023.201.1.10svn15878-53.1.noarch.rpm"
RPM_HASH = "49871336d917aa0532f5e539c038199b866c3dd837f5cebd6a227d687327bf20c4449f51093910670d4e41211649f6fd721499942cef6b3de5f1078ab6723828"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-bibtopicprefix-doc"

RDEPENDS:${PN} += ""

inherit rpm
