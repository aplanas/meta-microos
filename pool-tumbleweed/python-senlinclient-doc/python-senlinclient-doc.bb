SUMMARY = "Documentation for OpenStack Senlin API Client"
DESCRIPTION = "This is a client for the OpenStack Senlin API. \
It implements 100% of the OpenStack Senlin API. This package contains \
auto-generated documentation."
LICENSE = "Apache-2.0"

PV = "2.4.0"

RPM_NAME = "python-senlinclient-doc-2.4.0-1.6.noarch.rpm"
RPM_HASH = "36ab2b0ff310a0215292169a1dedc0b7450f2636b3682a0ef1c6427844fa39410a2a42323e9972dc8b707ef7e98e16133241cf0b4b37beb594d876b2eff34cf1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python-senlinclient-doc"

RDEPENDS:${PN} += ""

inherit rpm
