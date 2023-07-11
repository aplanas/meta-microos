SUMMARY = "Documentation for texlive-inkpaper"
DESCRIPTION = "This package includes the documentation for texlive-inkpaper"
LICENSE = "GPL-2.0-or-later"

PV = "2023.208.1.0svn54080"

RPM_NAME = "texlive-inkpaper-doc-2023.208.1.0svn54080-53.1.noarch.rpm"
RPM_HASH = "cd82bcc43e1e91cb24a9c82e49491fb285902e23b4a79a3f164158c16d23e78775d43c2c06f168e094b1679071557c4978507fd5dca6de565b0dac76bb351d36"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-texlive-inkpaper-doc-zh-cn;en \
texlive-inkpaper-doc"

RDEPENDS:${PN} += ""

inherit rpm
