SUMMARY = "Basic development packages for TeXLive"
DESCRIPTION = "This package will cause the installation of several \
development packages for TeXLive."
LICENSE = "BSD-3-Clause & LGPL-2.1-or-later & SUSE-TeX"

PV = "2023.20230311"

RPM_NAME = "texlive-bin-devel-2023.20230311-93.1.aarch64.rpm"
RPM_HASH = "d91a19d7191222ae98e1795dac9e674b8192a9feb914513a3e82308b1286c8ad8a003e5c1a77ba30a4cee3640e9f0a629b2923130676c5dc881ae6e3fa14ce9a"

RPROVIDES:${PN} += "texlive-bin-devel"

RDEPENDS:${PN} += "libkpathsea6 \
libptexenc1 \
libsynctex2 \
libtexlua53-5 \
libtexluajit2 \
texlive-cweb-bin \
texlive-web-bin"

inherit rpm
