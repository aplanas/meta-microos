SUMMARY = "Documentation for texlive-hyphen-sanskrit"
DESCRIPTION = "This package includes the documentation for texlive-hyphen-sanskrit"
LICENSE = "LPPL-1.0"

PV = "2023.208.svn58652"

RPM_NAME = "texlive-hyphen-sanskrit-doc-2023.208.svn58652-53.1.noarch.rpm"
RPM_HASH = "ae4fb6c9f72e9dc50758835bd4a66b395ab783a30a859179accd3072dae72db6ab04f3e06d01077d45a18b75887c658a4ff7e34620f38e1ae9bf647e68c71ed8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-hyphen-sanskrit-doc"

RDEPENDS:${PN} += ""

inherit rpm
