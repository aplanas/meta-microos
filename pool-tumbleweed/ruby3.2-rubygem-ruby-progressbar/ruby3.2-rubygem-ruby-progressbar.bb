SUMMARY = "Ruby/ProgressBar is a flexible text progress bar library for Ruby"
DESCRIPTION = "Ruby/ProgressBar is an extremely flexible text progress bar library for Ruby. \
The output can be customized with a flexible formatting system including: \
percentage, bars of various formats, elapsed time and estimated time \
remaining."
LICENSE = "MIT"

PV = "1.11.0"

RPM_NAME = "ruby3.2-rubygem-ruby-progressbar-1.11.0-1.13.aarch64.rpm"
RPM_HASH = "91129f1f186dcdd0a511753ef8d35e19dbc68508baf429ce60f065223746302ab4712f6c66c0c15fd2aeba4d50d103aab487acd51fbb5ffc6b524bbcc48de70b"

RPROVIDES:${PN} += "ruby3.2-rubygem-ruby-progressbar \
ruby3.2-rubygem-ruby-progressbar(aarch-64) \
rubygem(ruby-progressbar) \
rubygem(ruby:3.2.0:ruby-progressbar) \
rubygem(ruby:3.2.0:ruby-progressbar:1) \
rubygem(ruby:3.2.0:ruby-progressbar:1.11) \
rubygem(ruby:3.2.0:ruby-progressbar:1.11.0)"

RDEPENDS:${PN} += "/usr/bin/env \
ruby(abi)"

inherit rpm
