SUMMARY = "Development files for libprotobuf-mutator"
DESCRIPTION = "Development files for libprotobuf-mutator - a library to randomly mutate \
protobuffers."
LICENSE = "Apache-2.0"

PV = "20190610"

RPM_NAME = "libprotobuf-mutator-devel-20190610-1.29.aarch64.rpm"
RPM_HASH = "ac1b5db63be89c8ef18e7813b5644f944bed7489ed81b76533a2872ae85ec495502b6dc21aeccd14beeb32da74d9f21799432fbc948f26b7ae2a754e1db08335"

RPROVIDES:${PN} += "libprotobuf-mutator-devel \
pkgconfig-libprotobuf-mutator"

RDEPENDS:${PN} += "/usr/bin/pkg-config"

inherit rpm
