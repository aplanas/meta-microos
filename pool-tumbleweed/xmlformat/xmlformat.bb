SUMMARY = "XML document formatter"
DESCRIPTION = "xmlformat is a configurable formatter (or 'pretty-printer') for XML \
documents. It provides control over indentation, line-breaking, and text \
wrapping. These properties can be defined on a per-element basis. \
 \
xmlformat provides improved diagnostic information when a document is not \
well-formed. (Prints line and token number, and stack trace). \
 \
Based on Kitebird's original implementation v1.04"
LICENSE = "BSD-3-Clause & GPL-3.0-only"

PV = "1.9"

RPM_NAME = "xmlformat-1.9-1.9.noarch.rpm"
RPM_HASH = "5bb95fc0a8625d657d58df7dc63ab641b4c37e53bb88a84f8d327035a4f855d581c32f7b507850ff2e57c00524e8b16d5104d7eb8ef731b92bce11bc3d7c00cb"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "xmlformat"

RDEPENDS:${PN} += "/bin/sh \
/usr/bin/perl \
/usr/bin/ruby \
update-alternatives"

inherit rpm
