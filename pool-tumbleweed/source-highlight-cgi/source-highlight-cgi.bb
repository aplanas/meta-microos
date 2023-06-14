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

RPM_NAME = "source-highlight-cgi-3.1.9-5.7.aarch64.rpm"
RPM_HASH = "3e2073f844d4f80782b542bd718bee374d423d658539e7a4e07ad698188c1955841561267bca591f90d8a46d91041f8020a0522a4d2cbe91c23fd10382891e85"

RPROVIDES:${PN} += "config-source-highlight-cgi \
source-highlight-cgi"

RDEPENDS:${PN} += "apache2 \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libsource-highlight.so.4 \
libstdc++.so.6"

inherit rpm
