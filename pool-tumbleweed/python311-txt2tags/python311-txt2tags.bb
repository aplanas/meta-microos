SUMMARY = "Converts text files to HTML, XHTML, sgml, LaTeX, man and others"
DESCRIPTION = "Txt2tags is a generic text converter. From a simple text file with minimal \
markup, it generates documents on the following formats: HTML, XHTML, sgml, \
LaTeX, Lout, man, Magic Point (mgp), MoinMoin and Adobe PageMaker. Supports \
heading, font beautifiers, verbatim, quote, link, lists, table and image. \
There are GUI, Web and cmdline interfaces. It's a single Python script and \
no external commands or libraries are needed."
LICENSE = "GPL-2.0-only"

PV = "3.8"

RPM_NAME = "python311-txt2tags-3.8-1.1.noarch.rpm"
RPM_HASH = "7aac82e123004d45e390b2ea3f9518760187fcbb003c7d76b34fd06aef006de0b5657063b85f3e3d872a2dd6ca3716798a37131b4912a00476ff3f761c47687e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-txt2tags \
python3.11dist-txt2tags \
python311-txt2tags \
python3dist-txt2tags \
txt2tags"

RDEPENDS:${PN} += "/usr/bin/python3 \
/usr/bin/python3.11 \
/usr/bin/sh \
python-abi \
python311-setuptools \
update-alternatives"

inherit rpm
