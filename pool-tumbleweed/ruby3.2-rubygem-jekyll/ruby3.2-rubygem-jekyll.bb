SUMMARY = "A simple, blog aware, static site generator"
DESCRIPTION = "Jekyll is a simple, blog aware, static site generator."
LICENSE = "MIT"

PV = "4.3.1"

RPM_NAME = "ruby3.2-rubygem-jekyll-4.3.1-1.6.aarch64.rpm"
RPM_HASH = "1c582e6407e56aac2a111298e886caa5f61ed34ed1ad26134aa234eef6116f21d84c68b476a491bd46f70fe822f057d7bcc860b1d82db7d090d66382e057b440"

RPROVIDES:${PN} += "ruby3.2-rubygem-jekyll \
rubygem-jekyll \
rubygem-ruby-3.2.0-jekyll \
rubygem-ruby-3.2.0-jekyll-4 \
rubygem-ruby-3.2.0-jekyll-4.3 \
rubygem-ruby-3.2.0-jekyll-4.3.1"

RDEPENDS:${PN} += "/usr/bin/ruby.ruby3.2 \
/usr/bin/sh \
ruby-abi \
rubygem-ruby-3.2.0-addressable-2 \
rubygem-ruby-3.2.0-colorator-1 \
rubygem-ruby-3.2.0-em-websocket-0 \
rubygem-ruby-3.2.0-i18n-1 \
rubygem-ruby-3.2.0-jekyll-sass-converter \
rubygem-ruby-3.2.0-jekyll-watch-2 \
rubygem-ruby-3.2.0-kramdown \
rubygem-ruby-3.2.0-kramdown-2 \
rubygem-ruby-3.2.0-kramdown-parser-gfm-1 \
rubygem-ruby-3.2.0-liquid-4 \
rubygem-ruby-3.2.0-mercenary \
rubygem-ruby-3.2.0-pathutil-0 \
rubygem-ruby-3.2.0-rouge \
rubygem-ruby-3.2.0-safe-yaml-1 \
rubygem-ruby-3.2.0-terminal-table \
rubygem-ruby-3.2.0-webrick-1 \
update-alternatives"

inherit rpm
