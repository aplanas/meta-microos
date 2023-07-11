SUMMARY = "Object-relational mapper framework (part of Rails)"
DESCRIPTION = "Databases on Rails. Build a persistent domain model by mapping database tables \
to Ruby classes. Strong conventions for associations, validations, \
aggregations, migrations, and testing come baked-in."
LICENSE = "MIT"

PV = "7.0.5.1"

RPM_NAME = "ruby3.2-rubygem-activerecord-7.0-7.0.5.1-1.1.aarch64.rpm"
RPM_HASH = "7b1899547786284bb06d2d29f634eed4f0422fbf6e9ad01b7454cfc6cddfeda69c26f1ee3de5cdd52a2a83b41fe226f576251a2b865510de046ff23f4c63df9c"

RPROVIDES:${PN} += "ruby3.2-rubygem-activerecord-7.0 \
rubygem-activerecord \
rubygem-ruby-3.2.0-activerecord \
rubygem-ruby-3.2.0-activerecord-7 \
rubygem-ruby-3.2.0-activerecord-7.0 \
rubygem-ruby-3.2.0-activerecord-7.0.5"

RDEPENDS:${PN} += "ruby-abi \
rubygem-ruby-3.2.0-activemodel \
rubygem-ruby-3.2.0-activesupport"

inherit rpm
