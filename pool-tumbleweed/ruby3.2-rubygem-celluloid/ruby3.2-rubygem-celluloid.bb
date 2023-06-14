SUMMARY = "Actor-based concurrent object framework for Ruby"
DESCRIPTION = "Celluloid enables people to build concurrent programs out of concurrent \
objects just as easily as they build sequential programs out of sequential \
objects."
LICENSE = "MIT"

PV = "0.18.0"

RPM_NAME = "ruby3.2-rubygem-celluloid-0.18.0-1.13.aarch64.rpm"
RPM_HASH = "a9ebec1dcbfb48ec5fef63c0b8175aefa655fe681b30e6efc76576e39ce8d6d753bbd794507eaff2f46291ffd5e4639b8586b16783da28ecb93ec232669566a3"

RPROVIDES:${PN} += "ruby3.2-rubygem-celluloid \
rubygem-celluloid \
rubygem-ruby-3.2.0-celluloid \
rubygem-ruby-3.2.0-celluloid-0 \
rubygem-ruby-3.2.0-celluloid-0.18 \
rubygem-ruby-3.2.0-celluloid-0.18.0"

RDEPENDS:${PN} += "/usr/bin/ruby.ruby3.2 \
ruby-abi \
rubygem-ruby-3.2.0-timers"

inherit rpm
