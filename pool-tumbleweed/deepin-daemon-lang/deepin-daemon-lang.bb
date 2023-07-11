SUMMARY = "Translations for package deepin-daemon"
DESCRIPTION = "Provides translations for the 'deepin-daemon' package."
LICENSE = "GPL-3.0-or-later"

PV = "5.14.45"

RPM_NAME = "deepin-daemon-lang-5.14.45-2.5.aarch64.rpm"
RPM_HASH = "9bc6ae375620def69ebd2516ddbc17f8e171561a4f417299e0a482a843a7e338e34fc5b2ffbe2264ceff36becc0819f0e4210b34e8b546e048793b5ff28db7a1"

RPROVIDES:${PN} += "deepin-daemon-lang"

RDEPENDS:${PN} += "deepin-daemon"

inherit rpm
