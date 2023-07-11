SUMMARY = "Development files for modsecurity, a web application firewall engine"
DESCRIPTION = "ModSecurity is a toolkit for real-time web application monitoring, logging, and \
access control. \
 \
This subpackage holds the development headers for the library."
LICENSE = "BSD-2-Clause"

PV = "3.0.9"

RPM_NAME = "modsecurity-devel-3.0.9-1.2.aarch64.rpm"
RPM_HASH = "a105ec875ed7c157a0360c1287b2c4ba8e070957f259ce42181a91f8371fb25eb27ffc87d162b2f84af40cc1e97a70cb3a1bcdb61fb2a2cdacf7838e40a59288"

RPROVIDES:${PN} += "modsecurity-devel \
pkgconfig-modsecurity"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libmodsecurity3"

inherit rpm
