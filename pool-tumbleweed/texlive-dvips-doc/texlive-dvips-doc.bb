SUMMARY = "Documentation for texlive-dvips"
DESCRIPTION = "This package includes the documentation for texlive-dvips"
LICENSE = "LPPL-1.0"

PV = "2023.201.svn66203"

RPM_NAME = "texlive-dvips-doc-2023.201.svn66203-53.1.noarch.rpm"
RPM_HASH = "ef9d9f3ce8e8d6f8c5ab17c95aaf307298640be374d8abdd304a7e5999b85ddb36b0303b4ede50b9c711c3059f53ccc16c98b028852058d0fa6463a34546120e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "man(afm2tfm.1) \
man(dvips.1) \
texlive-dvips-doc"

RDEPENDS:${PN} += "/bin/sh"

inherit rpm
