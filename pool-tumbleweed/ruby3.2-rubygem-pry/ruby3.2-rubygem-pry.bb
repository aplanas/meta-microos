SUMMARY = "A runtime developer console and IRB alternative with powerful"
DESCRIPTION = "Pry is a runtime developer console and IRB alternative with powerful \
introspection capabilities. Pry aims to be more than an IRB replacement. It is \
an attempt to bring REPL driven programming to the Ruby language."
LICENSE = "MIT"

PV = "0.14.1"

RPM_NAME = "ruby3.2-rubygem-pry-0.14.1-1.12.aarch64.rpm"
RPM_HASH = "dbc783ad2efad2c3ec667344ee5ac22141e718e4951ec3482275932a99f600914aaa5e3bcefe7b26ebabefbb1d6d89b81ed4b6ccafbf61904fa67ef4fd8a33d5"

RPROVIDES:${PN} += "ruby3.2-rubygem-pry \
rubygem-pry \
rubygem-ruby-3.2.0-pry \
rubygem-ruby-3.2.0-pry-0 \
rubygem-ruby-3.2.0-pry-0.14 \
rubygem-ruby-3.2.0-pry-0.14.1"

RDEPENDS:${PN} += "/usr/bin/ruby.ruby3.2 \
/usr/bin/sh \
ruby-abi \
rubygem-ruby-3.2.0-coderay-1 \
rubygem-ruby-3.2.0-method-source-1 \
update-alternatives"

inherit rpm
