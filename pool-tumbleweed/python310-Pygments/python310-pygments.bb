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

RPM_NAME = "python310-Pygments-2.15.1-2.1.noarch.rpm"
RPM_HASH = "f8c33956ca750ab65216520ab2d9622d6b1beab5b11654fa6895e260c118c6c9ecb278724ce73da992179c1e485cbb82a7b52ef85f61755510e3da1a94dc5482"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-Pygments \
python3-pygments \
python3.10dist(pygments) \
python310-Pygments \
python310-pygments \
python3dist(pygments)"
RDEPENDS:${PN} += "/bin/sh \
/usr/bin/python3.10 \
alts \
python(abi)"

inherit rpm
