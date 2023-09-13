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

RPM_NAME = "python311-Pygments-2.16.1-2.1.noarch.rpm"
RPM_HASH = "f1144219cb343f149ca68045443def96c9926a4dfcc58d3adf36acbab7421472900b3ebeae6cfae031bcb5ea07454fe39632b5899bbe3dddec93e14ffb9ada66"
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
