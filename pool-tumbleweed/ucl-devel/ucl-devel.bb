SUMMARY = "Development files for the UCL library"
DESCRIPTION = "Headers and other development files for UCL library."
LICENSE = "GPL-2.0-or-later"

PV = "1.03"

RPM_NAME = "ucl-devel-1.03-5.3.aarch64.rpm"
RPM_HASH = "a77bb10925d4cb9204c2841dce873e5a42de3c7b8db55ccc3c3ff9aa88b5af12a8a41b359c08d2191ab99d21e2e46626452b4695a224ed55ac59925b9a3c12e8"

RPROVIDES:${PN} += "libucl1-devel \
ucl-devel"

RDEPENDS:${PN} += "libucl1"

inherit rpm
