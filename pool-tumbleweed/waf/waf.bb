SUMMARY = "The Waf build system"
DESCRIPTION = "Waf is a Python-based framework for configuring, compiling and installing applications."
LICENSE = "BSD-3-Clause"

PV = "2.0.25"

RPM_NAME = "waf-2.0.25-1.3.noarch.rpm"
RPM_HASH = "500117fb950a62d708fe0d19790071273a0610c8ddf10a5e49fbec7b2cbf2d9b06057c048f6da197c1c0b304c53032c166053fcafed5111a13b0a2e5e0b6ec67"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "waf"
RDEPENDS:${PN} += "/usr/bin/python3"

inherit rpm
