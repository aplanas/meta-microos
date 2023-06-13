SUMMARY = "RSpec runner and formatters"
DESCRIPTION = "rspec-core provides the structure for writing executable examples of how your code should behave, and an rspec command with tools to constrain which examples get run and tailor the output."
LICENSE = "MIT"

PV = "3.5.4"

RPM_NAME = "ruby3.2-rubygem-rspec-core-3_5-3.5.4-1.26.aarch64.rpm"
RPM_HASH = "167f2e5f23b753256f24d845d757df821080fdbcec4f2f8e8e08965bde8df6e88b0526df1635d8cab0bfc8103435e6e7bf376136a507392034fa4f81fc31c27c"

RPROVIDES:${PN} += "ruby3.2-rubygem-rspec-core-3_5 \
ruby3.2-rubygem-rspec-core-3_5(aarch-64) \
rubygem(rspec-core) \
rubygem(ruby:3.2.0:rspec-core) \
rubygem(ruby:3.2.0:rspec-core:3) \
rubygem(ruby:3.2.0:rspec-core:3.5) \
rubygem(ruby:3.2.0:rspec-core:3.5.4)"

RDEPENDS:${PN} += "/bin/sh \
/usr/bin/ruby.ruby3.2 \
ruby(abi) \
rubygem(ruby:3.2.0:rspec-support:3.5) \
update-alternatives"

inherit rpm
