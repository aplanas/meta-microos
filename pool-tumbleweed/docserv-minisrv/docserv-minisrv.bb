SUMMARY = "Simple docserv webserver"
DESCRIPTION = "Simple docserv webserver with integrated auxserver for development and test purposes. Not for production."
LICENSE = "Apache-2.0"

PV = "20230308.4ed55cf"

RPM_NAME = "docserv-minisrv-20230308.4ed55cf-1.5.aarch64.rpm"
RPM_HASH = "20bd026ec944640f7a901448bbf59e7c6553980ec2866ec3b3cce250ad1e20cece77a9fd3bd70118210a539a5624863e1b86e8d61496798e5d99619e53c7e861"

RPROVIDES:${PN} += "docserv-minisrv \
group-docserv-srv \
user-docserv-srv"

RDEPENDS:${PN} += "/usr/bin/sh \
libc.so.6 \
sysuser-shadow"

inherit rpm
