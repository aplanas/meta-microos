SUMMARY = "Pytest plugin for echoing build environment attributes"
DESCRIPTION = "pytest plugin with mechanisms for echoing environment variables, \
package version and generic attributes."
LICENSE = "MIT"

PV = "1.7.1"

RPM_NAME = "python39-pytest-echo-1.7.1-1.13.noarch.rpm"
RPM_HASH = "9ca424e3b5516e4e1f135859e78e90c9684baa9f794816ecd3a2df562cb230e419e923d17d50540b81009b388bc37ab16c238e89dac7fa1ee3eff00678e84157"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-pytest-echo \
python39-pytest-echo \
python3dist-pytest-echo"

RDEPENDS:${PN} += "python-abi \
python39-pytest"

inherit rpm
