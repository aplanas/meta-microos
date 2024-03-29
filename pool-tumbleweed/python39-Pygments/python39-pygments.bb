SUMMARY = "A syntax highlighting package written in Python"
DESCRIPTION = "Pygments is a generic syntax highlighter for general use in all kinds of software \
such as forum systems, wikis or other applications that need to prettify \
source code. Highlights are: \
 \
 * a wide range of common languages and markup formats is supported \
 * support for new languages and formats can be added \
 * a number of output formats, presently HTML, LaTeX, RTF, SVG, all image \
   formats that PIL supports and ANSI sequences \
 * it is usable as a command-line tool and as a library \
 * highlights Brainfuck"
LICENSE = "BSD-2-Clause"

PV = "2.16.1"

RPM_NAME = "python39-Pygments-2.16.1-2.1.noarch.rpm"
RPM_HASH = "05d5e2b56dff147a9e1552b1d7e3e883676555afb2f5d4e9c3d9d2ce5a55830e15a7f84fad5bf65dcf10a7ecf29b430ca6aa3ddf0a3414ad54f0a33370f26bd9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-pygments \
python39-Pygments \
python39-pygments \
python3dist-pygments"

RDEPENDS:${PN} += "/usr/bin/python3.9 \
/usr/bin/sh \
alts \
python-abi"

inherit rpm
