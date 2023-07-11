SUMMARY = "Converts text files to HTML, XHTML, sgml, LaTeX, man and others"
DESCRIPTION = "Txt2tags is a generic text converter. From a simple text file with minimal \
markup, it generates documents on the following formats: HTML, XHTML, sgml, \
LaTeX, Lout, man, Magic Point (mgp), MoinMoin and Adobe PageMaker. Supports \
heading, font beautifiers, verbatim, quote, link, lists, table and image. \
There are GUI, Web and cmdline interfaces. It's a single Python script and \
no external commands or libraries are needed."
LICENSE = "GPL-2.0-only"

PV = "3.8"

RPM_NAME = "python310-txt2tags-3.8-1.1.noarch.rpm"
RPM_HASH = "7f446d3c8f738db3b5ee70c946c32936b4254f0a4993cd8c9a85c3d9f3d6052f4ef75fbbe5e00d546da497d8e82e13c9c6720e4d861e1306e46aa562e0e9873e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-txt2tags \
python310-txt2tags \
python3dist-txt2tags \
txt2tags"

RDEPENDS:${PN} += "/usr/bin/python3.10 \
/usr/bin/sh \
python-abi \
python310-setuptools \
update-alternatives"

inherit rpm
