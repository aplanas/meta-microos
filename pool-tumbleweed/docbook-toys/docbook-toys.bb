SUMMARY = "DocBook Tools"
DESCRIPTION = "A shell script to convert SGML documents based on the DocBook DTD. \
 \
For usage information read: \
 \
/usr/share/doc/packages/docbook-toys/README"
LICENSE = "GPL-2.0-or-later"

PV = "1.51.0"

RPM_NAME = "docbook-toys-1.51.0-439.1.noarch.rpm"
RPM_HASH = "c96c97416effbbfe79c0ad09a66eeba8fd36a01941c95687109bc8468e4b905e62a6360f8bde2ae934d9275ea228bb7134915f125ffcfbadaaeda07b7a2a7154"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "config-docbook-toys \
docbook-tools \
docbook-toys"

RDEPENDS:${PN} += "/usr/bin/bash \
/usr/bin/sh \
docbook-3 \
docbook-4 \
docbook-dsssl-stylesheets \
iso-ent \
openjade \
texlive-jadetex"

inherit rpm
