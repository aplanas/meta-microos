SUMMARY = "Pure-Python robotstxt parser with support for modern conventions"
DESCRIPTION = "Protego is a pure-Python `robots.txt` parser with support for modern conventions."
LICENSE = "BSD-3-Clause"

PV = "0.2.1"

RPM_NAME = "python310-Protego-0.2.1-2.5.noarch.rpm"
RPM_HASH = "f7ac92f9abb2aa0e6a2e20a7daa8778c23730b748d388909364abc617325a5bbc44e893f4d08c277340e1c8283114491747e582c8e9d485135468fda44407d05"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-protego \
python310-Protego \
python3dist-protego"

RDEPENDS:${PN} += "python-abi \
python310-six"

inherit rpm
