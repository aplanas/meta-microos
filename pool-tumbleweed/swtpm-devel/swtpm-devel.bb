SUMMARY = "Development files for swtpm"
DESCRIPTION = "The development files for SWTPM"
LICENSE = "BSD-3-Clause"

PV = "0.8.0"

RPM_NAME = "swtpm-devel-0.8.0-4.1.aarch64.rpm"
RPM_HASH = "3f7e606d7ef60c3ea2bd06a9f2a8981f4c10e1e5755ea69f3e6fec39e2a64d0194f138ccdb3f2cfa99ed961407fb9d381d17add0c3ebc22429193eae5690cc1e"

RPROVIDES:${PN} += "swtpm-devel"

RDEPENDS:${PN} += "glib2-devel \
libopenssl-devel \
libseccomp-devel \
libtpms-devel \
swtpm"

inherit rpm
