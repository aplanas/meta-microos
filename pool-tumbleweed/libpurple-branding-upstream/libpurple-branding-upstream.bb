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

RPM_NAME = "libpurple-branding-upstream-2.14.12-1.3.noarch.rpm"
RPM_HASH = "2a532300db1716d4b4c682c0ac74a9137c3966d3843854797f1ba1f4e6a047664bf17d50e7d9f0aef6edff41a8d25d98b922a6f88ec285cc604d17d40610a5f6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "config(libpurple-branding-upstream) \
libpurple-branding \
libpurple-branding-upstream"

RDEPENDS:${PN} += "libpurple"

inherit rpm
