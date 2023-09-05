SUMMARY = "Instant Messenger - Development Files"
DESCRIPTION = "Kopete is the KDE instant messenger and supports multiple protocols."
LICENSE = "GPL-2.0-or-later"

PV = "23.08.0"

RPM_NAME = "kopete-devel-23.08.0-1.1.aarch64.rpm"
RPM_HASH = "5854a05c8fd27da5d3af61a7831771ee173a851b55ff45cd95b9deb118314f2ca10cdfa273f4513f46459fb926ae4f8122b6d711926dcb509c4472c9afe053bf"

RPROVIDES:${PN} += "kopete-devel"

RDEPENDS:${PN} += "kopete"

inherit rpm
