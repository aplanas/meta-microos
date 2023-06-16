SUMMARY = "An implementation of the AsciiDoc text processor and publishing"
DESCRIPTION = "A fast, open source text processor and publishing toolchain for converting \
AsciiDoc content to HTML 5, DocBook 5, and other formats."
LICENSE = "MIT"

PV = "2.0.18"

RPM_NAME = "ruby3.2-rubygem-asciidoctor-2.0.18-1.6.aarch64.rpm"
RPM_HASH = "1a579b9a9eef5a0a95f48b6b144d4d2384f1a0f356b62f89e61711f0a80278cebede11421e605d71913d75da26f1c17b5952294af1e2c2684e071d6b0faa1af5"

RPROVIDES:${PN} += "ruby3.2-rubygem-asciidoctor \
rubygem-asciidoctor \
rubygem-ruby-3.2.0-asciidoctor \
rubygem-ruby-3.2.0-asciidoctor-2 \
rubygem-ruby-3.2.0-asciidoctor-2.0 \
rubygem-ruby-3.2.0-asciidoctor-2.0.18"

RDEPENDS:${PN} += "/usr/bin/ruby.ruby3.2 \
/usr/bin/sh \
ruby-abi \
update-alternatives"

inherit rpm
