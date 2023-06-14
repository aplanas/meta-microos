SUMMARY = "A Ruby wrapper for Linux inotify, using FFI"
DESCRIPTION = "A Ruby wrapper for Linux inotify, using FFI."
LICENSE = "MIT"

PV = "0.10.1"

RPM_NAME = "ruby3.2-rubygem-rb-inotify-0.10.1-1.17.aarch64.rpm"
RPM_HASH = "349e2ee8e823e1ccd093706b3fa76a8a5b736d160d02b8dfdf0089ca0ce5469ea94834482fb8ccabc9bf59cbe676fded362462f70b454e08387e2d7cff4fba28"

RPROVIDES:${PN} += "ruby3.2-rubygem-rb-inotify \
rubygem-rb-inotify \
rubygem-ruby-3.2.0-rb-inotify \
rubygem-ruby-3.2.0-rb-inotify-0 \
rubygem-ruby-3.2.0-rb-inotify-0.10 \
rubygem-ruby-3.2.0-rb-inotify-0.10.1"

RDEPENDS:${PN} += "ruby-abi \
rubygem-ruby-3.2.0-ffi-1"

inherit rpm
