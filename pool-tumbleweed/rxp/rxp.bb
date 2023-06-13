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

RPM_NAME = "rxp-1.4.8-93.28.aarch64.rpm"
RPM_HASH = "3a47103407c9017fde414ae220dd4b5ce2bb99d5c6d9864996873f27457f8956a71b7ef7838ea91666dac29552346496ea03765da0484c4023c8c5513c1c6d51"

RPROVIDES:${PN} += "rxp \
rxp(aarch-64)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.34)(64bit)"

inherit rpm
