SUMMARY = "Documentation for texlive-context-degrade"
DESCRIPTION = "This package includes the documentation for texlive-context-degrade"
LICENSE = "GPL-2.0-or-later"

PV = "2023.209.svn47085"

RPM_NAME = "texlive-context-degrade-doc-2023.209.svn47085-55.1.noarch.rpm"
RPM_HASH = "49d69783fdbd426857d89f2b7996f7702cf3643b6035ed88719d771084150a170eed56e6f7cf2d88541722a6d3a2615e5dc379db94f5ba87d457d4d38fa5ed5f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-context-degrade-doc"

RDEPENDS:${PN} += ""

inherit rpm
