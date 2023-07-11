SUMMARY = "Unicode Collation Algorithm library for Lua"
DESCRIPTION = "The Lua-UCA library provides basic support for Unicode \
Collation Algorithm in Lua. It can be used to sort arrays of \
strings according to rules of particular languages. It can be \
used in other Lua projects that need to sort text in a language \
dependent way, like indexing processors, bibliographic \
generators, etc."
LICENSE = "LPPL-1.0"

PV = "2023.208.0.0.1bsvn61023"

RPM_NAME = "texlive-lua-uca-2023.208.0.0.1bsvn61023-53.1.noarch.rpm"
RPM_HASH = "c9fe462eb4152f65987072b7bee80c920a93b93d3953fa510b0d36fbbb486f8fa63beecc12f8e7827f1709ae6d1da7c97326721ba7fd91e6286df856ad00a007"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-lua-uca"

RDEPENDS:${PN} += "/usr/bin/luatex \
/usr/bin/sh \
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
