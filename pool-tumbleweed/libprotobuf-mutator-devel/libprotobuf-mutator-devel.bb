SUMMARY = "Development files for libprotobuf-mutator"
DESCRIPTION = "Development files for libprotobuf-mutator - a library to randomly mutate \
protobuffers."
LICENSE = "Apache-2.0"

PV = "20190610"

RPM_NAME = "libprotobuf-mutator-devel-20190610-1.28.aarch64.rpm"
RPM_HASH = "46139a63607abe0083035f686821067a25005f9b3ff154ef51658197c0639e2efa762684fe89544cce341a1db80fe575c20f2f6328920bd1c07483b78f68f778"

RPROVIDES:${PN} += "libprotobuf-mutator-devel \
libprotobuf-mutator-devel(aarch-64) \
pkgconfig(libprotobuf-mutator)"

RDEPENDS:${PN} += "/usr/bin/pkg-config"

inherit rpm
