SUMMARY = "Documentation for texlive-easylist"
DESCRIPTION = "This package includes the documentation for texlive-easylist"
LICENSE = "LPPL-1.0"

PV = "2023.209.1.3svn32661"

RPM_NAME = "texlive-easylist-doc-2023.209.1.3svn32661-54.1.noarch.rpm"
RPM_HASH = "26d14386662bc2aaca164bb60b7bddfbfb0ea5845770eec7cf254a85e28261ff10a4863876023a6d09677b12763230f9543774498b36c5c52819231400c0ec4a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-easylist-doc"

RDEPENDS:${PN} += ""

inherit rpm
