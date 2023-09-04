SUMMARY = "SSL support for Net::SMTP"
DESCRIPTION = "Implements the same API as Net::SMTP, but uses IO::Socket::SSL for its \
network operations. Due to the nature of 'Net::SMTP''s 'new' method, it is \
not overridden to make use of a default port for the SMTPS service. Perhaps \
future versions will be smart like that. Port '465' is usually what you \
want, and it's not a pain to specify that. \
 \
For interface documentation, please see Net::SMTP."
LICENSE = "GPL-1.0+ | Artistic-1.0"

PV = "1.04"

RPM_NAME = "perl-Net-SMTP-SSL-1.04-1.25.noarch.rpm"
RPM_HASH = "dbe257f07f3b1713222a568dd0a338143fb8366861bc765ec05483715587844096c240a86216ca454416c20f83bfdddf21dca4f143371c0e87a43dab1da0146b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-Net--SMTP--SSL \
perl-Net-SMTP-SSL"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.38.0 \
perl-IO--Socket--SSL"

inherit rpm
