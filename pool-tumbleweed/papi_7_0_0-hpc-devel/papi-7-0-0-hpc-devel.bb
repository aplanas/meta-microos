SUMMARY = "Software Development Kit for PAPI"
DESCRIPTION = "This package includes the C header files that specify the PAPI userspace \
libraries and interfaces. This is required for rebuilding any program \
that uses PAPI."
LICENSE = "BSD-3-Clause"

PV = "7.0.0"

RPM_NAME = "papi_7_0_0-hpc-devel-7.0.0-1.4.aarch64.rpm"
RPM_HASH = "606856fdb5c87c0d4e0a4d1f047c745e9631a14ca316bf7cc77354e9cf872e8774ff9095371b2a75646ea40b967ea7729bf08551c7543d2fc24dba8883f3c779"

RPROVIDES:${PN} += "papi-7-0-0-hpc-devel"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libpapi-7-0-0-hpc \
libpfm.so.4 \
linux-kernel-headers \
papi-7-0-0-hpc"

inherit rpm
