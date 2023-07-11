SUMMARY = "Intel OSPM plugin for connman"
DESCRIPTION = "Provides Intel OSPM support for Connman (Connection Manager)."
LICENSE = "GPL-2.0-only"

PV = "1.41"

RPM_NAME = "connman-plugin-iospm-1.41-4.8.aarch64.rpm"
RPM_HASH = "164c0d6ba8781901cc505d90d5d6e0bb545110df11b1acb1605e7b22053fb16fa756bac2625fd82cc249f54a590daa7e5cd66de63fbec21de328a30a651518fc"

RPROVIDES:${PN} += "connman-plugin-iospm"

RDEPENDS:${PN} += "connman \
ppp"

inherit rpm
