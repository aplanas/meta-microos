SUMMARY = "Ruby Development"
DESCRIPTION = "Tools and libraries for software development using the Ruby programming language."
LICENSE = "MIT"

PV = "20170319"

RPM_NAME = "patterns-devel-ruby-devel_ruby-20170319-2.13.aarch64.rpm"
RPM_HASH = "38da15d25c18607af324fbda06b98d533495f510e69e6cfa14c6c9ac7d7b2ba38b827453b58e043a953de44b2bebd93bada63e8079010da4f59cb5acca068a5a"

RPROVIDES:${PN} += "pattern() \
pattern-category() \
pattern-icon() \
pattern-order() \
pattern-visible() \
patterns-devel-ruby-devel_ruby \
patterns-devel-ruby-devel_ruby(aarch-64)"

RDEPENDS:${PN} += "ruby \
rubygems"

inherit rpm
