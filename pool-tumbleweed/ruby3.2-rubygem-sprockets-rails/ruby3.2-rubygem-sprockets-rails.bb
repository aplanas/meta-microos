SUMMARY = "Sprockets Rails integration"
DESCRIPTION = "Sprockets Rails integration."
LICENSE = "MIT"

PV = "3.4.2"

RPM_NAME = "ruby3.2-rubygem-sprockets-rails-3.4.2-1.10.aarch64.rpm"
RPM_HASH = "821e4fb4d95d82e708ac367af2b993cb21f23f974d4f4fcc01f4db2d8dbae0c82b1fa077938943bcb443529024f8bb5c7a7ca1388278f688bb65ded8f1a71a3c"

RPROVIDES:${PN} += "ruby3.2-rubygem-sprockets-rails \
ruby3.2-rubygem-sprockets-rails(aarch-64) \
rubygem(ruby:3.2.0:sprockets-rails) \
rubygem(ruby:3.2.0:sprockets-rails:3) \
rubygem(ruby:3.2.0:sprockets-rails:3.4) \
rubygem(ruby:3.2.0:sprockets-rails:3.4.2) \
rubygem(sprockets-rails)"

RDEPENDS:${PN} += "ruby(abi) \
rubygem(ruby:3.2.0:actionpack) \
rubygem(ruby:3.2.0:activesupport) \
rubygem(ruby:3.2.0:sprockets)"

inherit rpm
