SUMMARY = "Apple SOC based arm64 systems"
DESCRIPTION = "Device Tree files for Apple SOC based arm64 systems."
LICENSE = "GPL-2.0-only"

PV = "6.3.4"

RPM_NAME = "dtb-apple-6.3.4-1.1.aarch64.rpm"
RPM_HASH = "19bad81f8441363d8f2ab322591dcfcc7884782c8746c1ff0e1e0527ca188b58590ca38f683113e233a4ca40a58a27fef5ca83d8691af1434619775555eeebaa"

RPROVIDES:${PN} += "dtb-apple \
dtb-apple(aarch-64) \
multiversion(dtb)"

RDEPENDS:${PN} += "/bin/sh \
coreutils"

inherit rpm
