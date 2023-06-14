SUMMARY = "Fork of guard/listen"
DESCRIPTION = "This fork of guard/listen provides a stable API for users of the ruby Sass \
CLI."
LICENSE = "MIT"

PV = "4.0.0"

RPM_NAME = "ruby3.2-rubygem-sass-listen-4.0.0-1.25.aarch64.rpm"
RPM_HASH = "2ce353902e925156bef797369f072667df84a74acc533fe9726060d2367bffabb43f1219298f54fa6f32abe0346c15e5193ccc993d5708ea76bf22299f1640b8"

RPROVIDES:${PN} += "ruby3.2-rubygem-sass-listen \
rubygem-ruby-3.2.0-sass-listen \
rubygem-ruby-3.2.0-sass-listen-4 \
rubygem-ruby-3.2.0-sass-listen-4.0 \
rubygem-ruby-3.2.0-sass-listen-4.0.0 \
rubygem-sass-listen"

RDEPENDS:${PN} += "ruby-abi \
rubygem-ruby-3.2.0-rb-fsevent \
rubygem-ruby-3.2.0-rb-fsevent-0 \
rubygem-ruby-3.2.0-rb-inotify \
rubygem-ruby-3.2.0-rb-inotify-0"

inherit rpm
