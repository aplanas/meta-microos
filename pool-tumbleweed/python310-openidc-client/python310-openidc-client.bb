SUMMARY = "Python OpenID client"
DESCRIPTION = "Python client for OpenID including token caching and management."
LICENSE = "MIT"

PV = "0.6.0"

RPM_NAME = "python310-openidc-client-0.6.0-1.11.noarch.rpm"
RPM_HASH = "62a30adea1a4873eb3fcf2582054ab521dea61e705b347a1b6a1bc0bee6203abd67b39eb02f29728f2bc0db54bbaf8594fc4d6abbaad5cdef617b18cddbe4446"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-openidc-client \
python3.10dist-openidc-client \
python310-openidc-client \
python3dist-openidc-client"

RDEPENDS:${PN} += "python-abi \
python310-requests"

inherit rpm
