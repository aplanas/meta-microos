SUMMARY = "A modular Ruby webserver interface"
DESCRIPTION = "Rack provides a minimal, modular and adaptable interface for developing \
web applications in Ruby. By wrapping HTTP requests and responses in \
the simplest way possible, it unifies and distills the API for web \
servers, web frameworks, and software in between (the so-called \
middleware) into a single method call."
LICENSE = "MIT"

PV = "2.2.8"

RPM_NAME = "ruby3.2-rubygem-rack-2.2-2.2.8-1.1.aarch64.rpm"
RPM_HASH = "f5ffbe3144c628011a06ff268c454673f9438608b755ef33ba4245ec5e3501ab7a51e54f4926cbb7c4545d262cb86c205bf9c2f1b5a8465bc3ce15746e69fbbc"

RPROVIDES:${PN} += "ruby3.2-rubygem-rack-2.2 \
rubygem-rack \
rubygem-ruby-3.2.0-rack \
rubygem-ruby-3.2.0-rack-2 \
rubygem-ruby-3.2.0-rack-2.2 \
rubygem-ruby-3.2.0-rack-2.2.8"

RDEPENDS:${PN} += "/usr/bin/ruby.ruby3.2 \
/usr/bin/sh \
ruby-abi \
update-alternatives"

inherit rpm
