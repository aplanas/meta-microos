SUMMARY = "Libpurple plugin to prevent Instant Message spam"
DESCRIPTION = "Bot Sentry is a libpurple plug-in to prevent Instant Message spam. \
It allows you to ignore IMs unless the sender is in your Buddy List \
or Allow List, or the sender correctly answers a question you have \
predefined."
LICENSE = "GPL-2.0+"

PV = "1.3.0"

RPM_NAME = "libpurple-plugin-bot-sentry-1.3.0-2.25.aarch64.rpm"
RPM_HASH = "6b9c7931d88146bce6048303c86205c21f8884237397e40a71399dc75171de82aa14449853be53e9b2003032334cc97845db4a9449716a7f4a47848d91e66d3d"

RPROVIDES:${PN} += "libpurple-plugin-bot-sentry \
pidgin-bot-sentry"

RDEPENDS:${PN} += "libc.so.6 \
libglib-2.0.so.0 \
libpurple.so.0"

inherit rpm
