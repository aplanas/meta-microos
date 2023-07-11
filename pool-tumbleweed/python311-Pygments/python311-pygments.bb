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

RPM_NAME = "python311-Pygments-2.15.1-2.3.noarch.rpm"
RPM_HASH = "e6e9547b132c9e5e6e86ac8ddf1c46c6c8429f1b027cc25d4663ff7da280b22682bd469b21882cd1236713b8c574a0bc239709f62a3bf8dee96d8d98e20e4113"
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
