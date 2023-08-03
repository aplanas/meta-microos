SUMMARY = "Documentation for texlive-termmenu"
DESCRIPTION = "This package includes the documentation for texlive-termmenu"
LICENSE = "LPPL-1.0"

PV = "2023.209.svn37700"

RPM_NAME = "texlive-termmenu-doc-2023.209.svn37700-55.1.noarch.rpm"
RPM_HASH = "4aadf78438ec6a1e1973477d001d062106a532f824c5fda24b9a04f404895540a1ab3c55b29120852bf426130e90454294ff3e50e78507853a588c107525ff99"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-termmenu-doc"

RDEPENDS:${PN} += ""

inherit rpm
