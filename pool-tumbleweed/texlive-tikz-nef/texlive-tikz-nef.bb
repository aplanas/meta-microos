SUMMARY = "Create diagrams for neural networks constructed with the methods of the Neural Engineering Framework (NEF)"
DESCRIPTION = "The nef TikZ library provides predefined styles and shapes to \
create diagrams for neural networks constructed with the \
methods of the Neural Engineering Framework (NEF). The \
following styles are supported: ea: ensemble array ens: \
ensemble ext: external input or output inhibt: inhibitory \
connection net: network pnode: pass-through node rect: \
rectification ensemble recurrent: recurrent connection"
LICENSE = "LPPL-1.0"

PV = "2023.209.0.0.1svn55920"

RPM_NAME = "texlive-tikz-nef-2023.209.0.0.1svn55920-53.1.noarch.rpm"
RPM_HASH = "9c95560c1fb306c3b097701a7d422d68b9c89922af33ae9c0abfdedc0948aa1af634bfd9d685de630484f3a28f6ff4df615fcd660938dabb9a2ad7570cd60206"
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
