SUMMARY = "One API for multiple git forges"
DESCRIPTION = "One API for multiple git forges."
LICENSE = "MIT"

PV = "0.41.0"

RPM_NAME = "python39-ogr-0.41.0-1.3.noarch.rpm"
RPM_HASH = "211d00fefeb9e49a2748a3e917fba94f9f84988d230faa124ead7ce32ffb151a3115dd32a1f5c8c3643d3227b12f4b371d7c900278db3030b60d55606b857bbb"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-ogr \
python39-ogr \
python3dist-ogr"

RDEPENDS:${PN} += "python-abi \
python39-Deprecated \
python39-GitPython \
python39-PyGithub \
python39-PyYAML \
python39-cryptography \
python39-python-gitlab \
python39-requests"

inherit rpm
