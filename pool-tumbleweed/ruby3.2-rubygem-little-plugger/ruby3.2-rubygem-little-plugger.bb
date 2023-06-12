SUMMARY = "LittlePlugger is a module that provides Gem based plugin management"
DESCRIPTION = "LittlePlugger is a module that provides Gem based plugin management. \
By extending your own class or module with LittlePlugger you can easily \
manage the loading and initializing of plugins provided by other gems."
LICENSE = "MIT"

PV = "1.1.4"

RPM_NAME = "ruby3.2-rubygem-little-plugger-1.1.4-1.25.aarch64.rpm"
RPM_HASH = "aa7827c759f47d6fc752c91a54ee95507fd5cf6cfc6caa25b87d12ffbbcf6fed8b8c61abdbabd93c60acc74a104ce7890cfa951cd16188044923f5a8a59173e6"

RPROVIDES:${PN} += "ruby3.2-rubygem-little-plugger \
ruby3.2-rubygem-little-plugger(aarch-64) \
rubygem(little-plugger) \
rubygem(ruby:3.2.0:little-plugger) \
rubygem(ruby:3.2.0:little-plugger:1) \
rubygem(ruby:3.2.0:little-plugger:1.1) \
rubygem(ruby:3.2.0:little-plugger:1.1.4)"
RDEPENDS:${PN} += "ruby(abi)"

inherit rpm
