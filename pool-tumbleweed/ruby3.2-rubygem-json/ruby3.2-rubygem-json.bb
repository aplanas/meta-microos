SUMMARY = "JSON Implementation for Ruby"
DESCRIPTION = "This is a JSON implementation as a Ruby extension in C."
LICENSE = "Ruby"

PV = "2.6.3"

RPM_NAME = "ruby3.2-rubygem-json-2.6.3-1.4.aarch64.rpm"
RPM_HASH = "6f1f249e0ab5a56a14d1d8230fe6fb596296d791d27c21488aee4cac3c0505a298632b9ea18eb779ccdbea29b820f2698fdb8e05b84355f66cc427f1662dcc46"

RPROVIDES:${PN} += "ruby3.2-rubygem-json \
rubygem-json \
rubygem-ruby-3.2.0-json \
rubygem-ruby-3.2.0-json-2 \
rubygem-ruby-3.2.0-json-2.6 \
rubygem-ruby-3.2.0-json-2.6.3"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libm.so.6 \
libruby3.2.so.3.2 \
ruby-abi"

inherit rpm
