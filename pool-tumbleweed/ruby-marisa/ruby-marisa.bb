SUMMARY = "Ruby bindings for marisa"
DESCRIPTION = "Ruby bindings for marisa."
LICENSE = "LGPL-2.1-or-later | BSD-2-Clause"

PV = "0.2.6"

RPM_NAME = "ruby-marisa-0.2.6-1.23.aarch64.rpm"
RPM_HASH = "205af5af08a7aed080d5220b787b2994a0ba88635f53b44c91410168281271435f3a5f01e70678dccc1f5759c0effe9344a9e9288e6dd3ef077a4152831a70e7"

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
