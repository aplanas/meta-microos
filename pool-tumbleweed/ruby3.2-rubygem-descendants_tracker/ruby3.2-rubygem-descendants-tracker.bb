SUMMARY = "Module that adds descendant tracking to a class"
DESCRIPTION = "Module that adds descendant tracking to a class."
LICENSE = "MIT"

PV = "0.0.4"

RPM_NAME = "ruby3.2-rubygem-descendants_tracker-0.0.4-1.32.aarch64.rpm"
RPM_HASH = "96832154f3b1ad5fd52bf65a0e0f7bc75f16f7e9daf677dfd5ec2723d4c454f7ae5ce1b234aeead981753280a7c27410f854812aceac3e2202aed67212ad3044"

RPROVIDES:${PN} += "ruby3.2-rubygem-descendants-tracker \
rubygem-descendants-tracker \
rubygem-ruby-3.2.0-descendants-tracker \
rubygem-ruby-3.2.0-descendants-tracker-0 \
rubygem-ruby-3.2.0-descendants-tracker-0.0 \
rubygem-ruby-3.2.0-descendants-tracker-0.0.4"

RDEPENDS:${PN} += "ruby-abi \
rubygem-ruby-3.2.0-thread-safe \
rubygem-ruby-3.2.0-thread-safe-0"

inherit rpm
