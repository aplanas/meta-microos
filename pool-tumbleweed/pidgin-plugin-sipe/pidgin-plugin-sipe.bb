SUMMARY = "Pidgin protocol plugin to connect to MS Skype for Business"
DESCRIPTION = "A third-party plugin for the Pidgin multi-protocol instant \
messenger. It implements the extended version of SIP/SIMPLE used by \
various products: \
 * Skype for Business. \
 * Microsoft Office 365. \
 * Microsoft Business Productivity Online Suite (BPOS). \
 * Microsoft Lync Server. \
 * Microsoft Office Communications Server (OCS 2007/2007 R2). \
 * Microsoft Live Communications Server (LCS 2003/2005). \
 * Reuters Messaging. \
 \
With this plugin you should be able to replace your \
Skype for Business client with Pidgin. \
 \
This package provides the icon set for Pidgin."
LICENSE = "GPL-2.0-or-later"

PV = "1.25.0"

RPM_NAME = "pidgin-plugin-sipe-1.25.0-2.10.noarch.rpm"
RPM_HASH = "a2e7fa44f1d9d06d3f97df4b6e5494bdab58afa3065688301665e6f2984f8f3ba5c89bed2f3e0be801ff76c970507c89f3857faa0ad75c3223081f1b857e7822"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "metainfo() \
metainfo(pidgin-sipe.metainfo.xml) \
pidgin-plugin-sipe \
pidgin-sipe"

RDEPENDS:${PN} += "libpurple-plugin-sipe"

inherit rpm
