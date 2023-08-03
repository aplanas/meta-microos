SUMMARY = "Documentation for texlive-cprotectinside"
DESCRIPTION = "This package includes the documentation for texlive-cprotectinside"
LICENSE = "LPPL-1.0"

PV = "2023.209.0.0.0.0svn63833"

RPM_NAME = "texlive-cprotectinside-doc-2023.209.0.0.0.0svn63833-55.1.noarch.rpm"
RPM_HASH = "36e70f05dd50c676c7621e14b99111c8bd7489b91f0dd517f1fdd2cb04313ccbb4d4af4ad6327e0a062b527c94e9008cad374163b2bd6e12c94047d003cda214"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-cprotectinside-doc"

RDEPENDS:${PN} += ""

inherit rpm
