SUMMARY = "XHTML DTDs (Document Type Definitions)"
DESCRIPTION = "Document Type Definitions (DTDs) for XHTML 1/1.1 and some modularized \
variants."
LICENSE = "SUSE-Public-Domain"

PV = "2006.8.16"

RPM_NAME = "xhtml-dtd-2006.8.16-17.15.noarch.rpm"
RPM_HASH = "eaa2d92903c20c18bfdaface2a4b123317895e98195ff6db4c6dd1d7564b7770b1466ba511799d86b486e2ad308dcdfb9cb1b3b12eede9e0ebb4348c00ed3f2b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "config(xhtml-dtd) \
xhtml-dtd"

RDEPENDS:${PN} += "/bin/sh \
/usr/bin/sgml-register-catalog \
/usr/bin/xmlcatalog \
libxml2 \
sgml-skel"

inherit rpm
