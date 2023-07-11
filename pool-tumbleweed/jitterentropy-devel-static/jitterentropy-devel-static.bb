SUMMARY = "Jitter entropy generator static library"
DESCRIPTION = "The Jitter RNG provides a noise source using the CPU execution \
timing jitter. It depends on a high-resolution time stamp. \
 \
This package contains the static library."
LICENSE = "BSD-3-Clause | GPL-2.0-or-later"

PV = "3.4.1"

RPM_NAME = "jitterentropy-devel-static-3.4.1-2.2.aarch64.rpm"
RPM_HASH = "6ef9e44b031783ab53d8ca21fb94774d73f5d3b91bb8408698f4cd383e9fe3207af936c99cc613336d3b0bae607cb0513dd96b86ab351278d4b7554c6ccaedf1"

RPROVIDES:${PN} += "jitterentropy-devel-static"

RDEPENDS:${PN} += ""

inherit rpm
