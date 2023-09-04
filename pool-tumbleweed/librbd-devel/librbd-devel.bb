SUMMARY = "RADOS block device headers"
DESCRIPTION = "This package contains libraries and headers needed to develop programs \
that use RADOS block device."
LICENSE = "LGPL-2.1 & LGPL-3.0 & CC-BY-SA-3.0 & GPL-2.0 & BSL-1.0 & BSD-3-Clause & MIT"

PV = "16.2.13.66+g54799ee0666"

RPM_NAME = "librbd-devel-16.2.13.66+g54799ee0666-4.1.aarch64.rpm"
RPM_HASH = "ed376b525ea9ead49e222ef9d0ca770d19afdabf5c341b3e0d074ceff8f4dcfe0f9aefd733845de8e4e78780e66463153d68804c125a7267ddc4314faa47e264"

RPROVIDES:${PN} += "librbd-devel \
librbd1-devel"

RDEPENDS:${PN} += "librados-devel \
libradospp-devel \
librbd1"

inherit rpm
