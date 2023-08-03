SUMMARY = "Documentation for texlive-emf"
DESCRIPTION = "This package includes the documentation for texlive-emf"
LICENSE = "GPL-2.0-or-later"

PV = "2023.209.1svn42023"

RPM_NAME = "texlive-emf-doc-2023.209.1svn42023-54.1.noarch.rpm"
RPM_HASH = "dff06f280688fd4b3028bfb0b04ee8c862ed235bbce82d935a5648cd7360c04b192d6160c62703f010670169889b000eacf7c51e5383e102e62101f99c76383a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-emf-doc"

RDEPENDS:${PN} += ""

inherit rpm
