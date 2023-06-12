SUMMARY = "Source code of google-quiche"
DESCRIPTION = "QUICHE (QUIC, Http/2, Etc) is Google‘s implementation of QUIC and related \
protocols. It powers Chromium as well as Google’s QUIC servers and some \
other projects. \
 \
This package contains source code of google-quiche."
LICENSE = "BSD-3-Clause & LGPL-2.1-or-later"

PV = "20190815"

RPM_NAME = "google-quiche-source-20190815-1.10.noarch.rpm"
RPM_HASH = "e569896f006a1bcfd41876cd16f2b3cf9b9b2b3f9025133e27bdbb3fef0c5208de6761c6003ca859baf1ef901aff8d50e291770579b4a34542aa54256ae62c68"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "google-quiche-source"
RDEPENDS:${PN} += ""

inherit rpm
