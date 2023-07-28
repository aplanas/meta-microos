SUMMARY = "Documentation for the FUSE library version 3"
DESCRIPTION = "This package contains the documentation for FUSE (userspace filesystem)."
LICENSE = "BSD-2-Clause & GPL-2.0-only & LGPL-2.1-only"

PV = "3.15.1"

RPM_NAME = "fuse3-doc-3.15.1-1.1.aarch64.rpm"
RPM_HASH = "74160fd99ca6c392adb84a8fb6429b3b970a2380129dd3a08c665a730b4e99218c43f448c6d7e7acdf11272679c4123717dbd27b9474acc48dab5528535589f9"

RPROVIDES:${PN} += "fuse3-doc"

RDEPENDS:${PN} += ""

inherit rpm
