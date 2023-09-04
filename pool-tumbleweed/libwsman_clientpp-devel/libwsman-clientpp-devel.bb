SUMMARY = "C++ development files for OpenWSMAN"
DESCRIPTION = "OpenWSMAN is an implementation of the WS-Management protocol stack. \
 \
Development files for the C++ interface to the OpenWSMAN client library."
LICENSE = "BSD-3-Clause & GPL-2.0-only"

PV = "2.7.2"

RPM_NAME = "libwsman_clientpp-devel-2.7.2-2.9.aarch64.rpm"
RPM_HASH = "e423aecabd5719fbc912943c16007220aa1f09c5fb8116972ee3b72ca8607c3df4722af9ac0bc3b3e9358fea05c1fc6cd20892f158579f19c5cd5c4bc14d3293"

RPROVIDES:${PN} += "libwsman-clientpp-devel"

RDEPENDS:${PN} += "libwsman-clientpp1 \
libwsman-devel"

inherit rpm
