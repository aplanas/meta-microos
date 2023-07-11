SUMMARY = "Daemon for creating and maintaining an ISATAP client tunnel (RFC 5214)"
DESCRIPTION = "The daemon uses the in-kernel ISATAP support first introduced in Linux 2.6.25. \
It does NOT operate the tunnel or handle any IPv6 traffic, it only sets \
up the tunnel parameters, the Potential Router List, sends periodic \
router solicitations and tries to detect link changes."
LICENSE = "GPL-2.0-or-later"

PV = "0.9.7+git.20141015"

RPM_NAME = "isatapd-0.9.7+git.20141015-3.8.aarch64.rpm"
RPM_HASH = "61e8209f43878d493a1bf4a57fd19bf70cfee14e9d5de5d310bea1cdcef7b255ea8530bdaa31e287862f76634dcd46c392613a7c07bee933554741ec37209940"

RPROVIDES:${PN} += "isatapd"

RDEPENDS:${PN} += "/usr/bin/mkdir \
/usr/bin/sh \
/usr/bin/touch \
fillup \
ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm
