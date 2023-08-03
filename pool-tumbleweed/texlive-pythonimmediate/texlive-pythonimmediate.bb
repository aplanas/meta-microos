SUMMARY = "Library to run Python code"
DESCRIPTION = "Just like PerlTeX or PyLuaTeX (and unlike PythonTeX or \
lt3luabridge), this only requires a single run, and variables \
are persistent throughout the run. Unlike PerlTeX or PyLuaTeX, \
there is no restriction on compiler or script required to run \
the code. There are also debugging functionalities: TeX errors \
result in Python traceback, and Python errors result in TeX \
traceback. Errors in code executed with the pycode environment \
give the correct traceback point to the Python line of code in \
the TeX file. For advanced users, this package allows the user \
to manipulate the TeX state directly from within Python, so you \
don't need to write a single line of TeX code. CAUTION: In \
addition to this LaTeX package you need the Python \
pythonimmediate-tex package, which can be obtained from \
https://pypi.org/project/pythonimmediate-tex/."
LICENSE = "LPPL-1.0"

PV = "2023.209.0.0.4.0svn66461"

RPM_NAME = "texlive-pythonimmediate-2023.209.0.0.4.0svn66461-54.1.noarch.rpm"
RPM_HASH = "a9c8bc1a072f88d01047891c4e543e75051c484b23ff71b5a60382a5c513e0d314264124d6f0d0cb290d3a8e08ae4c6adaf0f450621610db55c5a8f30cab18e1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-pythonimmediate.sty \
texlive-pythonimmediate"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-currfile.sty \
tex-l3keys2e.sty \
tex-precattl.sty \
tex-saveenv.sty \
texlive \
texlive-currfile \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-l3packages \
texlive-precattl \
texlive-saveenv \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
