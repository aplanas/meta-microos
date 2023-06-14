SUMMARY = "Converts text files to HTML, XHTML, sgml, LaTeX, man and others"
DESCRIPTION = "Txt2tags is a generic text converter. From a simple text file with minimal \
markup, it generates documents on the following formats: HTML, XHTML, sgml, \
LaTeX, Lout, man, Magic Point (mgp), MoinMoin and Adobe PageMaker. Supports \
heading, font beautifiers, verbatim, quote, link, lists, table and image. \
There are GUI, Web and cmdline interfaces. It's a single Python script and \
no external commands or libraries are needed."
LICENSE = "GPL-2.0-only"

PV = "3.7"

RPM_NAME = "python311-txt2tags-3.7-2.9.noarch.rpm"
RPM_HASH = "fa3a9ec146bb7f3890a39a399b0da6a3ebbc1ad37fe18015f9daeb1d0af5bce85212e4c1e2674283769b3a2c54a9bc80c6f069e19dbc8dcb23c600059f5a8d82"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist-txt2tags \
python311-txt2tags \
python3dist-txt2tags \
txt2tags"

RDEPENDS:${PN} += "/bin/sh \
/usr/bin/python3.11 \
python-abi \
python311-setuptools \
update-alternatives"

inherit rpm
