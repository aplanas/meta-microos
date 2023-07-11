SUMMARY = "OO authorization for Rails"
DESCRIPTION = "Object oriented authorization for Rails applications."
LICENSE = "MIT"

PV = "2.3.0"

RPM_NAME = "ruby3.2-rubygem-pundit-2.3.0-1.1.aarch64.rpm"
RPM_HASH = "b8a351888614d033b1b5ed0cb929641221b9361caebe7cccc3fbd1da66feb484afb5135c08a1a8b7fc809829845729c8ae155cac2e40c12dee7da13e34571ced"

RPROVIDES:${PN} += "ruby3.2-rubygem-pundit \
rubygem-pundit \
rubygem-ruby-3.2.0-pundit \
rubygem-ruby-3.2.0-pundit-2 \
rubygem-ruby-3.2.0-pundit-2.3 \
rubygem-ruby-3.2.0-pundit-2.3.0"

RDEPENDS:${PN} += "ruby-abi \
rubygem-ruby-3.2.0-activesupport"

inherit rpm
