SUMMARY = "Network Performance Meter (plotting program)"
DESCRIPTION = "NetPerfMeter is a network performance meter for the UDP, \
TCP, MPTCP, SCTP and DCCP transport protocols over IPv4 and IPv6. \
It simultaneously transmits bidirectional flows to an endpoint \
and measures the resulting flow bandwidths and QoS. The \
results are written as vector and scalar files. The vector \
files can e.g. be used to create plots of the results. \
 \
This package contains a plotting program for the results."
LICENSE = "GPL-3.0-or-later"

PV = "1.9.4"

RPM_NAME = "netperfmeter-plotting-1.9.4-1.1.noarch.rpm"
RPM_HASH = "66c5fb19840a48855052aed82a9d64a7c84f61b15c4b82811cb27cc0ad4a9ef016c2b9f3042bba00f3b08c23a38e470d2a4f2ed24e33520b1f0797274eed046f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "netperfmeter-plotting"

RDEPENDS:${PN} += "/usr/bin/sh \
R-core \
netperfmeter \
netperfmeter-pdfproctools"

inherit rpm
