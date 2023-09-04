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

RPM_NAME = "texlive-pythonimmediate-2023.209.0.0.4.0svn66461-54.2.noarch.rpm"
RPM_HASH = "c1edd8c46ddb369fdc52cb761f925037af600a6655666bf9646d687139e7540ca3cefc0016eda0b589a8add1d77df7bd2b5ab8639db4730d0f2838d040ba3784"
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
