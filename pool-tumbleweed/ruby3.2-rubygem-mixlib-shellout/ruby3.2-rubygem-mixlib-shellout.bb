SUMMARY = "Run external commands on Unix or Windows"
DESCRIPTION = "Run external commands on Unix or Windows."
LICENSE = "Apache-2.0"

PV = "3.2.7"

RPM_NAME = "ruby3.2-rubygem-mixlib-shellout-3.2.7-1.8.aarch64.rpm"
RPM_HASH = "07b82673361b18228ac100a55c41dabf2d606f28e26064804ba5564ddf28f866611431cc8db7ba40804adec4b0967236f89f5e153f51da37bfeeee44b7633905"

RPROVIDES:${PN} += "ruby3.2-rubygem-mixlib-shellout \
ruby3.2-rubygem-mixlib-shellout(aarch-64) \
rubygem(mixlib-shellout) \
rubygem(ruby:3.2.0:mixlib-shellout) \
rubygem(ruby:3.2.0:mixlib-shellout:3) \
rubygem(ruby:3.2.0:mixlib-shellout:3.2) \
rubygem(ruby:3.2.0:mixlib-shellout:3.2.7)"
RDEPENDS:${PN} += "ruby(abi) \
rubygem(ruby:3.2.0:chef-utils)"

inherit rpm
