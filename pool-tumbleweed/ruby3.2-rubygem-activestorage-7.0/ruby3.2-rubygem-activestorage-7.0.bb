SUMMARY = "Local and cloud file storage framework"
DESCRIPTION = "Attach cloud and local files in Rails applications."
LICENSE = "MIT"

PV = "7.0.5.1"

RPM_NAME = "ruby3.2-rubygem-activestorage-7.0-7.0.5.1-1.1.aarch64.rpm"
RPM_HASH = "c0198dd6f1dfd8a1c81bede8c61cd92a7427eb6b3faa5513dbc2a4e5907b9f9d2ff0ce1843b4245b17cdea6f11a3e217b259d8be7d8cd41ac0c2dd6e2c6c6f96"

RPROVIDES:${PN} += "ruby3.2-rubygem-activestorage-7.0 \
rubygem-activestorage \
rubygem-ruby-3.2.0-activestorage \
rubygem-ruby-3.2.0-activestorage-7 \
rubygem-ruby-3.2.0-activestorage-7.0 \
rubygem-ruby-3.2.0-activestorage-7.0.5"

RDEPENDS:${PN} += "ruby-abi \
rubygem-ruby-3.2.0-actionpack \
rubygem-ruby-3.2.0-activejob \
rubygem-ruby-3.2.0-activerecord \
rubygem-ruby-3.2.0-activesupport \
rubygem-ruby-3.2.0-marcel-1 \
rubygem-ruby-3.2.0-mini-mime"

inherit rpm
