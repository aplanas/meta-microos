SUMMARY = "Files and dependencies to show mailgraph stats in apache"
DESCRIPTION = "This package contains files (and dependencies) to show the generated \
mailgraph statistics in an apache webserver. \
 \
Mailgraph is a very simple mail statistics RRDtool frontend for Postfix \
that produces daily, weekly, monthly and yearly graphs of received/sent \
and bounced/rejected mail (SMTP traffic)."
LICENSE = "GPL-2.0-or-later"

PV = "1.14"

RPM_NAME = "mailgraph-apache-1.14-9.7.noarch.rpm"
RPM_HASH = "18a53e519170da7da4891a8c37c595dd4d3b0a68fb07e612e14ebcebc9a9dbd14c931bff8e6344d5c199f7560909f30630cc1fd266d9f6ac95ca65845ffba8d2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "mailgraph-apache"

RDEPENDS:${PN} += "/usr/bin/perl \
apache2-mod-perl \
mailgraph"

inherit rpm
