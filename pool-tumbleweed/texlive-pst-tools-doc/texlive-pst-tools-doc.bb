SUMMARY = "Documentation for texlive-pst-tools"
DESCRIPTION = "This package includes the documentation for texlive-pst-tools"
LICENSE = "LPPL-1.0"

PV = "2023.201.0.0.12svn60621"

RPM_NAME = "texlive-pst-tools-doc-2023.201.0.0.12svn60621-53.1.noarch.rpm"
RPM_HASH = "687be5840753b967b0fb8d58e6043a93ed5ae084cf41897a71df7a3e93cafc5c61525f114c6426806400564ca3e9607a88793b17f145869f6ba23dd9d688bfcd"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-pst-tools-doc"

RDEPENDS:${PN} += ""

inherit rpm
