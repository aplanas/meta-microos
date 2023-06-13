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

RPM_NAME = "htdig-3.2.0b6-244.11.aarch64.rpm"
RPM_HASH = "799e191e0e30cab7a697dae2ffbf5e9c1e3ce12bbb22f297958650813d649805373a1e83f08b9c504f86bcbd9d9c250fd557318e6c625da3d057a46ab0fba60a"

RPROVIDES:${PN} += "config(htdig) \
htdig \
htdig(aarch-64) \
libcommon-3.2.0.so()(64bit) \
libfuzzy-3.2.0.so()(64bit) \
libht-3.2.0.so()(64bit) \
libhtdb-3.2.0.so()(64bit) \
libhtnet-3.2.0.so()(64bit) \
libhtword-3.2.0.so()(64bit)"

RDEPENDS:${PN} += "/bin/sh \
ld-linux-aarch64.so.1()(64bit) \
libc.so.6()(64bit) \
libm.so.6()(64bit) \
libssl.so.3()(64bit) \
libstdc++.so.6()(64bit) \
libz.so.1()(64bit)"

inherit rpm
