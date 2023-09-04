SUMMARY = "Basic development packages for TeXLive"
DESCRIPTION = "This package will cause the installation of several \
development packages for TeXLive."
LICENSE = "BSD-3-Clause & LGPL-2.1-or-later & SUSE-TeX"

PV = "2023.20230311"

RPM_NAME = "texlive-bin-devel-2023.20230311-93.2.aarch64.rpm"
RPM_HASH = "ebdbd7bfc4468dc6e4b6db5cc59f8e773d8b3b508f113e56ecbd05d426f3fa71a0dfbb9e78ab78081d7cd5f6fa452add15d79335edb370253618bae6a5c28afe"

RPROVIDES:${PN} += "texlive-bin-devel"

RDEPENDS:${PN} += "libkpathsea6 \
libptexenc1 \
libsynctex2 \
libtexlua53-5 \
libtexluajit2 \
texlive-cweb-bin \
texlive-web-bin"

inherit rpm
