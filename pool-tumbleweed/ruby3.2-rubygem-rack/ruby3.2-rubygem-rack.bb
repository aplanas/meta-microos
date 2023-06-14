SUMMARY = "A modular Ruby webserver interface"
DESCRIPTION = "Rack provides a minimal, modular and adaptable interface for developing \
web applications in Ruby. By wrapping HTTP requests and responses in \
the simplest way possible, it unifies and distills the API for web \
servers, web frameworks, and software in between (the so-called \
middleware) into a single method call."
LICENSE = "MIT"

PV = "3.0.7"

RPM_NAME = "ruby3.2-rubygem-rack-3.0.7-1.2.aarch64.rpm"
RPM_HASH = "57e2339eb28f7f431c0c9e7a3b75255ebec1de11623f3f07653526153c48ecf781b4801de644630747053d525e4d4d3a4652222178417f6cb2792c151c59404b"

RPROVIDES:${PN} += "ruby3.2-rubygem-rack \
rubygem-rack \
rubygem-ruby-3.2.0-rack \
rubygem-ruby-3.2.0-rack-3 \
rubygem-ruby-3.2.0-rack-3.0 \
rubygem-ruby-3.2.0-rack-3.0.7"

RDEPENDS:${PN} += "ruby-abi"

inherit rpm
