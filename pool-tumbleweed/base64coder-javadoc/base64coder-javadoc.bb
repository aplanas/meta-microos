SUMMARY = "API documentation for base64coder"
DESCRIPTION = "This package contains API documentation for base64coder."
LICENSE = "EPL-1.0 | EPL-2.0 | LGPL-2.1-or-later | GPL-2.0-or-later | Apache-2.0 | BSD-2-Clause"

PV = "20101219"

RPM_NAME = "base64coder-javadoc-20101219-2.15.noarch.rpm"
RPM_HASH = "edc2ffdeff9e56d12db7442185e6c8bfc22cef393475f29d9b6e349d43071bcc4d395d6b00ebc9e6917c04a785c3eea350f09ca7d7c9f9015bd2630e7fe87a71"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "base64coder-javadoc"

RDEPENDS:${PN} += "javapackages-filesystem"

inherit rpm
