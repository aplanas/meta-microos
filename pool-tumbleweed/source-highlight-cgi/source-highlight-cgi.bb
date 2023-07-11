SUMMARY = "Source Code Highlighting CGI"
DESCRIPTION = "Source-highlight reads source language specifications dynamically, thus it can \
be easily extended (without recompiling the sources) for handling new \
languages. It also reads output format specifications dynamically, and thus it \
can be easily extended (without recompiling the sources) for handling new \
output formats. The syntax for these specifications is quite easy (take a look \
at the manual). \
 \
This package contains a CGI that can be used to highlight source code on \
your webserver using source-highlight."
LICENSE = "GPL-3.0-only"

PV = "3.1.9"

RPM_NAME = "source-highlight-cgi-3.1.9-5.8.aarch64.rpm"
RPM_HASH = "7ba6e5673e394597eee099cff3f33c82510b3dae8d79319e1a5f4159f6b30f6279f44dd0e49981b2b9da16d4065713d79faba245e713eff3396978d1a7caaf31"

RPROVIDES:${PN} += "config-source-highlight-cgi \
source-highlight-cgi"

RDEPENDS:${PN} += "apache2 \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libsource-highlight.so.4 \
libstdc++.so.6"

inherit rpm
