SUMMARY = "Local mode for Apache Ivy (files)"
DESCRIPTION = "This package contains files needed by local mode fow Apache Ivy, which \
allows artifact resolution using XMvn resolver."
LICENSE = "BSD-3-Clause"

PV = "6.2.0"

RPM_NAME = "javapackages-ivy-6.2.0-2.1.noarch.rpm"
RPM_HASH = "a85e69ba4da25ed2fe030f42872a4fbe70ece2fd43cdef2cba03f475f955085b066d7d86732650dba4bfcaeb8e189e8301e20a470b4d2f39c7cf3c88cf759a59"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "javapackages-ivy"

RDEPENDS:${PN} += "javapackages-local \
javapackages-tools"

inherit rpm
