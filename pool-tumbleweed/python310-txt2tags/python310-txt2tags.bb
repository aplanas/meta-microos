SUMMARY = "Converts text files to HTML, XHTML, sgml, LaTeX, man and others"
DESCRIPTION = "Txt2tags is a generic text converter. From a simple text file with minimal \
markup, it generates documents on the following formats: HTML, XHTML, sgml, \
LaTeX, Lout, man, Magic Point (mgp), MoinMoin and Adobe PageMaker. Supports \
heading, font beautifiers, verbatim, quote, link, lists, table and image. \
There are GUI, Web and cmdline interfaces. It's a single Python script and \
no external commands or libraries are needed."
LICENSE = "GPL-2.0-only"

PV = "3.7"

RPM_NAME = "python310-txt2tags-3.7-2.9.noarch.rpm"
RPM_HASH = "2a2ae184224b8b6b94d7be23229ad2abae83749c95a5a6f10ebc75fd1221b2604213fb37b8a4da4f777cc138d858b816cf09950dcc6d80b48802f6f370c0860b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-txt2tags \
python3.10dist-txt2tags \
python310-txt2tags \
python3dist-txt2tags \
txt2tags"

RDEPENDS:${PN} += "/bin/sh \
/usr/bin/python3 \
/usr/bin/python3.10 \
python-abi \
python310-setuptools \
update-alternatives"

inherit rpm
