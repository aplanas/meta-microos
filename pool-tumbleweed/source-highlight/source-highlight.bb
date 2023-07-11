SUMMARY = "Source Code Highlighter with Support for Many Languages"
DESCRIPTION = "Source-highlight reads source language specifications dynamically, thus it can \
be easily extended (without recompiling the sources) for handling new \
languages. It also reads output format specifications dynamically, and thus it \
can be easily extended (without recompiling the sources) for handling new \
output formats. The syntax for these specifications is quite easy (take a look \
at the manual)."
LICENSE = "GPL-3.0-only"

PV = "3.1.9"

RPM_NAME = "source-highlight-3.1.9-5.8.aarch64.rpm"
RPM_HASH = "06d6c11a77445157283f93e2b8bb7f5b20dec8df948d690a0aff7e69018c195e55f293e1ab3677084843d42975ad39c55251865dcd4a836af4368009cebf6569"

RPROVIDES:${PN} += "config-source-highlight \
source-highlight"

RDEPENDS:${PN} += "/usr/bin/bash \
/usr/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libsource-highlight.so.4 \
libstdc++.so.6"

inherit rpm
