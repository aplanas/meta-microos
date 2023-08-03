SUMMARY = "Documentation for texlive-confproc"
DESCRIPTION = "This package includes the documentation for texlive-confproc"
LICENSE = "LPPL-1.0"

PV = "2023.209.0.0.8svn29349"

RPM_NAME = "texlive-confproc-doc-2023.209.0.0.8svn29349-55.1.noarch.rpm"
RPM_HASH = "93c7daf50e2bbb915c9a616c294b87fab2c91a253b15e1ee50921a45259310b5e831bfb8960be83e793397244878bf0c5e553c56f7967e0c72d7f462a29d300e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-confproc-doc"

RDEPENDS:${PN} += "/usr/bin/perl \
/usr/bin/sh"

inherit rpm
