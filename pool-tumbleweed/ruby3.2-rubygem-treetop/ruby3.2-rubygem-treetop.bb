SUMMARY = "A Ruby-based text parsing and interpretation DSL"
DESCRIPTION = "A Parsing Expression Grammar (PEG) Parser generator DSL for Ruby."
LICENSE = "MIT"

PV = "1.6.12"

RPM_NAME = "ruby3.2-rubygem-treetop-1.6.12-1.4.aarch64.rpm"
RPM_HASH = "9e4bd3c0f53c4364783652be589d49bfae1684236715463db1808d6a31826cb3ee8c794948131cfce342c27dea01165f525672129ed67999918acc3c642a77dd"

RPROVIDES:${PN} += "ruby3.2-rubygem-treetop \
ruby3.2-rubygem-treetop(aarch-64) \
rubygem(ruby:3.2.0:treetop) \
rubygem(ruby:3.2.0:treetop:1) \
rubygem(ruby:3.2.0:treetop:1.6) \
rubygem(ruby:3.2.0:treetop:1.6.12) \
rubygem(treetop)"

RDEPENDS:${PN} += "/bin/sh \
/usr/bin/ruby.ruby3.2 \
ruby(abi) \
rubygem(ruby:3.2.0:polyglot:0) \
update-alternatives"

inherit rpm
