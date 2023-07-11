SUMMARY = "Pytest plugin for echoing build environment attributes"
DESCRIPTION = "pytest plugin with mechanisms for echoing environment variables, \
package version and generic attributes."
LICENSE = "MIT"

PV = "1.7.1"

RPM_NAME = "python311-pytest-echo-1.7.1-1.13.noarch.rpm"
RPM_HASH = "56ea93714932c3b592da3177472328d0162d87360f195a6a318f68002b36f60189a88a4ff34839a2052d6609de0aa230d3131deab0c51a6d95becebed52c0884"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-pytest-echo \
python3.11dist-pytest-echo \
python311-pytest-echo \
python3dist-pytest-echo"

RDEPENDS:${PN} += "python-abi \
python311-pytest"

inherit rpm
