SUMMARY = "Grep-Like Text Finder"
DESCRIPTION = "ack is a grep-like tool tailored to working with large trees of source code."
LICENSE = "Artistic-2.0"

PV = "3.7.0"

RPM_NAME = "ack-3.7.0-1.3.noarch.rpm"
RPM_HASH = "70f3edacb1476c43299e8c4f282d9f5bf08a414ae48c84dbda82707a3ea9c327ae809fe155c394c38d415d0cba50d3ef48134a70d5cb25075433de21cd1a07b3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ack"

RDEPENDS:${PN} += "/usr/bin/perl \
perl \
perl-App-Ack \
perl-base"

inherit rpm
