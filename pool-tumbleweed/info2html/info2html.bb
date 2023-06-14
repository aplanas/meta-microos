SUMMARY = "Program to Convert Info Pages into HTML Pages"
DESCRIPTION = "This package contains the CGI script 'info2html' that creates HTML pages \
from info documents on demand, to be sent over the HTTP protocol. \
 \
Follow references to nodes in info documents to view the corresponding info \
files in HTML. \
 \
 \
Authors: \
-------- \
    Karl Guggisberg  <guggis@iam.unibe.ch>"
LICENSE = "GPL-2.0-or-later"

PV = "2.0"

RPM_NAME = "info2html-2.0-221.8.noarch.rpm"
RPM_HASH = "4e9b8157501b2505d5ac997a20b35df0154bea5858a5928ea41d5f4ecf7b156d47bc0a726e0c522f0c2f6bf10c4434e89b0ce0a7e4c045bf4b1b8697c9012c3f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "config-info2html \
inf2htm \
info2html"

RDEPENDS:${PN} += "/usr/bin/perl"

inherit rpm
