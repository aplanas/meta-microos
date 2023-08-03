SUMMARY = "Documentation for texlive-uspace"
DESCRIPTION = "This package includes the documentation for texlive-uspace"
LICENSE = "LPPL-1.0"

PV = "2023.209.0.0.05svn63123"

RPM_NAME = "texlive-uspace-doc-2023.209.0.0.05svn63123-54.1.noarch.rpm"
RPM_HASH = "511f6f34e79f7246617cc3be649b004873bb0dff61d945b991aa7d7ccfbaccdc7d40605d610cb80630f22c3c680eeb2d9e67529a36d288362e596a3d469bf3ec"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-uspace-doc"

RDEPENDS:${PN} += "/usr/bin/bash"

inherit rpm
