SUMMARY = "Search Mailboxes for a Particular E-Mail"
DESCRIPTION = "Grepmail searches a normal, gzipped, bzipped, or tzipped mailbox for a \
given regular expression, and returns any e-mails that match that \
expression. Piped input is allowed and date restrictions are supported."
LICENSE = "GPL-2.0+"

PV = "5.3104"

RPM_NAME = "grepmail-5.3104-2.20.noarch.rpm"
RPM_HASH = "27a752312253de735732ebbdc7cb50769853b7deece2807bf6024122168e4da46585d6155eb0aaf47fa30ce056f371851d379be0e5f77f00096d8bc1c94f154c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "grepmail"

RDEPENDS:${PN} += "/usr/bin/perl \
perl--MODULE-COMPAT-5.36.1 \
perl-Date--Parse \
perl-Mail--Mbox--MessageParser \
perl-Time--Local"

inherit rpm
