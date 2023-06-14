SUMMARY = "Russian language module for Babel"
DESCRIPTION = "The package provides support for use of Babel in documents \
written in Russian (in both 'traditional' and modern forms). \
The support is adapted for use both under 'traditional' TeX \
engines, and under XeTeX and LuaTeX."
LICENSE = "LPPL-1.0"

PV = "2023.201.1.3msvn57376"

RPM_NAME = "texlive-babel-russian-2023.201.1.3msvn57376-53.1.noarch.rpm"
RPM_HASH = "58e979fb0fc9dae3b07677f71bf58ee9e63738121f92edcf0e503e21896b5a66aff9a626cb22eda0b64f8cc0c5ebe505470f3e1cc5e49030fbf25dce1656375f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-russianb.ldf \
texlive-babel-russian"

RDEPENDS:${PN} += "/bin/sh \
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
