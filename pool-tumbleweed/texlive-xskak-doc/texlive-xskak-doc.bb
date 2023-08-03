SUMMARY = "Documentation for texlive-xskak"
DESCRIPTION = "This package includes the documentation for texlive-xskak"
LICENSE = "LPPL-1.0"

PV = "2023.209.1.5svn51432"

RPM_NAME = "texlive-xskak-doc-2023.209.1.5svn51432-53.1.noarch.rpm"
RPM_HASH = "f1578c955c641d186e29094219af4b4373a9bf823d8dac636934ff4c041a06b7eef52b3a88ee15ac95a3e637377bcefa99f09bb61a249b83c46dbaa9e31e6222"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-xskak-doc"

RDEPENDS:${PN} += ""

inherit rpm
