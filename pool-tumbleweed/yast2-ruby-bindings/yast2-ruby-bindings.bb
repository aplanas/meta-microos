SUMMARY = "Ruby bindings for the YaST platform"
DESCRIPTION = "The bindings allow YaST modules to be written using the Ruby language \
and also Ruby scripts can use YaST agents, APIs and modules."
LICENSE = "GPL-2.0-only"

PV = "4.6.2"

RPM_NAME = "yast2-ruby-bindings-4.6.2-1.1.aarch64.rpm"
RPM_HASH = "4553f65cb6f2b4e2868987062921e30aa949d26522732f5d3fc8dfc6ff932868e8d665f2cc2d24fcf6a44d286c1dfe467578090bda18678f06161d225139cfdb"

RPROVIDES:${PN} += "libpy2lang_ruby.so()(64bit) \
yast2-ruby-bindings \
yast2-ruby-bindings(aarch-64)"

RDEPENDS:${PN} += "/usr/bin/ruby.ruby3.2 \
ld-linux-aarch64.so.1()(64bit) \
libc.so.6()(64bit) \
libcrypt.so.1()(64bit) \
libgcc_s.so.1()(64bit) \
libm.so.6()(64bit) \
libpy2UI.so.2()(64bit) \
libpy2scr.so.2()(64bit) \
libpy2wfm.so.2()(64bit) \
libruby3.2.so.3.2()(64bit) \
libstdc++.so.6()(64bit) \
liby2.so.4()(64bit) \
libycp.so.5()(64bit) \
ruby \
rubygem(ruby:3.2.0:fast_gettext) \
yast2-core \
yast2-ycp-ui-bindings"

inherit rpm
