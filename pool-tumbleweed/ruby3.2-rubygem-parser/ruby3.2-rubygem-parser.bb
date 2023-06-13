SUMMARY = "A Ruby parser written in pure Ruby"
DESCRIPTION = "A Ruby parser written in pure Ruby."
LICENSE = "MIT"

PV = "3.1.3.0"

RPM_NAME = "ruby3.2-rubygem-parser-3.1.3.0-1.4.aarch64.rpm"
RPM_HASH = "050624d2ebc5e2abe8fde7bb62c80a6c845ba009bb2c16b37955a506066e719625baf0eb10a08fc8f30d9f4781b8968e72bb43ded09cd692375ad6625bdb6f99"

RPROVIDES:${PN} += "ruby3.2-rubygem-parser \
ruby3.2-rubygem-parser(aarch-64) \
rubygem(parser) \
rubygem(ruby:3.2.0:parser) \
rubygem(ruby:3.2.0:parser:3) \
rubygem(ruby:3.2.0:parser:3.1) \
rubygem(ruby:3.2.0:parser:3.1.3)"

RDEPENDS:${PN} += "/bin/sh \
/usr/bin/ruby.ruby3.2 \
ruby(abi) \
rubygem(ruby:3.2.0:ast:2.4) \
update-alternatives"

inherit rpm
