SUMMARY = "Documentation for texlive-xkeyval"
DESCRIPTION = "This package includes the documentation for texlive-xkeyval"
LICENSE = "LPPL-1.0"

PV = "2023.201.2.9svn63616"

RPM_NAME = "texlive-xkeyval-doc-2023.201.2.9svn63616-52.2.noarch.rpm"
RPM_HASH = "40d0ec93131cea7dc8c6f561b6cab3173e1daa4bfc96389b716cd2ec45686adb47fc4645f57246ca13bfa5475a802168402e25651c364ef9f87278ab62e8de18"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-xkeyval-doc"

RDEPENDS:${PN} += ""

inherit rpm
