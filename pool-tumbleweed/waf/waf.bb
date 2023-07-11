SUMMARY = "The Waf build system"
DESCRIPTION = "Waf is a Python-based framework for configuring, compiling and installing applications."
LICENSE = "BSD-3-Clause"

PV = "2.0.25"

RPM_NAME = "waf-2.0.25-1.4.noarch.rpm"
RPM_HASH = "23fe47d9c43f46f69116b803015bdde3259d1dcb7cf0d48ef3646f2305cc08af4db396497a9c04cf6f89ecd9b3779db9f9535075818dd09009927702d9ffeb94"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "waf"

RDEPENDS:${PN} += "/usr/bin/python3"

inherit rpm
