SUMMARY = "Search Mailboxes for a Particular E-Mail"
DESCRIPTION = "Grepmail searches a normal, gzipped, bzipped, or tzipped mailbox for a \
given regular expression, and returns any e-mails that match that \
expression. Piped input is allowed and date restrictions are supported."
LICENSE = "GPL-2.0+"

PV = "5.3104"

RPM_NAME = "grepmail-5.3104-2.21.noarch.rpm"
RPM_HASH = "eb8c74c98bf395935e750c930b5b2fc228c4ff51876792046781f04966add3e157a6c5837809de2b80d56c7b529e7f8865fb59f4b2b8db5dac20e693a3bba31c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "grepmail"

RDEPENDS:${PN} += "/usr/bin/perl \
perl--MODULE-COMPAT-5.38.0 \
perl-Date--Parse \
perl-Mail--Mbox--MessageParser \
perl-Time--Local"

inherit rpm
