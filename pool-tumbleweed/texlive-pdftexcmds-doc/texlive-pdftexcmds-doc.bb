SUMMARY = "Documentation for texlive-pdftexcmds"
DESCRIPTION = "This package includes the documentation for texlive-pdftexcmds"
LICENSE = "LPPL-1.0"

PV = "2023.209.0.0.33svn55777"

RPM_NAME = "texlive-pdftexcmds-doc-2023.209.0.0.33svn55777-52.1.noarch.rpm"
RPM_HASH = "1fdc6daa6e67f44d3e248dee59a2ed91abf1c0645b282503b48789b36bd27b4353b57525c36d52a59afe4282eceea91c9ae4e9a6bd37ab3957c050a86d8dc781"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-pdftexcmds-doc"

RDEPENDS:${PN} += ""

inherit rpm
