SUMMARY = "System group ne for AWS Nitro Enclaves"
DESCRIPTION = "System group ne for Nitro Enclaves."
LICENSE = "Apache-2.0"

PV = "1.2.2~git0.4ccc639"

RPM_NAME = "system-group-ne-1.2.2~git0.4ccc639-1.3.aarch64.rpm"
RPM_HASH = "b47d7a90d678f0fa58913da07b6e3f31844910795d379b71f7c20eb52121946ea3ecac93a28dbf016c03f9cb3152173e12603653c703073412e11f6b8a824402"

RPROVIDES:${PN} += "group(ne) \
system-group-ne \
system-group-ne(aarch-64)"
RDEPENDS:${PN} += "/bin/sh \
sysuser-shadow"

inherit rpm
