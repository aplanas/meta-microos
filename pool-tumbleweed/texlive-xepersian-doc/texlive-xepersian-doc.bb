SUMMARY = "Documentation for texlive-xepersian"
DESCRIPTION = "This package includes the documentation for texlive-xepersian"
LICENSE = "LPPL-1.0"

PV = "2023.209.24.8svn64872"

RPM_NAME = "texlive-xepersian-doc-2023.209.24.8svn64872-53.1.noarch.rpm"
RPM_HASH = "6cefb43cdcdf26fd2feb19cb27783551724f1670f117abeb98c01e6461af5331891704895e4c1e8f3e756d6258ef0de880c5cf7865602821ea99b9819019838f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-xepersian-doc"

RDEPENDS:${PN} += "/usr/bin/python3"

inherit rpm
