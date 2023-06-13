SUMMARY = "Ruby module for reading and writing zip files"
DESCRIPTION = "rubyzip is a ruby module for reading and writing zip files."
LICENSE = "BSD-2-Clause"

PV = "2.3.2"

RPM_NAME = "ruby3.2-rubygem-rubyzip-2.3.2-1.11.aarch64.rpm"
RPM_HASH = "ffa6ad929a188c55ede55af908abd8027f2194c17cd3bb58b5b37673fb0b1140ce8e111d9a9b6d868399722d14df2e27dfeb76ce40b6e9ffe2eb93cce79ccd27"

RPROVIDES:${PN} += "ruby3.2-rubygem-rubyzip \
ruby3.2-rubygem-rubyzip(aarch-64) \
rubygem(ruby:3.2.0:rubyzip) \
rubygem(ruby:3.2.0:rubyzip:2) \
rubygem(ruby:3.2.0:rubyzip:2.3) \
rubygem(ruby:3.2.0:rubyzip:2.3.2) \
rubygem(rubyzip)"

RDEPENDS:${PN} += "/usr/bin/ruby.ruby3.2 \
ruby(abi)"

inherit rpm
