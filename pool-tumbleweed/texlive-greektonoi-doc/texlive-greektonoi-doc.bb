SUMMARY = "Documentation for texlive-greektonoi"
DESCRIPTION = "This package includes the documentation for texlive-greektonoi"
LICENSE = "LGPL-2.1-or-later"

PV = "2023.209.svn39419"

RPM_NAME = "texlive-greektonoi-doc-2023.209.svn39419-54.2.noarch.rpm"
RPM_HASH = "aef19a3b89d50b807d767d1fa839472517621319d5c205d90a3c7354303176c4a5fe31744436c27c070c35047cf7c3a40f94d6e5e0bf16a04e6363563d4797e2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-texlive-greektonoi-doc-el \
texlive-greektonoi-doc"

RDEPENDS:${PN} += ""

inherit rpm
