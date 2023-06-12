SUMMARY = "Small Wrapper Scripts for Processing DocBook Files"
DESCRIPTION = "The docbook-utils package is a set of a few small programs intended to \
ease everyday use of technical documentation software based on the \
DocBook DTD, either written in SGML or XML. \
 \
Tasks they currently accomplish are: * jw: convert SGML files to \
   other formats (HTML, RTF, PostScript, PDF) \
 \
* sgmldiff: detect the differences in markup between two SGML files"
LICENSE = "LGPL-2.1+"

PV = "0.6.14"

RPM_NAME = "docbook-utils-minimal-0.6.14-239.16.noarch.rpm"
RPM_HASH = "a9c84b753c262c6ecc431eaa192c491562632fe8c8a8db435b7ce7821b91b10a68ba84b8608b98ad0b2cfc5694a597d68b0d2545a221f927a1e6461b2ec1b4ab"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "docbook-utils-minimal"
RDEPENDS:${PN} += "/bin/sh \
/usr/bin/perl \
docbook-dsssl-stylesheets \
docbook_3 \
docbook_4 \
iso_ent \
openjade \
opensp \
perl-SGMLS \
sgml-skel"

inherit rpm
