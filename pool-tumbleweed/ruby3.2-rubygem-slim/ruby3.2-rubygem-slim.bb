SUMMARY = "Slim is a template language"
DESCRIPTION = "Slim is a template language whose goal is reduce the syntax to the essential \
parts without becoming cryptic."
LICENSE = "MIT"

PV = "5.1.0"

RPM_NAME = "ruby3.2-rubygem-slim-5.1.0-1.1.aarch64.rpm"
RPM_HASH = "499e203b2453309dffa9f04a7e54eeb1835e964b9ea3875b7d4d7af78d9b310dd7679b00c07449eff36aff62e837303cf530350eefe66c76e39207bd8bfd9bd8"

RPROVIDES:${PN} += "ruby3.2-rubygem-slim \
ruby3.2-rubygem-slim(aarch-64) \
rubygem(ruby:3.2.0:slim) \
rubygem(ruby:3.2.0:slim:5) \
rubygem(ruby:3.2.0:slim:5.1) \
rubygem(ruby:3.2.0:slim:5.1.0) \
rubygem(slim)"

RDEPENDS:${PN} += "/bin/sh \
/usr/bin/ruby.ruby3.2 \
ruby(abi) \
rubygem(ruby:3.2.0:temple:0.10) \
rubygem(ruby:3.2.0:tilt) \
update-alternatives"

inherit rpm
