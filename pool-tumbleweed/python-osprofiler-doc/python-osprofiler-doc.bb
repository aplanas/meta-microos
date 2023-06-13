SUMMARY = "Documentation for OSProfiler"
DESCRIPTION = "Documentation for OSProfiler."
LICENSE = "Apache-2.0"

PV = "3.4.3"

RPM_NAME = "python-osprofiler-doc-3.4.3-1.5.noarch.rpm"
RPM_HASH = "69c1ddb8038bbeaaedcd5b1b8a00f176bef73e2b678dc82ea312772046b75a07ced84ef1776beaf13a4843fb43088a8f66d6d294a709ab47db7a72be0bf09da6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python-osprofiler-doc"

RDEPENDS:${PN} += ""

inherit rpm
