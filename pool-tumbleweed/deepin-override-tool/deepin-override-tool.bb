SUMMARY = "Deepin override tool"
DESCRIPTION = "This is a tool for Deepin to creat schemas override profiles."
LICENSE = "GPL-3.0-or-later"

PV = "5.10.11"

RPM_NAME = "deepin-override-tool-5.10.11-2.1.aarch64.rpm"
RPM_HASH = "9dea00fd61b9fe6d9ced349be60f1e8f416cfb62622574d1d595258fd577aee5517eb24328a0612305da7a6b2051887900b94274da9bf9d2dc9657d517f43441"

RPROVIDES:${PN} += "deepin-override-tool"

RDEPENDS:${PN} += "dconf"

inherit rpm
