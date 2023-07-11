SUMMARY = "GLib-based Instant Messenger Library -- Upstream default configuration"
DESCRIPTION = "libpurple is a library intended to be used by programmers seeking \
to write an IM client that connects to many IM networks. \
 \
libpurple is compatible with the following chat networks out of the \
box: Jabber/XMPP, AIM, ICQ, Bonjour, Gadu-Gadu, IRC, SILC, SIMPLE, \
Novell GroupWise Messenger, IBM Sametime, and Zephyr. It can \
support many more with plugins. \
 \
This package provides the upstream default configuration for Pidgin."
LICENSE = "GPL-2.0-only"

PV = "2.14.12"

RPM_NAME = "libpurple-branding-upstream-2.14.12-1.4.noarch.rpm"
RPM_HASH = "93904554e4a0b7b37baf102beba942274429defb1c3372a6456e8508dbd2352b0d8f19a2d038d90390dfdbcf18ca55d02d56c5c76d306bf217e2fe0163cf86ee"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "config-libpurple-branding-upstream \
libpurple-branding \
libpurple-branding-upstream"

RDEPENDS:${PN} += "libpurple"

inherit rpm
