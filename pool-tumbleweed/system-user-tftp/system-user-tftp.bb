SUMMARY = "System user and group tftp"
DESCRIPTION = "This package provides the system account and group 'tftp'."
LICENSE = "MIT"

PV = "20170617"

RPM_NAME = "system-user-tftp-20170617-24.14.noarch.rpm"
RPM_HASH = "b8fb33da24f61606598f8ecef075bc00c8c7a339622bc7233e354c627feead79df94b3c590938d50c3ad54caa5c3ab37cb4698c05a78f0fb81f6182deb7bc1a0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "group(tftp) \
system-user-tftp \
user(tftp)"

RDEPENDS:${PN} += "/bin/sh \
sysuser-shadow"

inherit rpm
