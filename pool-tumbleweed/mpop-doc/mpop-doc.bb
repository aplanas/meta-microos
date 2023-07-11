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

RPM_NAME = "mpop-doc-1.4.18-1.4.aarch64.rpm"
RPM_HASH = "0915141c7ba3635337ac127e0e556a269b97878e30ab171f8614fc6165fcadd847574beffae10392dbb78e767e05a1d02532c1aa6399863cbccd6aa8cb42c33f"

RPROVIDES:${PN} += "mpop-doc"

RDEPENDS:${PN} += "mpop"

inherit rpm
