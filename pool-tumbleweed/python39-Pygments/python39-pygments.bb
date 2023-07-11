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

RPM_NAME = "python39-Pygments-2.15.1-2.3.noarch.rpm"
RPM_HASH = "b9633ae394334daaa6c53770ec3ef94e302503435bcce56eec3d5bf4555ce94aab6e42c5004fb24793136835f13d223051d8f86424b4950165fc59e3f68caeb6"
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
