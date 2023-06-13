SUMMARY = "Documentation for texlive-minim-xmp"
DESCRIPTION = "This package includes the documentation for texlive-minim-xmp"
LICENSE = "LPPL-1.0"

PV = "2023.201.2023_1.2svn66395"

RPM_NAME = "texlive-minim-xmp-doc-2023.201.2023_1.2svn66395-54.1.noarch.rpm"
RPM_HASH = "6c2a35acd7c8e4a36987db8633583766cd9a6b52fc0701407c8a15d1cd43b9e0ed188ed25fe1b5d76e6bacbc36d4a8e8c71d84fd8cb91cd0c4cfdbadafd1e62b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-minim-xmp-doc"

RDEPENDS:${PN} += ""

inherit rpm
