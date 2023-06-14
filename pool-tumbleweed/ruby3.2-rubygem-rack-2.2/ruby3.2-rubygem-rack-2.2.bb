SUMMARY = "A modular Ruby webserver interface"
DESCRIPTION = "Rack provides a minimal, modular and adaptable interface for developing \
web applications in Ruby. By wrapping HTTP requests and responses in \
the simplest way possible, it unifies and distills the API for web \
servers, web frameworks, and software in between (the so-called \
middleware) into a single method call."
LICENSE = "MIT"

PV = "2.2.7"

RPM_NAME = "ruby3.2-rubygem-rack-2.2-2.2.7-1.1.aarch64.rpm"
RPM_HASH = "81685ecc74ec1c82405e6aee61cd9a4dde047726462e06d38b729e843f1544d6219797411c6aea15cb15a831e610bfef747b8d27d78c2df04d4bde2376639aec"

RPROVIDES:${PN} += "ruby3.2-rubygem-rack-2.2 \
rubygem-rack \
rubygem-ruby-3.2.0-rack \
rubygem-ruby-3.2.0-rack-2 \
rubygem-ruby-3.2.0-rack-2.2 \
rubygem-ruby-3.2.0-rack-2.2.7"

RDEPENDS:${PN} += "/bin/sh \
/usr/bin/ruby.ruby3.2 \
ruby-abi \
update-alternatives"

inherit rpm
