SUMMARY = "Repository mirroring tool and registration proxy for SCC"
DESCRIPTION = "This package provides a mirroring tool for RPM repositories and a registration \
proxy for the SUSE Customer Center (SCC). \
 \
As registration is required for SUSE products, the registration proxy allows \
one to register SUSE products within a private network. \
 \
It's possible to mirror SUSE, as well as openSUSE and other RPM repositories. \
SCC organization credentials are required to synchronize SUSE products, \
subscription information, and to mirror SUSE repositories. \
 \
RMT supersedes the main functionality of SMT in SLES 15."
LICENSE = "GPL-2.0-or-later"

PV = "2.13"

RPM_NAME = "rmt-server-2.13-1.1.aarch64.rpm"
RPM_HASH = "db451a2e74e2a167fe8dbbec253df1737aff7fc20011d9695a49669fe3556d9694a49ef8e65d232e26e0059cf5f5a64cf891cda4f76837f46dd0b155d01c4277"

RPROVIDES:${PN} += "bundled-rubygem(actionpack) \
bundled-rubygem(actionview) \
bundled-rubygem(active-model-serializers) \
bundled-rubygem(activemodel) \
bundled-rubygem(activerecord) \
bundled-rubygem(activesupport) \
bundled-rubygem(builder) \
bundled-rubygem(case-transform) \
bundled-rubygem(concurrent-ruby) \
bundled-rubygem(config) \
bundled-rubygem(crass) \
bundled-rubygem(deep-merge) \
bundled-rubygem(dry-configurable) \
bundled-rubygem(dry-container) \
bundled-rubygem(dry-core) \
bundled-rubygem(dry-equalizer) \
bundled-rubygem(dry-inflector) \
bundled-rubygem(dry-initializer) \
bundled-rubygem(dry-logic) \
bundled-rubygem(dry-schema) \
bundled-rubygem(dry-types) \
bundled-rubygem(dry-validation) \
bundled-rubygem(erubi) \
bundled-rubygem(ethon) \
bundled-rubygem(fast-gettext) \
bundled-rubygem(ffi) \
bundled-rubygem(gettext-i18n-rails) \
bundled-rubygem(i18n) \
bundled-rubygem(jsonapi-renderer) \
bundled-rubygem(jwt) \
bundled-rubygem(loofah) \
bundled-rubygem(method-source) \
bundled-rubygem(mini-portile2) \
bundled-rubygem(minitest) \
bundled-rubygem(mysql2) \
bundled-rubygem(nio4r) \
bundled-rubygem(nokogiri) \
bundled-rubygem(puma) \
bundled-rubygem(rack) \
bundled-rubygem(rack-test) \
bundled-rubygem(rails-dom-testing) \
bundled-rubygem(rails-html-sanitizer) \
bundled-rubygem(railties) \
bundled-rubygem(rake) \
bundled-rubygem(repomd-parser) \
bundled-rubygem(responders) \
bundled-rubygem(terminal-table) \
bundled-rubygem(thor) \
bundled-rubygem(typhoeus) \
bundled-rubygem(tzinfo) \
bundled-rubygem(unicode-display-width) \
bundled-rubygem(versionist) \
bundled-rubygem(yard) \
bundled-rubygem(zeitwerk) \
config-rmt-server \
rmt-server"

RDEPENDS:${PN} += "/bin/bash \
/bin/sh \
/usr/bin/ruby.ruby3.2 \
gpg2 \
ld-linux-aarch64.so.1 \
libc.so.6 \
libcrypto.so.3 \
libexslt.so.0 \
libffi.so.8 \
libm.so.6 \
libmariadb.so.3 \
libruby3.2.so.3.2 \
libssl.so.3 \
libxml2.so.2 \
libxslt.so.1 \
libz.so.1 \
rmt-server-configuration \
ruby3.2 \
ruby3.2-rubygem-bundler \
shadow \
timezone \
util-linux"

inherit rpm
