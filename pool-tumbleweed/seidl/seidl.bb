SUMMARY = "Complementary light pint client"
DESCRIPTION = "seidl is a lightweight pint query utility designed for easy usage. It displays the current SUSE publiccloud images according to customizable filter rules. \
 \
In aims at complementing the public-cloud-info-client by the feature to display all current not-deleted and not-deprecated images in a nice table on the console."
LICENSE = "MIT"

PV = "0.1"

RPM_NAME = "seidl-0.1-1.8.aarch64.rpm"
RPM_HASH = "cd216f8bbe7752d0dd96584caaae4198ec1411c98e135dc87498e9e3f959eb0dd95e1ad87243f5defea2a9ee4651fb0933cff65d4f4ca7b3c467a97a7c941552"

RPROVIDES:${PN} += "seidl"

RDEPENDS:${PN} += "libc.so.6"

inherit rpm
