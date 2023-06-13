SUMMARY = "A library for working with Abstract Syntax Trees"
DESCRIPTION = "A library for working with Abstract Syntax Trees."
LICENSE = "MIT"

PV = "2.4.2"

RPM_NAME = "ruby3.2-rubygem-ast-2.4.2-1.12.aarch64.rpm"
RPM_HASH = "f55485253df9a3617847aadfe7a7b1cd33b1110f43fb2581a0d814df057166731eff61434da4c4afdff98f05991f99d8fd49be33ec81da7dc59acd497bc8b9cd"

RPROVIDES:${PN} += "ruby3.2-rubygem-ast \
ruby3.2-rubygem-ast(aarch-64) \
rubygem(ast) \
rubygem(ruby:3.2.0:ast) \
rubygem(ruby:3.2.0:ast:2) \
rubygem(ruby:3.2.0:ast:2.4) \
rubygem(ruby:3.2.0:ast:2.4.2)"

RDEPENDS:${PN} += "ruby(abi)"

inherit rpm
