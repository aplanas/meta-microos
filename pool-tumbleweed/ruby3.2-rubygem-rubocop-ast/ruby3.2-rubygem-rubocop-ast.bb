SUMMARY = "RuboCop tools to deal with Ruby code AST"
DESCRIPTION = "RuboCop's Node and NodePattern classes."
LICENSE = "MIT"

PV = "1.24.0"

RPM_NAME = "ruby3.2-rubygem-rubocop-ast-1.24.0-1.3.aarch64.rpm"
RPM_HASH = "50f1316a39b74b0eddab3d82d0e188058650107cf938bc576acfa87b575644b636644f8e7ad9377c1d931008c257e086a67f8d94d55809c03f74529cc4e7801c"

RPROVIDES:${PN} += "ruby3.2-rubygem-rubocop-ast \
ruby3.2-rubygem-rubocop-ast(aarch-64) \
rubygem(rubocop-ast) \
rubygem(ruby:3.2.0:rubocop-ast) \
rubygem(ruby:3.2.0:rubocop-ast:1) \
rubygem(ruby:3.2.0:rubocop-ast:1.24) \
rubygem(ruby:3.2.0:rubocop-ast:1.24.0)"

RDEPENDS:${PN} += "ruby(abi) \
rubygem(ruby:3.2.0:parser)"

inherit rpm
