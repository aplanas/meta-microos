SUMMARY = "Run any kind of code in parallel processes"
DESCRIPTION = "Run any kind of code in parallel processes."
LICENSE = "MIT"

PV = "1.22.1"

RPM_NAME = "ruby3.2-rubygem-parallel-1.22.1-1.8.aarch64.rpm"
RPM_HASH = "01f5d1e9112045265cc923d931f868fc5f552a894ae24c7ab82b403b46eb1c8a87f12dadb07b2c0068b4878bf5eddb87ecfcc091cdb75e8297fb61cb3ba0ba6d"

RPROVIDES:${PN} += "ruby3.2-rubygem-parallel \
ruby3.2-rubygem-parallel(aarch-64) \
rubygem(parallel) \
rubygem(ruby:3.2.0:parallel) \
rubygem(ruby:3.2.0:parallel:1) \
rubygem(ruby:3.2.0:parallel:1.22) \
rubygem(ruby:3.2.0:parallel:1.22.1)"

RDEPENDS:${PN} += "ruby(abi)"

inherit rpm
