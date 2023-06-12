SUMMARY = "Documentation tool for consistent and usable documentation in Ruby"
DESCRIPTION = "YARD is a documentation generation tool for the Ruby programming language. \
It enables the user to generate consistent, usable documentation that can be \
exported to a number of formats very easily, and also supports extending for \
custom Ruby constructs such as custom class level definitions."
LICENSE = "MIT"

PV = "0.9.28"

RPM_NAME = "ruby3.2-rubygem-yard-0.9.28-1.6.aarch64.rpm"
RPM_HASH = "531cb652386d966f47d283327b53efa0f138cdc4c9bd46bcc3ce2eb4c59d8d236d57b3854dfe69c32cdc039d422b24dea039f60bbb37e2bb0cfd74f1624c3b4c"

RPROVIDES:${PN} += "ruby3.2-rubygem-yard \
ruby3.2-rubygem-yard(aarch-64) \
rubygem(ruby:3.2.0:yard) \
rubygem(ruby:3.2.0:yard:0) \
rubygem(ruby:3.2.0:yard:0.9) \
rubygem(ruby:3.2.0:yard:0.9.28) \
rubygem(yard)"
RDEPENDS:${PN} += "/bin/sh \
/usr/bin/ruby.ruby3.2 \
ruby(abi) \
rubygem(ruby:3.2.0:webrick:1.7) \
update-alternatives"

inherit rpm
