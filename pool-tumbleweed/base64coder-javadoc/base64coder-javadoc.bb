SUMMARY = "API documentation for base64coder"
DESCRIPTION = "This package contains API documentation for base64coder."
LICENSE = "EPL-1.0 | EPL-2.0 | LGPL-2.1-or-later | GPL-2.0-or-later | Apache-2.0 | BSD-2-Clause"

PV = "20101219"

RPM_NAME = "base64coder-javadoc-20101219-2.16.noarch.rpm"
RPM_HASH = "b03ca58ac24f0d4a67d4f88927aafa6ac4a6f954e5f08a3cb5f76ce20fafc05ed5e419ef6b2aca1bfd8750afb9c6703e9b41c845e2d01286e193c43acb0b4311"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "base64coder-javadoc"

RDEPENDS:${PN} += "javapackages-filesystem"

inherit rpm
