SUMMARY = "Convert html code into markdown"
DESCRIPTION = "Map simple html back into markdown, e.g. if you want to import existing html \
data in your application."
LICENSE = "WTFPL"

PV = "2.1.1"

RPM_NAME = "ruby3.2-rubygem-reverse_markdown-2.1.1-1.10.aarch64.rpm"
RPM_HASH = "46f92331db27d1475254ada39c1273acc24c138dcc933a4ada93dad8e5287d347d660dbd2da52afbe776c25655a9582c06e4834e35b386d41f11176158949c84"

RPROVIDES:${PN} += "ruby3.2-rubygem-reverse-markdown \
rubygem-reverse-markdown \
rubygem-ruby-3.2.0-reverse-markdown \
rubygem-ruby-3.2.0-reverse-markdown-2 \
rubygem-ruby-3.2.0-reverse-markdown-2.1 \
rubygem-ruby-3.2.0-reverse-markdown-2.1.1"

RDEPENDS:${PN} += "/usr/bin/ruby.ruby3.2 \
/usr/bin/sh \
ruby-abi \
rubygem-ruby-3.2.0-nokogiri \
update-alternatives"

inherit rpm
