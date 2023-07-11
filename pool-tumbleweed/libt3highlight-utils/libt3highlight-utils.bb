SUMMARY = "Utilities for working with libt3highlight"
DESCRIPTION = "libt3highlight is a library that provides functions for syntax \
highlighting different types of text files. \
 \
This subpackage contains the T3 highlighting utility."
LICENSE = "GPL-3.0-only"

PV = "0.5.0"

RPM_NAME = "libt3highlight-utils-0.5.0-1.16.aarch64.rpm"
RPM_HASH = "e6d3138cd8254ce543e878c172141cf9c984cc3cab602aeb5ccb68118644a7c546beb38d95140d43010b16c896e973a1365b16eebce4b3b13c7ead75f22494d0"

RPROVIDES:${PN} += "libt3highlight-utils"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libt3config.so.0 \
libt3highlight.so.2"

inherit rpm
