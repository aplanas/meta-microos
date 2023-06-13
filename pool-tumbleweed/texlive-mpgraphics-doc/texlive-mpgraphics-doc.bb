SUMMARY = "Documentation for texlive-mpgraphics"
DESCRIPTION = "This package includes the documentation for texlive-mpgraphics"
LICENSE = "LPPL-1.0"

PV = "2023.201.0.0.3svn29776"

RPM_NAME = "texlive-mpgraphics-doc-2023.201.0.0.3svn29776-54.1.noarch.rpm"
RPM_HASH = "8fbad981e7a11162a5f24765343baf63c7af8867ead74bb97b934ca265ec100f9f040da2b1516062cc6a1b25c5a71b8652190af17ca216a17e02b984f0925c54"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-mpgraphics-doc"

RDEPENDS:${PN} += ""

inherit rpm
