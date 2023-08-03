SUMMARY = "Russian language module for Babel"
DESCRIPTION = "The package provides support for use of Babel in documents \
written in Russian (in both 'traditional' and modern forms). \
The support is adapted for use both under 'traditional' TeX \
engines, and under XeTeX and LuaTeX."
LICENSE = "LPPL-1.0"

PV = "2023.209.1.3msvn57376"

RPM_NAME = "texlive-babel-russian-2023.209.1.3msvn57376-54.1.noarch.rpm"
RPM_HASH = "ee0ab18df0e17cc15d8240b7c0ae697f65ba394221bfe17cd27db847c37c7a3738703d1735e69cea333f634378fcdd189cc9797c23c338d4380e17b0d8604698"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-russianb.ldf \
texlive-babel-russian"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
