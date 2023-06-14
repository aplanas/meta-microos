SUMMARY = "URI Implementation"
DESCRIPTION = "Addressable is an alternative implementation to the URI implementation that is \
part of Ruby's standard library. It is flexible, offers heuristic parsing, and \
additionally provides extensive support for IRIs and URI templates."
LICENSE = "Apache-2.0"

PV = "2.8.1"

RPM_NAME = "ruby3.2-rubygem-addressable-2.8.1-1.5.aarch64.rpm"
RPM_HASH = "602eea06998cbdefbcf94890483c17418b12945d9cece18f554442683b64bd01ed7b2778d1c9a4248843844e76a09d38bac9dcbd8eb6cd21437695906c8c087d"

RPROVIDES:${PN} += "ruby3.2-rubygem-addressable \
rubygem-addressable \
rubygem-ruby-3.2.0-addressable \
rubygem-ruby-3.2.0-addressable-2 \
rubygem-ruby-3.2.0-addressable-2.8 \
rubygem-ruby-3.2.0-addressable-2.8.1"

RDEPENDS:${PN} += "ruby-abi \
rubygem-ruby-3.2.0-public-suffix"

inherit rpm
