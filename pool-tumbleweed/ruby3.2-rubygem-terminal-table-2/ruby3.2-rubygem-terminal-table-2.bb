SUMMARY = "Simple, feature rich ascii table generation library"
DESCRIPTION = "Simple, feature rich ascii table generation library."
LICENSE = "MIT"

PV = "2.0.0"

RPM_NAME = "ruby3.2-rubygem-terminal-table-2-2.0.0-1.9.aarch64.rpm"
RPM_HASH = "c225d9587d6e98f419abf128a5d1035232011159298ac90b671cae73450a3cb9e5520bdd1f8cca50c5752463d9049c6a76afed6a8c4975782d38b8d957660e27"

RPROVIDES:${PN} += "ruby3.2-rubygem-terminal-table-2 \
ruby3.2-rubygem-terminal-table-2(aarch-64) \
rubygem(ruby:3.2.0:terminal-table) \
rubygem(ruby:3.2.0:terminal-table:2) \
rubygem(ruby:3.2.0:terminal-table:2.0) \
rubygem(ruby:3.2.0:terminal-table:2.0.0) \
rubygem(terminal-table)"

RDEPENDS:${PN} += "ruby(abi) \
rubygem(ruby:3.2.0:unicode-display_width) \
rubygem(ruby:3.2.0:unicode-display_width:1)"

inherit rpm
