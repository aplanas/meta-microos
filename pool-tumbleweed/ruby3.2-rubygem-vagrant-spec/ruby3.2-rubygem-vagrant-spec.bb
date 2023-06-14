SUMMARY = "Tool and library for testing Vagrant plugins"
DESCRIPTION = "vagrant-spec is a both a specification of how Vagrant and its various \
components should behave as well as a library of testing helpers that let you \
write your own unit and acceptance tests for Vagrant. \
 \
The library provides a set of helper methods in addition to RSpec matchers and \
expectations to help you both unit test and acceptance test Vagrant \
components. The RSpec components are built on top of the helper methods so \
that the test library can be used with your test framework of choice, but the \
entire tool is geared very heavily towards RSpec."
LICENSE = "MPL-2.0"

PV = "0.0.1.1663083445.c177981.git"

RPM_NAME = "ruby3.2-rubygem-vagrant-spec-0.0.1.1663083445.c177981.git-1.6.aarch64.rpm"
RPM_HASH = "34731bc020040a104f115be7e4ed3e388bed1450835577bdf451d7a9aac349035c10caa991a6def6f268ccdcf2e6df2fe452ae6625b61634061465812578e548"

RPROVIDES:${PN} += "ruby3.2-rubygem-vagrant-spec \
rubygem-ruby-3.2.0-vagrant-spec \
rubygem-ruby-3.2.0-vagrant-spec-0 \
rubygem-ruby-3.2.0-vagrant-spec-0.0 \
rubygem-ruby-3.2.0-vagrant-spec-0.0.1 \
rubygem-vagrant-spec"

RDEPENDS:${PN} += "/bin/bash \
/bin/sh \
/usr/bin/ruby.ruby3.2 \
ruby-abi \
rubygem-ruby-3.2.0-childprocess \
rubygem-ruby-3.2.0-log4r-1.1 \
rubygem-ruby-3.2.0-rspec-3 \
rubygem-ruby-3.2.0-thor-1 \
update-alternatives"

inherit rpm
