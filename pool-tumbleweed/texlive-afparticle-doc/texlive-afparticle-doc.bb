SUMMARY = "Documentation for texlive-afparticle"
DESCRIPTION = "This package includes the documentation for texlive-afparticle"
LICENSE = "LPPL-1.0"

PV = "2023.201.1.3svn35900"

RPM_NAME = "texlive-afparticle-doc-2023.201.1.3svn35900-54.1.noarch.rpm"
RPM_HASH = "5220b0518854084677bba7bd88635fdf5ac357866a652d848f9aa5ab6079cc64860b8e96b6a4f2da7768b5c3934bfec4371bd5034103e31fde83bbb6ff35367d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-afparticle-doc"

RDEPENDS:${PN} += ""

inherit rpm
