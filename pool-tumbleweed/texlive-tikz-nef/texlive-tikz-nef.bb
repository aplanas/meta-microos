SUMMARY = "Create diagrams for neural networks constructed with the methods of the Neural Engineering Framework (NEF)"
DESCRIPTION = "The nef TikZ library provides predefined styles and shapes to \
create diagrams for neural networks constructed with the \
methods of the Neural Engineering Framework (NEF). The \
following styles are supported: ea: ensemble array ens: \
ensemble ext: external input or output inhibt: inhibitory \
connection net: network pnode: pass-through node rect: \
rectification ensemble recurrent: recurrent connection"
LICENSE = "LPPL-1.0"

PV = "2023.201.0.0.1svn55920"

RPM_NAME = "texlive-tikz-nef-2023.201.0.0.1svn55920-52.1.noarch.rpm"
RPM_HASH = "083410b69ce2ace1d0d07d1d5f00f9ffe11e6f8734a830dff4ad6db49e0b9c7a3229dc2b876ad7f32e3e5ce75036ab709b4649ad647a889a00c0bb3e68af5f62"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-tikzlibrarynef.code.tex \
texlive-tikz-nef"

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
