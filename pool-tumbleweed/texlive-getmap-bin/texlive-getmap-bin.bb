SUMMARY = "Binary files of getmap"
DESCRIPTION = "Binary files of getmap"
LICENSE = "LPPL-1.0"

PV = "2023.20230311.svn34971"

RPM_NAME = "texlive-getmap-bin-2023.20230311.svn34971-92.1.aarch64.rpm"
RPM_HASH = "00571544ccd03ab1613801c859bfd38554e2e9d8faf41892dd88a7cace7b982c3870e1d5bee1cee060e56226269a8e238ae1a2cd17c9849a174ae3bfc914dccc"

RPROVIDES:${PN} += "texlive-getmap-bin"

RDEPENDS:${PN} += "texlive-getmap"

inherit rpm
