SUMMARY = "Toolkit for CMPI indication providers (Development Files)"
DESCRIPTION = "This package contain developer library for helping out when writing \
CMPI providers. This library polls the registered functions for data \
and if they change an CMPI indication is set with the values of the \
indication class properties (also set by the developer). \
 \
This package holds the development files for sblim-indication_helper."
LICENSE = "EPL-1.0"

PV = "0.5.0"

RPM_NAME = "sblim-indication_helper-devel-0.5.0-1.21.aarch64.rpm"
RPM_HASH = "85badb6125614db40c18badf1d0bd9d7081c2758641419205425a514f74181f16b29661efa4cf84764ae878348d450e6eea42e88a2676779278f8a823f2b0211"

RPROVIDES:${PN} += "sblim-indication_helper-devel \
sblim-indication_helper-devel(aarch-64)"

RDEPENDS:${PN} += "glibc-devel \
sblim-cmpi-devel \
sblim-indication_helper"

inherit rpm
