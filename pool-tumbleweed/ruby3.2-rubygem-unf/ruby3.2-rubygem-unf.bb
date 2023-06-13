SUMMARY = "A wrapper library to bring Unicode Normalization Form support to"
DESCRIPTION = "This is a wrapper library to bring Unicode Normalization Form support \
to Ruby/JRuby."
LICENSE = "BSD-2-Clause"

PV = "0.1.4"

RPM_NAME = "ruby3.2-rubygem-unf-0.1.4-1.27.aarch64.rpm"
RPM_HASH = "d7356edab460eb806d6a2132ed2fb3d1f519f6c923a2d1c36a90893b1ca68a4ed93cca5c536942fa5a771544de7425010f6df9c8129d883e91ead751040bcc3b"

RPROVIDES:${PN} += "ruby3.2-rubygem-unf \
ruby3.2-rubygem-unf(aarch-64) \
rubygem(ruby:3.2.0:unf) \
rubygem(ruby:3.2.0:unf:0) \
rubygem(ruby:3.2.0:unf:0.1) \
rubygem(ruby:3.2.0:unf:0.1.4) \
rubygem(unf)"

RDEPENDS:${PN} += "/usr/bin/env \
ruby(abi) \
rubygem(ruby:3.2.0:unf_ext)"

inherit rpm
