SUMMARY = "Akismet v1.1 module for Python"
DESCRIPTION = "Akismet v1.1 module for Python."
LICENSE = "MIT"

PV = "0.4.3"

RPM_NAME = "python310-python-akismet-0.4.3-1.5.noarch.rpm"
RPM_HASH = "d8b7e1867d3540beca55dd14cd6e8516d7b8217fd49fca5a2ac69cfb9274ff88adab42e431bca9ec4ce870d05d29879c6932068d49ea1cd257e717b6e1fd2962"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-python-akismet \
python310-python-akismet \
python3dist-python-akismet"

RDEPENDS:${PN} += "python-abi \
python310-requests"

inherit rpm
