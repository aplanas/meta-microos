SUMMARY = "Documentation for texlive-gnuplottex"
DESCRIPTION = "This package includes the documentation for texlive-gnuplottex"
LICENSE = "GPL-2.0-or-later"

PV = "2023.209.0.0.9.5svn54758"

RPM_NAME = "texlive-gnuplottex-doc-2023.209.0.0.9.5svn54758-54.1.noarch.rpm"
RPM_HASH = "5ea59b4f848abc4cf1026382225826947aa110f364e00e595aee594fe1d949c82623bd0c85aedd5c811033b01dc0c7cd0efc643a6c650748e5ea0ff3297f6121"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-gnuplottex-doc"

RDEPENDS:${PN} += ""

inherit rpm
