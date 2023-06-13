SUMMARY = "GLib-based Instant Messenger Library -- openSUSE Default Configuration"
DESCRIPTION = "libpurple is a library intended to be used by programmers seeking \
to write an IM client that connects to many IM networks. \
 \
libpurple is compatible with the following chat networks out of the \
box: Jabber/XMPP, AIM, ICQ, Bonjour, Gadu-Gadu, IRC, SILC, SIMPLE, \
Novell GroupWise Messenger, Lotus Sametime, MXit, MySpaceIM, and \
Zephyr. It can support many more with plugins. \
 \
This package provides the openSUSE default configuration for libpurple."
LICENSE = "BSD-3-Clause"

PV = "42.2"

RPM_NAME = "libpurple-branding-openSUSE-42.2-1.23.noarch.rpm"
RPM_HASH = "b61c4de4788dab90ccfe1402fe6185aad2bbb478823490dd54cb62028b44ff3eea055ca5d0efcdcd265e6cf71ffefa1ce0e97a47c3a24d5c81f93de937bad7de"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "config(libpurple-branding-openSUSE) \
libpurple-branding \
libpurple-branding-openSUSE \
pidgin-branding-openSUSE"

RDEPENDS:${PN} += "libpurple"

inherit rpm
