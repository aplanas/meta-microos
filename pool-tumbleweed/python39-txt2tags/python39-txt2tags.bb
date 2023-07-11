SUMMARY = "Converts text files to HTML, XHTML, sgml, LaTeX, man and others"
DESCRIPTION = "Txt2tags is a generic text converter. From a simple text file with minimal \
markup, it generates documents on the following formats: HTML, XHTML, sgml, \
LaTeX, Lout, man, Magic Point (mgp), MoinMoin and Adobe PageMaker. Supports \
heading, font beautifiers, verbatim, quote, link, lists, table and image. \
There are GUI, Web and cmdline interfaces. It's a single Python script and \
no external commands or libraries are needed."
LICENSE = "GPL-2.0-only"

PV = "3.8"

RPM_NAME = "python39-txt2tags-3.8-1.1.noarch.rpm"
RPM_HASH = "202e482e5f1dc15594e0bd47f89605134d57ef9813ed825afb4b73b392ea6d7e44c052847a7cdedc2f53b69cec0c047fd0d898a4b6bdb17061e02d4bd47940d7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-txt2tags \
python39-txt2tags \
python3dist-txt2tags \
txt2tags"

RDEPENDS:${PN} += "/usr/bin/python3.9 \
/usr/bin/sh \
python-abi \
python39-setuptools \
update-alternatives"

inherit rpm
