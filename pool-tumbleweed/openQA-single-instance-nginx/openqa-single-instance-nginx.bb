SUMMARY = "Convenience package for a single-instance setup using nginx proxy"
DESCRIPTION = "Use this package to setup a local instance with all services provided together."
LICENSE = "GPL-2.0-or-later"

PV = "4.6.1692951551.c933949"

RPM_NAME = "openQA-single-instance-nginx-4.6.1692951551.c933949-1.1.aarch64.rpm"
RPM_HASH = "d492d2428e66e0f69815f34b49a68fdcf8610cd9fc2344d7a36b8343733b4f02c40489423f62e5770369c28f95a05671dd510d672d43582152579545dc49f27c"

RPROVIDES:${PN} += "openQA-single-instance-nginx"

RDEPENDS:${PN} += "nginx \
openQA \
openQA-local-db \
openQA-worker"

inherit rpm
