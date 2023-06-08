SUMMARY = "Utility to check binaries for system hardening"
DESCRIPTION = "Checksec is a bash script to check the properties of executables (like PIE, \
RELRO, PaX, Canaries, ASLR, Fortify Source). It has been originally written by \
Tobias Klein and the original source is available here: \
http://www.trapkit.de/tools/checksec.html \
 \
Modern Linux distributions offer some mitigation techniques to make it harder \
to exploit software vulnerabilities reliably. Mitigations such as RELRO, \
NoExecute (NX), Stack Canaries, Address Space Layout Randomization (ASLR) and \
Position Independent Executables (PIE) have made reliably exploiting any \
vulnerabilities that do exist far more challenging. The checksec script is \
designed to test what *standard* Linux OS and PaX (http://pax.grsecurity.net/) \
security features are being used."
LICENSE = "BSD-3-Clause"

PV = "2.6.0"

RPM_NAME = "checksec-2.6.0-1.2.noarch.rpm"
RPM_HASH = "42c252f3b79c47f4ea932ec280e0d385b6e0252e0e7339d5698f64f6fab2aa5b1c99e036c1b2ff679e795cd72edd47fb53b41bc235e365570bf36d5632542da1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "checksec"
RDEPENDS:${PN} += "/usr/bin/bash binutils file findutils gawk procps which"

inherit rpm
