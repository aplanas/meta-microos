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

RPM_NAME = "perl-Net-SMTP-SSL-1.04-1.23.noarch.rpm"
RPM_HASH = "b655c44790d7f28c27858b6a265bd65a4b4d57cd2e72833e8b3975d1810a3b6dd0a9c01ba2051309977c469e46a1c3dedd2c0f3dfe0343a3630da1ff577f7a3c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl(Net::SMTP::SSL) \
perl-Net-SMTP-SSL"
RDEPENDS:${PN} += "perl(:MODULE_COMPAT_5.36.0) \
perl(IO::Socket::SSL)"

inherit rpm
