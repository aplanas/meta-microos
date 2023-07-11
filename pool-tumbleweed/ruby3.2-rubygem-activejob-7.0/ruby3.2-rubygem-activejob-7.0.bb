SUMMARY = "Job framework with pluggable queues"
DESCRIPTION = "Declare job classes that can be run by a variety of queuing backends."
LICENSE = "MIT"

PV = "7.0.5.1"

RPM_NAME = "ruby3.2-rubygem-activejob-7.0-7.0.5.1-1.1.aarch64.rpm"
RPM_HASH = "f236e704e85eefd0c66db9234d9509a0f758dea6a2190ffdc5be1398436fb4d049f8319f4d576d6efb061c0a0bb1da84f466f125eedffc9c5ed99b418a5f7cfa"

RPROVIDES:${PN} += "ruby3.2-rubygem-activejob-7.0 \
rubygem-activejob \
rubygem-ruby-3.2.0-activejob \
rubygem-ruby-3.2.0-activejob-7 \
rubygem-ruby-3.2.0-activejob-7.0 \
rubygem-ruby-3.2.0-activejob-7.0.5"

RDEPENDS:${PN} += "ruby-abi \
rubygem-ruby-3.2.0-activesupport \
rubygem-ruby-3.2.0-globalid"

inherit rpm
