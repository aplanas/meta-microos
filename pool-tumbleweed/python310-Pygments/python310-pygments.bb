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

RPM_NAME = "python310-Pygments-2.16.1-2.1.noarch.rpm"
RPM_HASH = "f17a82679998dacf90cc0a75aa35b4ac7ce275d8520a92c3cc221cb775e4e9c12484cb1d48b2c7fd47c62447170740366e5cf9d5311599847504c10e53cb8882"
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
