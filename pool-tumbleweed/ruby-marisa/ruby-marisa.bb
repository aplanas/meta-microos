SUMMARY = "Ruby bindings for marisa"
DESCRIPTION = "Ruby bindings for marisa."
LICENSE = "LGPL-2.1-or-later | BSD-2-Clause"

PV = "0.2.6"

RPM_NAME = "ruby-marisa-0.2.6-1.24.aarch64.rpm"
RPM_HASH = "6317d54cb3e91ea5eb1e6001f5e7a7c420a144078966b901a5c5176dd9b6dcb59ce46b6a9510f15a4737384620368ee277d2414cb3c9228d0e95baa0a48c7186"

RPROVIDES:${PN} += "ruby-marisa"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libm.so.6 \
libmarisa.so.0 \
libruby3.2.so.3.2 \
libstdc++.so.6 \
marisa \
ruby"

inherit rpm
