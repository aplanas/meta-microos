SUMMARY = "Development files to build upon libcapstone"
DESCRIPTION = "Development files to build upon libcapstone, C language only."
LICENSE = "BSD-3-Clause"

PV = "4.0.2"

RPM_NAME = "libcapstone-devel-4.0.2-2.3.aarch64.rpm"
RPM_HASH = "9f9f1ef07f731ddfb3eeaecd05a1ffbd428d81da2041bc4d3dc851d56e662e591b9111c3376c0d4a55b7b4040324f823de1c916894c04baf5e2f599134c42045"

RPROVIDES:${PN} += "libcapstone-devel \
libcapstone-devel(aarch-64) \
pkgconfig(capstone)"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libcapstone4"

inherit rpm
