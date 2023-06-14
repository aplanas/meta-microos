SUMMARY = "Nokogiri (鋸) makes it easy and painless to work with XML and HTML"
DESCRIPTION = "Nokogiri (鋸) makes it easy and painless to work with XML and HTML from Ruby. \
It provides a \
sensible, easy-to-understand API for reading, writing, modifying, and querying \
documents. It is \
fast and standards-compliant by relying on native parsers like libxml2 (C) and \
xerces (Java)."
LICENSE = "MIT"

PV = "1.13.9"

RPM_NAME = "ruby3.2-rubygem-nokogiri-1.13.9-1.8.aarch64.rpm"
RPM_HASH = "93d982ce90af6b34adc2800f16b2512de1a98d0e55a28877d887776dd060d42e0a9d1358219207d40005fcac4fc6c22483fcc136b68922dd4b9b00e5c4fb4f83"

RPROVIDES:${PN} += "ruby3.2-rubygem-nokogiri \
rubygem-nokogiri \
rubygem-ruby-3.2.0-nokogiri \
rubygem-ruby-3.2.0-nokogiri-1 \
rubygem-ruby-3.2.0-nokogiri-1.13 \
rubygem-ruby-3.2.0-nokogiri-1.13.9"

RDEPENDS:${PN} += "/bin/sh \
/usr/bin/ruby.ruby3.2 \
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
