SUMMARY = "Ruby bindings for the YaST platform"
DESCRIPTION = "The bindings allow YaST modules to be written using the Ruby language \
and also Ruby scripts can use YaST agents, APIs and modules."
LICENSE = "GPL-2.0-only"

PV = "4.6.2"

RPM_NAME = "yast2-ruby-bindings-4.6.2-1.2.aarch64.rpm"
RPM_HASH = "674b17a9b028d12f7f14d75e3913f70c173187301cd113f59874e0653cc82b88bd296392397123e0b033a3a6d7fb8c3f9eb13868df1631885447354411154aa1"

RPROVIDES:${PN} += "libpy2lang-ruby.so \
yast2-ruby-bindings"

RDEPENDS:${PN} += "/usr/bin/ruby.ruby3.2 \
ld-linux-aarch64.so.1 \
libc.so.6 \
libcrypt.so.1 \
libgcc-s.so.1 \
libm.so.6 \
libpy2UI.so.2 \
libpy2scr.so.2 \
libpy2wfm.so.2 \
libruby3.2.so.3.2 \
libstdc++.so.6 \
liby2.so.4 \
libycp.so.5 \
ruby \
rubygem-ruby-3.2.0-fast-gettext \
yast2-core \
yast2-ycp-ui-bindings"

inherit rpm
