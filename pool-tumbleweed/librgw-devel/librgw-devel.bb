SUMMARY = "RADOS gateway client library"
DESCRIPTION = "This package contains libraries and headers needed to develop programs \
that use RADOS gateway client library."
LICENSE = "LGPL-2.1 & LGPL-3.0 & CC-BY-SA-3.0 & GPL-2.0 & BSL-1.0 & BSD-3-Clause & MIT"

PV = "16.2.13.66+g54799ee0666"

RPM_NAME = "librgw-devel-16.2.13.66+g54799ee0666-4.1.aarch64.rpm"
RPM_HASH = "5d482cf3b45daa8092692e7af2603e19b2014e5354913afc1d58b6115d5ea547d64caa1d977bdb6a5bd01bfb4a80554ff11d3859c889663e2f62f937f6976124"

RPROVIDES:${PN} += "librgw-devel \
librgw2-devel"

RDEPENDS:${PN} += "librados-devel \
librgw2"

inherit rpm
