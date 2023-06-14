SUMMARY = "Ruby client for the Stomp messaging protocol"
DESCRIPTION = "Ruby client for the Stomp messaging protocol."
LICENSE = "Apache-2.0"

PV = "1.4.10"

RPM_NAME = "ruby3.2-rubygem-stomp-1.4.10-1.16.aarch64.rpm"
RPM_HASH = "5a5a01465539690047edb564424a2358e6d2f60fce52568bc34c99149e50a3c5b6ea57b177b01e188d1ff049f9d4c39f448259e64218e8c3adfbddf847ef9b38"

RPROVIDES:${PN} += "ruby3.2-rubygem-stomp \
rubygem-ruby-3.2.0-stomp \
rubygem-ruby-3.2.0-stomp-1 \
rubygem-ruby-3.2.0-stomp-1.4 \
rubygem-ruby-3.2.0-stomp-1.4.10 \
rubygem-stomp"

RDEPENDS:${PN} += "/bin/bash \
/bin/sh \
/usr/bin/ruby.ruby3.2 \
ruby-abi \
update-alternatives"

inherit rpm
