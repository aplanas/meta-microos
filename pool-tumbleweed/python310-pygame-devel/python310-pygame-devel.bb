SUMMARY = "Pygame development package"
DESCRIPTION = "This package contains the header files for developers of Pygame."
LICENSE = "LGPL-2.1-or-later"

PV = "2.1.3"

RPM_NAME = "python310-pygame-devel-2.1.3-2.2.aarch64.rpm"
RPM_HASH = "a80ead3b6be60b921703c92a0ddc59820c883f16f30c406501aab42a85b1a1bfaeff3085089770c9e5c0561d02e364602c7f6c860645880259ed7263144ea5e2"

RPROVIDES:${PN} += "python310-pygame-devel"

RDEPENDS:${PN} += "python310-pygame"

inherit rpm
