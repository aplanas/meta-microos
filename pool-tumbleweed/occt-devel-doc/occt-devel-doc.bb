SUMMARY = "Development files for occt"
DESCRIPTION = "Developer documentation for OpenCASCADE"
LICENSE = "LGPL-2.1-only-with-OCCT-exception-1.0"

PV = "7.7.0"

RPM_NAME = "occt-devel-doc-7.7.0-1.4.noarch.rpm"
RPM_HASH = "b0d65d63f2443e4d8b73928e692984ce888fdbb3a5f0bbc29944e2fe3b50ec81fbb441f7f5b515978330d13e601b8f202d219e0f6bb86398003b8374160da8ce"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "occt-devel-doc"

RDEPENDS:${PN} += ""

inherit rpm
