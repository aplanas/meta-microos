SUMMARY = "Development files for compatibility with radiusclient-ng and freeradius-client"
DESCRIPTION = "This package contains the compatibility headers and libraries for freeradius-client and radiusclient-ng."
LICENSE = "BSD-2-Clause & MIT"

PV = "1.3.1"

RPM_NAME = "radcli-compat-devel-1.3.1-1.3.aarch64.rpm"
RPM_HASH = "836e41d8c5035484fdd1e31aee20f699670be47ebfcad1f9c9551330956d95c2d8448eaf3d815c2f7aa55f35fe00864497ae07e5c22410af1b7519e1549c3879"

RPROVIDES:${PN} += "freeradius-client-devel \
radcli-compat-devel"

RDEPENDS:${PN} += "libradcli5 \
radcli-devel"

inherit rpm
