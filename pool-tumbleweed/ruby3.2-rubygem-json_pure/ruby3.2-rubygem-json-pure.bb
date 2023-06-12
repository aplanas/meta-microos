SUMMARY = "JSON Implementation for Ruby"
DESCRIPTION = "This is a JSON implementation in pure Ruby."
LICENSE = "Ruby"

PV = "2.6.3"

RPM_NAME = "ruby3.2-rubygem-json_pure-2.6.3-1.3.aarch64.rpm"
RPM_HASH = "30f44464f7ab90e2c66495833414fcc34eb528e46b36f19c4ef703137b6c00f72ba7a76c44c27a60becc16babec455e5c883004d6e6b0b58c87bacd97dc6058c"

RPROVIDES:${PN} += "ruby3.2-rubygem-json_pure \
ruby3.2-rubygem-json_pure(aarch-64) \
rubygem(json_pure) \
rubygem(ruby:3.2.0:json_pure) \
rubygem(ruby:3.2.0:json_pure:2) \
rubygem(ruby:3.2.0:json_pure:2.6) \
rubygem(ruby:3.2.0:json_pure:2.6.3)"
RDEPENDS:${PN} += "ruby(abi)"

inherit rpm
