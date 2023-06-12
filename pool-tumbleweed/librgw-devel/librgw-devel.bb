SUMMARY = "RADOS gateway client library"
DESCRIPTION = "This package contains libraries and headers needed to develop programs \
that use RADOS gateway client library."
LICENSE = "LGPL-2.1 & LGPL-3.0 & CC-BY-SA-3.0 & GPL-2.0 & BSL-1.0 & BSD-3-Clause & MIT"

PV = "16.2.13.66+g54799ee0666"

RPM_NAME = "librgw-devel-16.2.13.66+g54799ee0666-2.1.aarch64.rpm"
RPM_HASH = "a1b6c54aaf3454c2672d56a62a3ca2e9c52d8a970b729aa6dea2e505e3e48f4c77ee19b311254910171f86b0c730e6e91378980aa108ec21b72256be5ed4cd25"

RPROVIDES:${PN} += "librgw-devel \
librgw-devel(aarch-64) \
librgw2-devel"
RDEPENDS:${PN} += "librados-devel \
librgw2"

inherit rpm
