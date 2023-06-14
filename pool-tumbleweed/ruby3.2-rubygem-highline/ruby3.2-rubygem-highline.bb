SUMMARY = "HighLine is a high-level command-line IO library"
DESCRIPTION = "A high-level IO library that provides validation, type conversion, and more \
for \
command-line interfaces. HighLine also includes a complete menu system that \
can \
crank out anything from simple list selection to complete shells with just \
minutes of work."
LICENSE = "Ruby"

PV = "2.0.3"

RPM_NAME = "ruby3.2-rubygem-highline-2.0.3-1.17.aarch64.rpm"
RPM_HASH = "24b9efca063f914a29bea6650808dd3cb57f8a4fc5a8fa000e52a33de474acf4087fc664f18c4a11f5d2302524f63bc5bc5285c358c6f8bd460ecfa8f2b8449c"

RPROVIDES:${PN} += "ruby3.2-rubygem-highline \
rubygem-highline \
rubygem-ruby-3.2.0-highline \
rubygem-ruby-3.2.0-highline-2 \
rubygem-ruby-3.2.0-highline-2.0 \
rubygem-ruby-3.2.0-highline-2.0.3"

RDEPENDS:${PN} += "ruby-abi"

inherit rpm
