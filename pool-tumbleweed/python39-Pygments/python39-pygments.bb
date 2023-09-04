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

RPM_NAME = "python39-Pygments-2.16.1-1.1.noarch.rpm"
RPM_HASH = "aa214e474f77e2441cfa91dbdacec6116cb854c97250c7ba7827180917b2e9b787690467d784a96387e88bd36386214ff03f0f97bf8c3750bb830471242268d5"
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
