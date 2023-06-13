SUMMARY = "A cross platform Zero Configuration Networking library for Mono"
DESCRIPTION = "Mono.Zeroconf is a cross platform Zero Configuration Networking library \
for Mono and .NET. It provides a unified API for performing the most \
common zeroconf operations on a variety of platforms and subsystems: \
all the operating systems supported by Mono and both the Avahi and \
Bonjour/mDNSResponder transports. \
 \
 \
 \
Authors: \
-------- \
    Aaron Bockover <abockover@novell.com>"
LICENSE = "MIT"

PV = "0.9.0"

RPM_NAME = "mono-zeroconf-doc-0.9.0-22.18.noarch.rpm"
RPM_HASH = "6a46e6085b7ab7e82c25c651ca6578f009e8c8814dad25184130ea012fe0c1eed7e78d26391d569f93a4e4c5e73663a184b915d30de08fb3c713b7c4e5372b9d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "mono-zeroconf-doc"

RDEPENDS:${PN} += ""

inherit rpm
