SUMMARY = "Performant priority queue in pure ruby with support for changing"
DESCRIPTION = "Performant priority queue in pure ruby with support for changing priority \
using pairing heap data structure."
LICENSE = "MIT"

PV = "1.0.0"

RPM_NAME = "ruby3.2-rubygem-pairing_heap-1.0.0-1.5.aarch64.rpm"
RPM_HASH = "e1232779335c4053efeaac23034612ce2ccdaf8f74e22933f8df46b464031f656631733b203e894513f99e05a7786a317216db73e0a9fffa3a701c916ebb6137"

RPROVIDES:${PN} += "ruby3.2-rubygem-pairing-heap \
rubygem-pairing-heap \
rubygem-ruby-3.2.0-pairing-heap \
rubygem-ruby-3.2.0-pairing-heap-1 \
rubygem-ruby-3.2.0-pairing-heap-1.0 \
rubygem-ruby-3.2.0-pairing-heap-1.0.0"

RDEPENDS:${PN} += "/usr/bin/env \
/usr/bin/ruby.ruby3.2 \
ruby-abi"

inherit rpm
