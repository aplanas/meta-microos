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

RPM_NAME = "python310-Pygments-2.16.1-1.1.noarch.rpm"
RPM_HASH = "67dd7678362b7ed54ca56ad9e1556bc64634870e23f7edf98c4c33ed1350c50911a6ed1d21c6e2c24d3962ab4aec7af2c756442ab38f4992abfb1e5f26494b33"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-pygments \
python310-Pygments \
python310-pygments \
python3dist-pygments"

RDEPENDS:${PN} += "/usr/bin/python3.10 \
/usr/bin/sh \
alts \
python-abi"

inherit rpm
