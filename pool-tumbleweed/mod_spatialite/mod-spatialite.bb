SUMMARY = "Spatial SQLite extension"
DESCRIPTION = "The SpatiaLite extension enables SQLite to support spatial data too \
[aka GEOMETRY], in a way conformant to OpenGis specifications."
LICENSE = "MPL-1.1"

PV = "5.0.1"

RPM_NAME = "mod_spatialite-5.0.1-2.11.aarch64.rpm"
RPM_HASH = "a783cf2952392f22eb94b942c214354669858869af3c92d8f5ebbff1f65bc98fd2f2e313838f21ce50d5c7d995eb5b207c22de4d7d1754eac0721e815fa97803"

RPROVIDES:${PN} += "mod-spatialite"

RDEPENDS:${PN} += "libspatialite7"

inherit rpm
