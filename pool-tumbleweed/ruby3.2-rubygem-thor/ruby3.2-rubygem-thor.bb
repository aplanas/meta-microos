SUMMARY = "Thor is a toolkit for building powerful command-line interfaces"
DESCRIPTION = "Thor is a toolkit for building powerful command-line interfaces."
LICENSE = "MIT"

PV = "1.2.1"

RPM_NAME = "ruby3.2-rubygem-thor-1.2.1-1.10.aarch64.rpm"
RPM_HASH = "d95cc9d49df7dd822f6cf766fe43e5b7bedb4b89426fc2d7f87a2c34b31c2e11dbc0f2e91bebfa524ea559d23eae7458e0ce4fb5c5bc9e7fd2effe2801c694ce"

RPROVIDES:${PN} += "ruby3.2-rubygem-thor \
rubygem-ruby-3.2.0-thor \
rubygem-ruby-3.2.0-thor-1 \
rubygem-ruby-3.2.0-thor-1.2 \
rubygem-ruby-3.2.0-thor-1.2.1 \
rubygem-thor"

RDEPENDS:${PN} += "/bin/sh \
/usr/bin/ruby.ruby3.2 \
ruby-abi \
update-alternatives"

inherit rpm
