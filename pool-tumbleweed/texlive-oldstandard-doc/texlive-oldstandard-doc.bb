SUMMARY = "Documentation for texlive-oldstandard"
DESCRIPTION = "This package includes the documentation for texlive-oldstandard"
LICENSE = "OFL-1.1"

PV = "2023.209.2.6svn64464"

RPM_NAME = "texlive-oldstandard-doc-2023.209.2.6svn64464-55.1.noarch.rpm"
RPM_HASH = "b5964694af37b9ed22073d49c9dff70f8a37d38f6661576407d1e98853472acedfe9b002a553d6563dd97f89c9be88404a1dde4510ccedc8f4e449673a97f9ef"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-oldstandard-doc"

RDEPENDS:${PN} += ""

inherit rpm
