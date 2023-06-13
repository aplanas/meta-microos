SUMMARY = "A pure-ruby colorizer based on pygments"
DESCRIPTION = "Rouge aims to a be a simple, easy-to-extend drop-in replacement for pygments."
LICENSE = "BSD-2-Clause | MIT"

PV = "4.0.0"

RPM_NAME = "ruby3.2-rubygem-rouge-4.0.0-1.6.aarch64.rpm"
RPM_HASH = "bd25125a7b809bac5328a42c3314a20990556ddead7a48ae3fa3659efa7af72863973c46e545508801ff78979273750bad113ad960f30dbddcbd7edcd43e5fa7"

RPROVIDES:${PN} += "ruby3.2-rubygem-rouge \
ruby3.2-rubygem-rouge(aarch-64) \
rubygem(rouge) \
rubygem(ruby:3.2.0:rouge) \
rubygem(ruby:3.2.0:rouge:4) \
rubygem(ruby:3.2.0:rouge:4.0) \
rubygem(ruby:3.2.0:rouge:4.0.0)"

RDEPENDS:${PN} += "/bin/sh \
/usr/bin/ruby.ruby3.2 \
ruby(abi) \
update-alternatives"

inherit rpm
