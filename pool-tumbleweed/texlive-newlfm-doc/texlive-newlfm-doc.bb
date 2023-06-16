SUMMARY = "Documentation for texlive-newlfm"
DESCRIPTION = "This package includes the documentation for texlive-newlfm"
LICENSE = "GPL-2.0-or-later"

PV = "2023.201.9.4svn15878"

RPM_NAME = "texlive-newlfm-doc-2023.201.9.4svn15878-54.1.noarch.rpm"
RPM_HASH = "6700497e6c825c9464da01c3d59cece160ac380a8b8575800e9ed16d68c27353dc0f2f473010eda991b5658c891cf5442acbbdaca8af72b86f5c310e240b03d8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-newlfm-doc"

RDEPENDS:${PN} += "/usr/bin/sh"

inherit rpm
