SUMMARY = "A convenient way to diff string in ruby"
DESCRIPTION = "Convenient diffing in ruby."
LICENSE = "MIT"

PV = "3.4.2"

RPM_NAME = "ruby3.2-rubygem-diffy-3.4.2-1.5.aarch64.rpm"
RPM_HASH = "02362ac70e5a118ae1fa67712d5d30407982d95022f2a4593406196ebf2ad3e688585835b4af5e8572f7777e849c40884093941e429f9f6ac334bc3084f4d601"

RPROVIDES:${PN} += "ruby3.2-rubygem-diffy \
ruby3.2-rubygem-diffy(aarch-64) \
rubygem(diffy) \
rubygem(ruby:3.2.0:diffy) \
rubygem(ruby:3.2.0:diffy:3) \
rubygem(ruby:3.2.0:diffy:3.4) \
rubygem(ruby:3.2.0:diffy:3.4.2)"
RDEPENDS:${PN} += "ruby(abi)"

inherit rpm
