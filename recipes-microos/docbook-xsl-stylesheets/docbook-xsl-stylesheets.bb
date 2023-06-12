SUMMARY = "XSL Stylesheets for DocBook 4"
DESCRIPTION = "These are the XSL stylesheets for DocBook XML and 'Simplified' DocBook \
DTDs. Use these stylesheets for documents based on DocBook 4 and \
earlier; they are not aware of the namespace feature. \
 \
The stylesheets transform DocBook 4 documents into HTML, XHTML, Manpages, \
XSL-FO (for PDF), and a few other formats. \
 \
XSL is a standard W3C stylesheet language for both print and online \
rendering. For more information about XSL, see the XSL page at the W3C: \
http://www.w3.org/Style/XSL/"
LICENSE = "MIT & MPL-1.1"

PV = "1.79.2.1"

RPM_NAME = "docbook-xsl-stylesheets-1.79.2.1-1.1.noarch.rpm"
RPM_HASH = "af326756e1c63f1b670cd0ca6b4be160436acbaba9af470425bc077a46c8d039ad05d096650ae08419c5d7592ef1c42f81a507bdfc6aae6c4c62aa88941e0ce9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "config(docbook-xsl-stylesheets) \
docbook-xsl-stylesheets"
RDEPENDS:${PN} += "/bin/sh \
docbook_4 \
sgml-skel \
xmlcharent"

inherit rpm
