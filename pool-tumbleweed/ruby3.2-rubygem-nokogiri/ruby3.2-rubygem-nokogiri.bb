SUMMARY = "Nokogiri (鋸) makes it easy and painless to work with XML and HTML"
DESCRIPTION = "Nokogiri (鋸) makes it easy and painless to work with XML and HTML from Ruby. \
It provides a \
sensible, easy-to-understand API for reading, writing, modifying, and querying \
documents. It is \
fast and standards-compliant by relying on native parsers like libxml2 (C) and \
xerces (Java)."
LICENSE = "MIT"

PV = "1.13.9"

RPM_NAME = "ruby3.2-rubygem-nokogiri-1.13.9-1.9.aarch64.rpm"
RPM_HASH = "0d1a20e5c570be479b4e08b7108b1bf90af74d5954f08177234766af7d5f941fd86b045bc1d1911e8495e0132cc233c6e3c62fc6d4ddd94e6b0de528d34deed3"

RPROVIDES:${PN} += "ruby3.2-rubygem-nokogiri \
rubygem-nokogiri \
rubygem-ruby-3.2.0-nokogiri \
rubygem-ruby-3.2.0-nokogiri-1 \
rubygem-ruby-3.2.0-nokogiri-1.13 \
rubygem-ruby-3.2.0-nokogiri-1.13.9"

RDEPENDS:${PN} += "/usr/bin/ruby.ruby3.2 \
/usr/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6 \
libexslt.so.0 \
libm.so.6 \
libruby3.2.so.3.2 \
libxml2.so.2 \
libxslt.so.1 \
libz.so.1 \
ruby-abi \
rubygem-ruby-3.2.0-racc-1 \
update-alternatives"

inherit rpm
