SUMMARY = "Text-Based Document Generation"
DESCRIPTION = "AsciiDoc is a text document format for writing short documents, \
articles, books, and UNIX man pages. AsciiDoc files can be translated \
to HTML and DocBook markups using the asciidoc command."
LICENSE = "GPL-2.0-or-later"

PV = "10.2.0"

RPM_NAME = "asciidoc-10.2.0-1.4.noarch.rpm"
RPM_HASH = "24953cb3f23dad5aa27c0c1571b81229626136f7093c1cf827e926268b15a5f081f93846e21dab9b313cf566072ca0a2d62d4204d0013a4a1e8ffe83ecf70e70"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "asciidoc \
python3.10dist(asciidoc) \
python3dist(asciidoc)"
RDEPENDS:${PN} += "/usr/bin/python3 \
docbook-xsl-stylesheets \
python(abi) \
python3-xml"

inherit rpm
