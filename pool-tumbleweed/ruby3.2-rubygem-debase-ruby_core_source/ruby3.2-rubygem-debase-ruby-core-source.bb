SUMMARY = "Provide Ruby core source files"
DESCRIPTION = "Provide Ruby core source files for C extensions that need them."
LICENSE = "MIT"

PV = "0.10.18"

RPM_NAME = "ruby3.2-rubygem-debase-ruby_core_source-0.10.18-1.3.aarch64.rpm"
RPM_HASH = "584b708da7fe4fd541b6578c1f09d8d47e397884b97dcd3445b4ef854cdadb9d13c7e9db846ac9f89e70fa6a11a08e43de1579b3bf25b39ac64f0f108ef26780"

RPROVIDES:${PN} += "ruby3.2-rubygem-debase-ruby_core_source \
ruby3.2-rubygem-debase-ruby_core_source(aarch-64) \
rubygem(debase-ruby_core_source) \
rubygem(ruby:3.2.0:debase-ruby_core_source) \
rubygem(ruby:3.2.0:debase-ruby_core_source:0) \
rubygem(ruby:3.2.0:debase-ruby_core_source:0.10) \
rubygem(ruby:3.2.0:debase-ruby_core_source:0.10.18)"
RDEPENDS:${PN} += "ruby(abi)"

inherit rpm
