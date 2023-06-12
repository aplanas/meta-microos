SUMMARY = "Daemon for creating and maintaining an ISATAP client tunnel (RFC 5214)"
DESCRIPTION = "The daemon uses the in-kernel ISATAP support first introduced in Linux 2.6.25. \
It does NOT operate the tunnel or handle any IPv6 traffic, it only sets \
up the tunnel parameters, the Potential Router List, sends periodic \
router solicitations and tries to detect link changes."
LICENSE = "GPL-2.0-or-later"

PV = "0.9.7+git.20141015"

RPM_NAME = "isatapd-0.9.7+git.20141015-3.7.aarch64.rpm"
RPM_HASH = "7f40e4e77dc8392b89d32a1fa2f6a25a8139ac392b6d982a8ee9cf609d37922a2b171aad48c149367f05f28708333afb2665852c9a8566afacd61cfa6642d88f"

RPROVIDES:${PN} += "isatapd \
isatapd(aarch-64)"
RDEPENDS:${PN} += "/bin/sh \
/usr/bin/mkdir \
/usr/bin/touch \
fillup \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.34)(64bit)"

inherit rpm
