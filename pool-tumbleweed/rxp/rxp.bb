SUMMARY = "XML Parser in C"
DESCRIPTION = "The current version of RXP supports XML 1.1, Namespaces 1.1, xml:id, \
and XML Catalogs. To use an XML Catalog, set the environment variable \
XML_CATALOG_FILES to a space-separated list of catalog files. \
 \
RXP was written by Richard Tobin at the Language Technology Group, \
Human Communication Research Centre, University of Edinburgh. \
 \
A simple application (called rxp) is provided. It parses and writes XML \
data, optionally expanding entities, defaulting attributes, and \
translating to a different output encoding. \
 \
Bug reports should be sent to richard@cogsci.ed.ac.uk. \
 \
 \
 \
Authors: \
-------- \
    Richard Tobin <richard@cogsci.ed.ac.uk>"
LICENSE = "GPL-2.0+"

PV = "1.4.8"

RPM_NAME = "rxp-1.4.8-93.29.aarch64.rpm"
RPM_HASH = "b4a313d296abd09e89601ab83e8961950d83ad75e5d2c05926c6801304088ea0c00b9ce580bd2d5df47975d99c4d16e507680039d0af0990b77730839425bcda"

RPROVIDES:${PN} += "rxp"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm
