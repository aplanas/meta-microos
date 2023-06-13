SUMMARY = "XSL Stylesheets for DocBook 5"
DESCRIPTION = "These are the XSL stylesheets for DocBook 5 XML and 'Simplified' DocBook 5. \
Use these stylesheets for documents based on DocBook 5; they are aware \
of the namespace feature. \
 \
The stylesheets transform DocBook 5 documents into HTML, XHTML, Manpages, \
XSL-FO (for PDF), and a few other formats. \
 \
XSL is a standard W3C stylesheet language for both print and online \
rendering. For more information about XSL, see the XSL page at the W3C: \
http://www.w3.org/Style/XSL/"
LICENSE = "MIT & MPL-1.1"

PV = "1.79.2.1"

RPM_NAME = "docbook5-xsl-stylesheets-1.79.2.1-1.1.noarch.rpm"
RPM_HASH = "174436f416307731117a9f81385c04b7140cb97a19ec330303699342114382ae3da57d26857b8bcbd0f24cd88146fa48d33e72cd896ac8dd1084e60082b9c8b1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "config(docbook5-xsl-stylesheets) \
docbook5-xsl-stylesheets"

RDEPENDS:${PN} += "/bin/sh \
docbook_5 \
sgml-skel \
xmlcharent"

inherit rpm
