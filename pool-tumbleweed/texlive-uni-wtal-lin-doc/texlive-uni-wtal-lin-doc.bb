SUMMARY = "Documentation for texlive-uni-wtal-lin"
DESCRIPTION = "This package includes the documentation for texlive-uni-wtal-lin"
LICENSE = "LPPL-1.0"

PV = "2023.209.0.0.2svn31409"

RPM_NAME = "texlive-uni-wtal-lin-doc-2023.209.0.0.2svn31409-54.1.noarch.rpm"
RPM_HASH = "4637d69a74c97fe87b823f274dfabc37201c1913ba2447c79035174d2dde87477124da7858f5e1f5dcdd6f008773535f84c090d55a3a6c8e8eea5a1fbc53944d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-texlive-uni-wtal-lin-doc-de;en \
texlive-uni-wtal-lin-doc"

RDEPENDS:${PN} += ""

inherit rpm
