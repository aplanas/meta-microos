SUMMARY = "WWW Index and Search System"
DESCRIPTION = "The ht://Dig system is a complete World Wide Web index and search \
system for a small domain or intranet. This system is not meant to \
replace the need for powerful Internet-wide search systems like Lycos, \
Infoseek, Webcrawler, or AltaVista. Instead it is meant to cover the \
search needs of a single company, campus, or even a particular \
subsection of a Web site. \
 \
Unlike some WAIS-based or Web server-based search engines, ht://Dig can \
span several Web servers at a site. The type of these Web servers does \
not matter as long as they understand the HTTP 1.0 protocol."
LICENSE = "GPL-2.0-or-later"

PV = "3.2.0b6"

RPM_NAME = "htdig-3.2.0b6-244.12.aarch64.rpm"
RPM_HASH = "e275fb6154a5e94aa238cb1cee35440c4fe7fe0939a30873d948004f48d309258ad2186e7871ff5a8f8f42dcf2e682b1a6e7373e4779609636b9c60000f4f86f"

RPROVIDES:${PN} += "config-htdig \
htdig \
libcommon-3.2.0.so \
libfuzzy-3.2.0.so \
libht-3.2.0.so \
libhtdb-3.2.0.so \
libhtnet-3.2.0.so \
libhtword-3.2.0.so"

RDEPENDS:${PN} += "/usr/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6 \
libm.so.6 \
libssl.so.3 \
libstdc++.so.6 \
libz.so.1"

inherit rpm
