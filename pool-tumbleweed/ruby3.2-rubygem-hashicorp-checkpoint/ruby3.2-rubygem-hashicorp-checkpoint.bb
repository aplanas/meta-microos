SUMMARY = "Internal HashiCorp service to check version information"
DESCRIPTION = "Internal HashiCorp service to check version information."
LICENSE = "MPL-2.0"

PV = "0.1.5"

RPM_NAME = "ruby3.2-rubygem-hashicorp-checkpoint-0.1.5-1.21.aarch64.rpm"
RPM_HASH = "12d5ba1f7e159657e71e5b2aeff6e032d422d34e310d936c47b898ea5ffef88af2dfb2732d8cb20ee9abf1814e021d8148bfce346bd06d80663492dd666bdee4"

RPROVIDES:${PN} += "ruby3.2-rubygem-hashicorp-checkpoint \
ruby3.2-rubygem-hashicorp-checkpoint(aarch-64) \
rubygem(hashicorp-checkpoint) \
rubygem(ruby:3.2.0:hashicorp-checkpoint) \
rubygem(ruby:3.2.0:hashicorp-checkpoint:0) \
rubygem(ruby:3.2.0:hashicorp-checkpoint:0.1) \
rubygem(ruby:3.2.0:hashicorp-checkpoint:0.1.5)"

RDEPENDS:${PN} += "ruby(abi)"

inherit rpm
