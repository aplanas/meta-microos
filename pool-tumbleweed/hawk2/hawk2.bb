SUMMARY = "HA Web Konsole"
DESCRIPTION = "A web-based GUI for managing and monitoring the Pacemaker \
High-Availability cluster resource manager."
LICENSE = "GPL-2.0-only"

PV = "2.6.4+git.1682509819.1ff135ea"

RPM_NAME = "hawk2-2.6.4+git.1682509819.1ff135ea-1.1.aarch64.rpm"
RPM_HASH = "f004416939db8906e7b37e9e3fdc9fbaf789fb5ce939f7f01401e81cb92d4c2fa8558dfb5593de6559bc182467ddd37f71e8a0137cd5d5264d81676e39ed1b19"

RPROVIDES:${PN} += "ha-cluster-webui \
hawk \
hawk2 \
hawk2(aarch-64)"

RDEPENDS:${PN} += "/bin/bash \
/bin/sh \
/usr/bin/mkdir \
/usr/bin/ruby.ruby3.2 \
/usr/bin/touch \
crmsh \
dejavu \
fillup \
graphviz \
graphviz-gd \
hawk-apiserver \
iproute2 \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libpam.so.0()(64bit) \
libpam.so.0(LIBPAM_1.0)(64bit) \
pacemaker \
permissions \
rubygem(ruby:3.2.0:bundler) \
rubygem(ruby:3.2.0:execjs) \
rubygem(ruby:3.2.0:fast_gettext) \
rubygem(ruby:3.2.0:gettext_i18n_rails) \
rubygem(ruby:3.2.0:gettext_i18n_rails_js) \
rubygem(ruby:3.2.0:kramdown) \
rubygem(ruby:3.2.0:puma) \
rubygem(ruby:3.2.0:rails:7) \
rubygem(ruby:3.2.0:sass-rails:5) \
rubygem(ruby:3.2.0:sprockets:3.7) \
rubygem(ruby:3.2.0:uglifier) \
rubygem(ruby:3.2.0:virtus) \
rubygem(ruby:3.2.0:websocket-driver:0.7.5) \
systemd"

inherit rpm
