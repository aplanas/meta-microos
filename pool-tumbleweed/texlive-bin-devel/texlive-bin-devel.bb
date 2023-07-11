SUMMARY = "Basic development packages for TeXLive"
DESCRIPTION = "This package will cause the installation of several \
development packages for TeXLive."
LICENSE = "BSD-3-Clause & LGPL-2.1-or-later & SUSE-TeX"

PV = "2023.20230311"

RPM_NAME = "texlive-bin-devel-2023.20230311-92.1.aarch64.rpm"
RPM_HASH = "3e3d005dce6afcd8226db92dc403afd6929dd671826a0f7cd77a00421b866b5042977c9eab852a8bbd55df19a56672bea244a3220fa0aa44f4b276de20fbb16b"

RPROVIDES:${PN} += "texlive-bin-devel"

RDEPENDS:${PN} += "libkpathsea6 \
libptexenc1 \
libsynctex2 \
libtexlua53-5 \
libtexluajit2 \
texlive-cweb-bin \
texlive-web-bin"

inherit rpm
