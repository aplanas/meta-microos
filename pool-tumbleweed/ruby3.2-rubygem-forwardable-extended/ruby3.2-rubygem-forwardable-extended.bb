SUMMARY = "Forwardable with hash, and instance variable extensions"
DESCRIPTION = "Forwardable with hash, and instance variable extensions."
LICENSE = "MIT"

PV = "2.6.0"

RPM_NAME = "ruby3.2-rubygem-forwardable-extended-2.6.0-1.25.aarch64.rpm"
RPM_HASH = "1b78e4bd623896eea40abb2dc539aac57f013c4dac6817714fa69c06afde6db0a5ea232987aa35233b9f515d4afd012774fa6daf0ab4eb7b8a4790226030d5c9"

RPROVIDES:${PN} += "ruby3.2-rubygem-forwardable-extended \
ruby3.2-rubygem-forwardable-extended(aarch-64) \
rubygem(forwardable-extended) \
rubygem(ruby:3.2.0:forwardable-extended) \
rubygem(ruby:3.2.0:forwardable-extended:2) \
rubygem(ruby:3.2.0:forwardable-extended:2.6) \
rubygem(ruby:3.2.0:forwardable-extended:2.6.0)"

RDEPENDS:${PN} += "ruby(abi)"

inherit rpm
