SUMMARY = "Documentation for texlive-ltxcmds"
DESCRIPTION = "This package includes the documentation for texlive-ltxcmds"
LICENSE = "LPPL-1.0"

PV = "2023.201.1.25svn56421"

RPM_NAME = "texlive-ltxcmds-doc-2023.201.1.25svn56421-52.1.noarch.rpm"
RPM_HASH = "7fc432b89f6233586c624bfa08b2cdfbf4b0584034e260fafa4201bc15626b78a156d9cb37e639bb16bff989d280846b0b1acad5f47ba5cc8dfc2f46c156c726"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-ltxcmds-doc"
RDEPENDS:${PN} += ""

inherit rpm
