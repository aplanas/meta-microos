SUMMARY = "Development files for the GNU New Portable Threads library"
DESCRIPTION = "nPth is a non-preemptive threads implementation using an API \
similar to the one in GNU Pth. \
 \
This subpackage contains the headers for npth."
LICENSE = "LGPL-2.0-or-later"

PV = "1.6"

RPM_NAME = "npth-devel-1.6-2.10.aarch64.rpm"
RPM_HASH = "cea088f0d7a08223412ed8b3290138d3ab9735197ad67d994693132b1b6db98f027569a470118e2fda70eeb2fa5f0a44b9bef7f6dfe9a7d25e969979eec5d481"

RPROVIDES:${PN} += "npth-devel"

RDEPENDS:${PN} += "/usr/bin/sh \
libnpth0"

inherit rpm
