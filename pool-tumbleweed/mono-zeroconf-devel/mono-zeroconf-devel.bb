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

RPM_NAME = "mono-zeroconf-devel-0.9.0-22.18.noarch.rpm"
RPM_HASH = "83cac2a50696806bb6e1f01b312283a11364c6fc12024fe77d366b8fa5d72b658b542477e1c8b89dbedb56e9a0a3d593f04815187ea21dd886d19367958b50b3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "mono-zeroconf-devel \
pkgconfig(mono-zeroconf)"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
mono-zeroconf"

inherit rpm
