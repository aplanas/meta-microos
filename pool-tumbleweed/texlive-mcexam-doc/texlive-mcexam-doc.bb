SUMMARY = "Documentation for texlive-mcexam"
DESCRIPTION = "This package includes the documentation for texlive-mcexam"
LICENSE = "LPPL-1.0"

PV = "2023.201.0.0.5svn60481"

RPM_NAME = "texlive-mcexam-doc-2023.201.0.0.5svn60481-52.1.noarch.rpm"
RPM_HASH = "fd6c0817fa870068da30fd9d70c0fbdda51aab07929b3db16616245961ed9fdd542a316aaeae1c54657d3ac36d18718c5389f19640cab31954bd55250d3a4747"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-mcexam-doc"
RDEPENDS:${PN} += ""

inherit rpm
