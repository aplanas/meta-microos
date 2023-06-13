SUMMARY = "A pkg-config implementation for Ruby"
DESCRIPTION = "pkg-config can be used in your extconf.rb to properly detect need libraries \
for compiling Ruby native extensions."
LICENSE = "LGPL-2.1-or-later"

PV = "1.5.1"

RPM_NAME = "ruby3.2-rubygem-pkg-config-1.5.1-1.3.aarch64.rpm"
RPM_HASH = "d3ad62cd9086ce760ebeb5ccb8cbe230d7c17d1e5408aa4e990ccba589dc4e27b3c8644c1eef88ed14b6890a7c1351c657185eae9c82c592dc36692637efce0e"

RPROVIDES:${PN} += "ruby3.2-rubygem-pkg-config \
ruby3.2-rubygem-pkg-config(aarch-64) \
rubygem(pkg-config) \
rubygem(ruby:3.2.0:pkg-config) \
rubygem(ruby:3.2.0:pkg-config:1) \
rubygem(ruby:3.2.0:pkg-config:1.5) \
rubygem(ruby:3.2.0:pkg-config:1.5.1)"

RDEPENDS:${PN} += "pkg-config \
ruby(abi)"

inherit rpm
