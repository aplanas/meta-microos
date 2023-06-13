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

RPM_NAME = "mono-zeroconf-provider-avahi-0.9.0-22.18.noarch.rpm"
RPM_HASH = "923071042a01e0dff61e331b37822a8c8c7e23d6452fbf045102d0b428723e897a32b1a6509dfb51502dc44983faf0cc3c82425fc307551173bed8d74300e6bc"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "mono(Mono.Zeroconf.Providers.AvahiDBus) \
mono-zeroconf-provider \
mono-zeroconf-provider-avahi"

RDEPENDS:${PN} += "avahi \
mono(Mono.Posix) \
mono(Mono.Zeroconf) \
mono(System) \
mono(System.Xml) \
mono(mscorlib)"

inherit rpm
