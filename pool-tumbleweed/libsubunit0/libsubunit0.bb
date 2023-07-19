SUMMARY = "Binary libraries for subunit"
DESCRIPTION = "Binary libraries for subunit"
LICENSE = "Apache-2.0 | BSD-3-Clause"

PV = "1.4.2"

RPM_NAME = "libsubunit0-1.4.2-3.1.aarch64.rpm"
RPM_HASH = "83faf22f52c50f4101d794f2f466b8fce7d02bddf355dffd79747b4a47feb75962969e12a5dfd10fe4e2c510aaa88659bb4a92fea7f5a6848997f3429d386797"

RPROVIDES:${PN} += "libsubunit.so.0 \
libsubunit0"

RDEPENDS:${PN} += "/sbin/ldconfig \
libc.so.6 \
subunit"

inherit rpm
