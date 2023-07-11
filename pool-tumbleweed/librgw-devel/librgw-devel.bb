SUMMARY = "RADOS gateway client library"
DESCRIPTION = "This package contains libraries and headers needed to develop programs \
that use RADOS gateway client library."
LICENSE = "LGPL-2.1 & LGPL-3.0 & CC-BY-SA-3.0 & GPL-2.0 & BSL-1.0 & BSD-3-Clause & MIT"

PV = "16.2.13.66+g54799ee0666"

RPM_NAME = "librgw-devel-16.2.13.66+g54799ee0666-3.1.aarch64.rpm"
RPM_HASH = "d3a57689f8e9a0d18bc7cf76e960c8dab430ffafb4927d86b24a2b9811e666ad3e8ac2970ae9ecfd0b9b4e189d8aa5ceb911c92148c8eb6eb3236666fb5dff72"

RPROVIDES:${PN} += "librgw-devel \
librgw2-devel"

RDEPENDS:${PN} += "librados-devel \
librgw2"

inherit rpm
