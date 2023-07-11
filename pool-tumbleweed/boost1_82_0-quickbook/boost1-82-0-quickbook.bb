SUMMARY = "Documentation tool geared towards C++"
DESCRIPTION = "QuickBook is a WikiWiki style documentation tool geared towards C++ \
documentation using simple rules and markup for simple formatting \
tasks."
LICENSE = "BSL-1.0"

PV = "1.82.0"

RPM_NAME = "boost1_82_0-quickbook-1.82.0-1.2.aarch64.rpm"
RPM_HASH = "c420d7822c1d91851ee49a318b9f90ac908b61c337ae2119f2973fe57feb4b06ebd225cd59620475b02d1d780788d97823f908b9b2d7f8ed92dd6686db4d5e03"

RPROVIDES:${PN} += "boost1-82-0-quickbook \
quickbook"

RDEPENDS:${PN} += "boost-license1-82-0 \
libc.so.6 \
libgcc-s.so.1 \
libm.so.6 \
libstdc++.so.6"

inherit rpm
