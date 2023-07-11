SUMMARY = "An implementation of the AsciiDoc text processor and publishing"
DESCRIPTION = "A fast, open source text processor and publishing toolchain for converting \
AsciiDoc content to HTML 5, DocBook 5, and other formats."
LICENSE = "MIT"

PV = "2.0.20"

RPM_NAME = "ruby3.2-rubygem-asciidoctor-2.0.20-1.1.aarch64.rpm"
RPM_HASH = "054431f57837c4c46c6eb6b5fd40f6721147916707b7c70249281de8b82ae400b3fbd5b54d3c4fc34cad851775e0b687d23f2a224a815e2606a490560479e3ce"

RPROVIDES:${PN} += "ruby3.2-rubygem-asciidoctor \
rubygem-asciidoctor \
rubygem-ruby-3.2.0-asciidoctor \
rubygem-ruby-3.2.0-asciidoctor-2 \
rubygem-ruby-3.2.0-asciidoctor-2.0 \
rubygem-ruby-3.2.0-asciidoctor-2.0.20"

RDEPENDS:${PN} += "/usr/bin/ruby.ruby3.2 \
/usr/bin/sh \
ruby-abi \
update-alternatives"

inherit rpm
