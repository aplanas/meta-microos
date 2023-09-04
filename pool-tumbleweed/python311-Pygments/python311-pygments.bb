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

RPM_NAME = "python311-Pygments-2.16.1-1.1.noarch.rpm"
RPM_HASH = "7d89fd92e5b6efb3a64fce869eeeab713443b3eeca77990433f70a527c2b5785adc93d13cd1f51d3316700003fc6da3cc6ef62324febfa0822bd1fe9b24039dd"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-Pygments \
python3-pygments \
python3.11dist-pygments \
python311-Pygments \
python311-pygments \
python3dist-pygments"

RDEPENDS:${PN} += "/usr/bin/python3.11 \
/usr/bin/sh \
alts \
python-abi"

inherit rpm
