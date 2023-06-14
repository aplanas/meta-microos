SUMMARY = "SWD (Simple Web Discovery) Client Library"
DESCRIPTION = "SWD (Simple Web Discovery) Client Library."
LICENSE = "MIT"

PV = "2.0.2"

RPM_NAME = "ruby3.2-rubygem-swd-2.0.2-1.5.aarch64.rpm"
RPM_HASH = "896d01ae12e11072a8aa2157174a578a47d7206fcdb2e1974fab761019248dccfbcca10404c5633d561491490558761d6d4f3f7fbb950ba3583fade6e5992dbd"

RPROVIDES:${PN} += "ruby3.2-rubygem-swd \
rubygem-ruby-3.2.0-swd \
rubygem-ruby-3.2.0-swd-2 \
rubygem-ruby-3.2.0-swd-2.0 \
rubygem-ruby-3.2.0-swd-2.0.2 \
rubygem-swd"

RDEPENDS:${PN} += "ruby-abi \
rubygem-ruby-3.2.0-activesupport \
rubygem-ruby-3.2.0-attr-required \
rubygem-ruby-3.2.0-faraday-2 \
rubygem-ruby-3.2.0-faraday-follow-redirects"

inherit rpm
