SUMMARY = "Gettext is a pure Ruby libary and tools to localize messages"
DESCRIPTION = "Gettext is a GNU gettext-like program for Ruby. \
The catalog file(po-file) is same format with GNU gettext. \
So you can use GNU gettext tools for maintaining."
LICENSE = "LGPL-3.0-or-later & Ruby"

PV = "3.4.3"

RPM_NAME = "ruby3.2-rubygem-gettext-3.4.3-1.6.aarch64.rpm"
RPM_HASH = "83a4e32099811ccdf7f937c6e0947b6a6cfc13c45814e9dfb04869bdaf459df90db849acb57edf931c22a54006930c34b6e78a3e25d33d5083827a5c43a15afc"

RPROVIDES:${PN} += "ruby3.2-rubygem-gettext \
rubygem-gettext \
rubygem-ruby-3.2.0-gettext \
rubygem-ruby-3.2.0-gettext-3 \
rubygem-ruby-3.2.0-gettext-3.4 \
rubygem-ruby-3.2.0-gettext-3.4.3"

RDEPENDS:${PN} += "/bin/sh \
/usr/bin/ruby.ruby3.2 \
ruby-abi \
rubygem-ruby-3.2.0-erubi \
rubygem-ruby-3.2.0-locale \
rubygem-ruby-3.2.0-prime \
rubygem-ruby-3.2.0-text \
update-alternatives"

inherit rpm
