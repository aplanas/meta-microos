SUMMARY = "Documentation for mpop"
DESCRIPTION = "mpop is a small and fast POP3 client. Features include mail filtering, \
delivery to mbox files, maildir folders or a mail delivery agent, a \
very fast POP3 implementation, many authentication methods, good \
TLS/SSL support, IPv6 support, and more. \
 \
 \
This package contains documentation and sample configuration files."
LICENSE = "GPL-3.0-or-later"

PV = "1.4.18"

RPM_NAME = "mpop-doc-1.4.18-1.3.aarch64.rpm"
RPM_HASH = "0a29df321556a2d1e55a276f0297ab1f7a809d7d893b564b20b75e28361677e7594ee956f01166d2776095a86708313770958d710db7e0a70daf6de0aa54265f"

RPROVIDES:${PN} += "mpop-doc"

RDEPENDS:${PN} += "mpop"

inherit rpm
