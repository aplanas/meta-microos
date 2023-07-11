SUMMARY = "System group ne for AWS Nitro Enclaves"
DESCRIPTION = "System group ne for Nitro Enclaves."
LICENSE = "Apache-2.0"

PV = "1.2.2~git0.4ccc639"

RPM_NAME = "system-group-ne-1.2.2~git0.4ccc639-1.5.aarch64.rpm"
RPM_HASH = "8111af5da5fdb1479b3d38dcfa69604e499f9b793200473455a296caee6da756112cbc7d77b4c66b2ae7641b19e3579356d1c05998e02073fc8217a4958ef15c"

RPROVIDES:${PN} += "group-ne \
system-group-ne"

RDEPENDS:${PN} += "/usr/bin/sh \
sysuser-shadow"

inherit rpm
