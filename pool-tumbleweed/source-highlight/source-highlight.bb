SUMMARY = "Source Code Highlighter with Support for Many Languages"
DESCRIPTION = "Source-highlight reads source language specifications dynamically, thus it can \
be easily extended (without recompiling the sources) for handling new \
languages. It also reads output format specifications dynamically, and thus it \
can be easily extended (without recompiling the sources) for handling new \
output formats. The syntax for these specifications is quite easy (take a look \
at the manual)."
LICENSE = "GPL-3.0-only"

PV = "3.1.9"

RPM_NAME = "source-highlight-3.1.9-5.7.aarch64.rpm"
RPM_HASH = "7d03dff7cf5b25afc393185c6c1783a9bbe6fae666dab2ae782e037b1bcc0aa7825effbd99e64b4e9bae9f64ed64e7c8e8718966fd6eda7f6a321243fbd76f30"

RPROVIDES:${PN} += "config(source-highlight) \
source-highlight \
source-highlight(aarch-64)"

RDEPENDS:${PN} += "/bin/sh \
/usr/bin/bash \
ld-linux-aarch64.so.1()(64bit) \
libc.so.6()(64bit) \
libgcc_s.so.1()(64bit) \
libsource-highlight.so.4()(64bit) \
libstdc++.so.6()(64bit)"

inherit rpm
