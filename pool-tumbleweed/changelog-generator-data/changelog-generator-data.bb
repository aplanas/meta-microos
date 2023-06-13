SUMMARY = "Data to be consumed by containement-rpm-docker"
DESCRIPTION = "Files required to dynamically generate the new changelog file of the Docker \
image RPM."
LICENSE = "MIT"

PV = "1.0.0"

RPM_NAME = "changelog-generator-data-1.0.0-1.11.noarch.rpm"
RPM_HASH = "1026bd4a66d2237662670d1e9bea6faf250e8ae11e0e868995b6e94ef8404ca2cfcdf570236d146a6d80a612de25ee47c7fed0bddc451baeac82feda5421ef73"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "changelog-generator-data"

RDEPENDS:${PN} += "rubygem(changelog_generator)"

inherit rpm
