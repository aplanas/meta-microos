SUMMARY = "DocBook Authoring and Publishing Suite"
DESCRIPTION = "DocBook Authoring and Publishing Suite (DAPS) \
 \
DAPS contains a set of stylesheets, scripts and makefiles that enable \
you to create HTML, PDF, EPUB and other formats from DocBook XML with a \
single command. It also contains tools to generate profiled source \
tarballs for distributing your XML sources for translation or review. \
 \
DAPS also includes tools that assist you when writing DocBook XML: \
validator, link checker, spellchecker, editor macros and stylesheets for \
converting DocBook XML."
LICENSE = "GPL-2.0-only | GPL-3.0-only"

PV = "3.3.2"

RPM_NAME = "daps-3.3.2-1.2.noarch.rpm"
RPM_HASH = "28a7debb9a7fd0d60f85ce1d6901fded4467ec4e9f13948092d586a3c762e453a987c843150767dce2de345dcea23e05c50c5c2cdf23a085e97b019a9c0aa6fd"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "config(daps) \
daps"

RDEPENDS:${PN} += "/bin/bash \
/bin/sh \
/usr/bin/python3 \
ImageMagick \
bash \
dia \
docbook-xsl-stylesheets \
docbook5-xsl-stylesheets \
docbook_4 \
docbook_5 \
inkscape \
java \
jing \
libxml2 \
libxslt \
make \
poppler-tools \
python3-lxml \
rubygem(ruby:3.2.0:asciidoctor) \
sgml-skel \
suse-xsl-stylesheets \
svg-schema \
xerces-j2 \
xml-apis \
xmlgraphics-fop \
xmlstarlet \
zip"

inherit rpm
