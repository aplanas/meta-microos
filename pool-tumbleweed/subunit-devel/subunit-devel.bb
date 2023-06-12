SUMMARY = "Header files for developing C applications that use subunit"
DESCRIPTION = "Header files and libraries for developing C applications that use subunit."
LICENSE = "Apache-2.0 | BSD-3-Clause"

PV = "1.4.2"

RPM_NAME = "subunit-devel-1.4.2-2.2.aarch64.rpm"
RPM_HASH = "e03ae27c5717a2a24817c856f074f8caec40863a406eb4e7a8afd1787434d66c334ab53171aa08c03b893e1e7922fb1dcaede33645dc35e447d31947598638c8"

RPROVIDES:${PN} += "pkgconfig(libsubunit) \
subunit-devel \
subunit-devel(aarch-64)"
RDEPENDS:${PN} += "/usr/bin/pkg-config \
libsubunit0 \
subunit(aarch-64)"

inherit rpm
