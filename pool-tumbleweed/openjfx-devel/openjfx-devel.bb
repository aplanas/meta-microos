SUMMARY = "OpenJFX development tools and libraries"
DESCRIPTION = "OpenJFX development tools and libraries."
LICENSE = "BSD-3-Clause & GPL-2.0-only-with-Classpath-exception-2.0"

PV = "17.0.7.0"

RPM_NAME = "openjfx-devel-17.0.7.0-1.2.aarch64.rpm"
RPM_HASH = "aa6f7da38eca2bb8f7b34af09c88ec8648778a8ed2ea31f9c63fd80afad867d64c0a76894b48939031f3e5b6f16bf93c1feee8c3fd9ff94712770f57bbc9a034"

RPROVIDES:${PN} += "openjfx-devel"

RDEPENDS:${PN} += "openjfx"

inherit rpm
