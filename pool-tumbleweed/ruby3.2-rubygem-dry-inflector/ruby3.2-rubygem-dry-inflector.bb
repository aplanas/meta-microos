SUMMARY = "String inflections for dry-rb"
DESCRIPTION = "String inflections for dry-rb."
LICENSE = "MIT"

PV = "1.0.0"

RPM_NAME = "ruby3.2-rubygem-dry-inflector-1.0.0-1.3.aarch64.rpm"
RPM_HASH = "16fe63d005235621d1a6dbbc416aa7db2c770130889cfd65c2914f7086095d17ece7de3f229462effcf2559b7bfa99c3b4f8a8872433a26276a11d9b0fd020de"

RPROVIDES:${PN} += "ruby3.2-rubygem-dry-inflector \
ruby3.2-rubygem-dry-inflector(aarch-64) \
rubygem(dry-inflector) \
rubygem(ruby:3.2.0:dry-inflector) \
rubygem(ruby:3.2.0:dry-inflector:1) \
rubygem(ruby:3.2.0:dry-inflector:1.0) \
rubygem(ruby:3.2.0:dry-inflector:1.0.0)"

RDEPENDS:${PN} += "ruby(abi)"

inherit rpm
