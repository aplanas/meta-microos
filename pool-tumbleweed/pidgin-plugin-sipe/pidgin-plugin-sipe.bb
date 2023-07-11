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

RPM_NAME = "pidgin-plugin-sipe-1.25.0-2.12.noarch.rpm"
RPM_HASH = "5c7b64bc89a5f45cb9581d89170ce8bdc4799e2d76ac9a5eabc67a5fca08a3e35c70d88df78b2a384ef9dbf48aa54afd044b5ad735c46549bef8d9e92dbf2074"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "pidgin-plugin-sipe \
pidgin-sipe"

RDEPENDS:${PN} += "libpurple-plugin-sipe"

inherit rpm
