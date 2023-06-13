SUMMARY = "Complementary light pint client"
DESCRIPTION = "seidl is a lightweight pint query utility designed for easy usage. It displays the current SUSE publiccloud images according to customizable filter rules. \
 \
In aims at complementing the public-cloud-info-client by the feature to display all current not-deleted and not-deprecated images in a nice table on the console."
LICENSE = "MIT"

PV = "0.1"

RPM_NAME = "seidl-0.1-1.7.aarch64.rpm"
RPM_HASH = "5451e53b6d4449c5450702e65f44ecd660473c78375f8dbf193cb235064147e5f580c6e4d5d9b882b757f44dcd96a428f618141716f69d22ebeceff41f8c4932"

RPROVIDES:${PN} += "seidl \
seidl(aarch-64)"

RDEPENDS:${PN} += "libc.so.6(GLIBC_2.34)(64bit)"

inherit rpm
