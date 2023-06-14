SUMMARY = "Object-relational mapper framework (part of Rails)"
DESCRIPTION = "Databases on Rails. Build a persistent domain model by mapping database tables \
to Ruby classes. Strong conventions for associations, validations, \
aggregations, migrations, and testing come baked-in."
LICENSE = "MIT"

PV = "7.0.4.3"

RPM_NAME = "ruby3.2-rubygem-activerecord-7.0-7.0.4.3-1.1.aarch64.rpm"
RPM_HASH = "54da708a54e09e201620ec1f5ab21141f879127773bbb66007f5a4692304a2e3fe44f077ffdea928067ea218fa6d97ce1a3d989b090238845c0b3464fee935fe"

RPROVIDES:${PN} += "ruby3.2-rubygem-activerecord-7.0 \
rubygem-activerecord \
rubygem-ruby-3.2.0-activerecord \
rubygem-ruby-3.2.0-activerecord-7 \
rubygem-ruby-3.2.0-activerecord-7.0 \
rubygem-ruby-3.2.0-activerecord-7.0.4"

RDEPENDS:${PN} += "ruby-abi \
rubygem-ruby-3.2.0-activemodel \
rubygem-ruby-3.2.0-activesupport"

inherit rpm
