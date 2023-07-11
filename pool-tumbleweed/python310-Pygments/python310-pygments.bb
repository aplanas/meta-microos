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

PV = "2.15.1"

RPM_NAME = "python310-Pygments-2.15.1-2.3.noarch.rpm"
RPM_HASH = "b3137990f566c657b13349058a414b99ed8ee4487858c3cc6c36b83f450ae36f8998b2a1e5246dc85e64d3098ed6171c323b97511f7dab6c59ded5d68991b7f8"
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
