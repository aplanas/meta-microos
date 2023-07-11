SUMMARY = "Documentation for texlive-quran-bn"
DESCRIPTION = "This package includes the documentation for texlive-quran-bn"
LICENSE = "LPPL-1.0"

PV = "2023.201.0.0.1svn57602"

RPM_NAME = "texlive-quran-bn-doc-2023.201.0.0.1svn57602-53.2.noarch.rpm"
RPM_HASH = "c2069cd7f38bb35b3f15c68f4fda49056d734ab56203c94815275b9d96006b538bfbec6b2bc2c3d4dbd0b50341c09a6a2468d05d79ff72cf384a4d70285d1daf"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-quran-bn-doc"

RDEPENDS:${PN} += ""

inherit rpm
