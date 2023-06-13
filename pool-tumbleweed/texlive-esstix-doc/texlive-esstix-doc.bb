SUMMARY = "Documentation for texlive-esstix"
DESCRIPTION = "This package includes the documentation for texlive-esstix"
LICENSE = "OFL-1.1"

PV = "2023.201.1.0svn22426"

RPM_NAME = "texlive-esstix-doc-2023.201.1.0svn22426-52.1.noarch.rpm"
RPM_HASH = "0e7c707bce7329c6a4ed1acc37bbce4e61cc0d8d1755cbb60a4fccafcd21c24f4fb53017d02f8ab53b52f618c9e608980e3668a470e11b7a96e22d92955da2f5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-esstix-doc"

RDEPENDS:${PN} += ""

inherit rpm
