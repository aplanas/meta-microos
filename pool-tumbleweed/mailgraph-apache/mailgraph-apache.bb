SUMMARY = "Files and dependencies to show mailgraph stats in apache"
DESCRIPTION = "This package contains files (and dependencies) to show the generated \
mailgraph statistics in an apache webserver. \
 \
Mailgraph is a very simple mail statistics RRDtool frontend for Postfix \
that produces daily, weekly, monthly and yearly graphs of received/sent \
and bounced/rejected mail (SMTP traffic)."
LICENSE = "GPL-2.0-or-later"

PV = "1.14"

RPM_NAME = "mailgraph-apache-1.14-9.6.noarch.rpm"
RPM_HASH = "60c0a49e384c4aa304b18144d63b03a504ba1acb67c44d0f96c2ec12654feed949d846e00084e91b77322ac261340739605b787b62d4e53f19636fc38170dc65"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "mailgraph-apache"

RDEPENDS:${PN} += "/usr/bin/perl \
apache2-mod-perl \
mailgraph"

inherit rpm
