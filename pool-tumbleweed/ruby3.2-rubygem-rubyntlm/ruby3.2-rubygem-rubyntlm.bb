SUMMARY = "Ruby/NTLM library"
DESCRIPTION = "Ruby/NTLM provides message creator and parser for the NTLM authentication."
LICENSE = "MIT"

PV = "0.6.3"

RPM_NAME = "ruby3.2-rubygem-rubyntlm-0.6.3-1.11.aarch64.rpm"
RPM_HASH = "79e93c8208e1339dde849d6e86f5fcc4eb140db503158b8a68c75bc8726ffb3efa9251ae0856e823bca870e23c59ef5d2a1ea8717f0a69938f3fe13514366b7b"

RPROVIDES:${PN} += "ruby3.2-rubygem-rubyntlm \
ruby3.2-rubygem-rubyntlm(aarch-64) \
rubygem(ruby:3.2.0:rubyntlm) \
rubygem(ruby:3.2.0:rubyntlm:0) \
rubygem(ruby:3.2.0:rubyntlm:0.6) \
rubygem(ruby:3.2.0:rubyntlm:0.6.3) \
rubygem(rubyntlm)"
RDEPENDS:${PN} += "ruby(abi)"

inherit rpm
