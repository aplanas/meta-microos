SUMMARY = "Documentation for texlive-tikz-ext"
DESCRIPTION = "This package includes the documentation for texlive-tikz-ext"
LICENSE = "GFDL-1.3-or-later"

PV = "2023.201.0.0.4.2svn64920"

RPM_NAME = "texlive-tikz-ext-doc-2023.201.0.0.4.2svn64920-52.1.noarch.rpm"
RPM_HASH = "eabf45ca6fb2cd806f07faf32b729646e4390e0a1bacd8e0ebb39b8be656d4aa8367ade779bcecce328abf39e57498be7e97723a6d73c011e50d27ffc17f51f9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-tikz-ext-doc"

RDEPENDS:${PN} += ""

inherit rpm
