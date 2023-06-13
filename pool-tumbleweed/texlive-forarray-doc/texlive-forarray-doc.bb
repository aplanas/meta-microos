SUMMARY = "Documentation for texlive-forarray"
DESCRIPTION = "This package includes the documentation for texlive-forarray"
LICENSE = "LPPL-1.0"

PV = "2023.201.1.01svn15878"

RPM_NAME = "texlive-forarray-doc-2023.201.1.01svn15878-52.1.noarch.rpm"
RPM_HASH = "da33813d649f347820f654fc2f2c364b38d75c43e242f9a0007c54ee28a21e9972ef0941191e4a4077c29c88ff947a4cd11e4fc9836b8c8c0b1ed6e72d21007c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-forarray-doc"

RDEPENDS:${PN} += "/bin/sh"

inherit rpm
