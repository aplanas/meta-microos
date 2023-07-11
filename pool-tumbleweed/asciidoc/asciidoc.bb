SUMMARY = "Text-Based Document Generation"
DESCRIPTION = "AsciiDoc is a text document format for writing short documents, \
articles, books, and UNIX man pages. AsciiDoc files can be translated \
to HTML and DocBook markups using the asciidoc command."
LICENSE = "GPL-2.0-or-later"

PV = "10.2.0"

RPM_NAME = "asciidoc-10.2.0-1.5.noarch.rpm"
RPM_HASH = "d1f0929c705ec2e822dce7ffb15721d8793d3bb8d384094f0ed05c661d63ad575c89fbbda2fa2fc237a6f68e5a21741a05addd968a5f579b76ce5714cdc806ce"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "asciidoc \
python3.11dist-asciidoc \
python3dist-asciidoc"

RDEPENDS:${PN} += "/usr/bin/python3 \
docbook-xsl-stylesheets \
python-abi \
python3-xml"

inherit rpm
