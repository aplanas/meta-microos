SUMMARY = "Squid Analysis Report Generator"
DESCRIPTION = "Sarg -- Squid Analysis Report Generator is a tool that allows you to \
view 'where' your users are going to on the Internet. Sarg generate \
reports in html, with fields such as: users, IP Addresses, bytes, \
sites, and times."
LICENSE = "GPL-2.0-or-later"

PV = "2.4.0"

RPM_NAME = "sarg-2.4.0-4.3.aarch64.rpm"
RPM_HASH = "9a1ddad6892732c29154712b772a6947fabbffd0a017f493603d69b3de63a578aa71ac482f99467658c22d0c2bbfc596750238f3cbfed877c2643c78ca77c072"

RPROVIDES:${PN} += "config-sarg \
sarg"

RDEPENDS:${PN} += "/bin/sh \
/usr/bin/mkdir \
/usr/bin/touch \
fillup \
ld-linux-aarch64.so.1 \
libbz2.so.1 \
libc.so.6 \
libgd.so.3 \
libldap.so.2 \
liblzma.so.5 \
libm.so.6 \
libpcre.so.1 \
libz.so.1"

inherit rpm
