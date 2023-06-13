SUMMARY = "A pure Ruby implementation of the SCP client protocol"
DESCRIPTION = "A pure Ruby implementation of the SCP client protocol."
LICENSE = "MIT"

PV = "4.0.0"

RPM_NAME = "ruby3.2-rubygem-net-scp-4.0.0-1.5.aarch64.rpm"
RPM_HASH = "9a52491fbac4c8d291bddf06f9de9baaeae4744ccecaeaa697e78e290ba2d2d68bcf02e567cd2ddb803d886dc501fbcdaf9dda3f3ec31769cd724b602b9fc73e"

RPROVIDES:${PN} += "ruby3.2-rubygem-net-scp \
ruby3.2-rubygem-net-scp(aarch-64) \
rubygem(net-scp) \
rubygem(ruby:3.2.0:net-scp) \
rubygem(ruby:3.2.0:net-scp:4) \
rubygem(ruby:3.2.0:net-scp:4.0) \
rubygem(ruby:3.2.0:net-scp:4.0.0)"

RDEPENDS:${PN} += "ruby(abi) \
rubygem(ruby:3.2.0:net-ssh)"

inherit rpm
