SUMMARY = "Documentation tool for consistent and usable documentation in Ruby"
DESCRIPTION = "YARD is a documentation generation tool for the Ruby programming language. \
It enables the user to generate consistent, usable documentation that can be \
exported to a number of formats very easily, and also supports extending for \
custom Ruby constructs such as custom class level definitions."
LICENSE = "MIT"

PV = "0.9.28"

RPM_NAME = "ruby3.2-rubygem-yard-0.9.28-1.7.aarch64.rpm"
RPM_HASH = "ed70d1986b1d39d60cf36ed21fc8ab77fd081bba4ccb21377dc72c0926fab5d42af512bfde2041fbda4c2a9a6eebc64a6e6a64b63902b6694a3e15e3f088edb7"

RPROVIDES:${PN} += "ruby3.2-rubygem-yard \
rubygem-ruby-3.2.0-yard \
rubygem-ruby-3.2.0-yard-0 \
rubygem-ruby-3.2.0-yard-0.9 \
rubygem-ruby-3.2.0-yard-0.9.28 \
rubygem-yard"

RDEPENDS:${PN} += "/usr/bin/ruby.ruby3.2 \
/usr/bin/sh \
ruby-abi \
rubygem-ruby-3.2.0-webrick-1.7 \
update-alternatives"

inherit rpm
