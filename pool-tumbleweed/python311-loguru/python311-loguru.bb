SUMMARY = "Python logging component with a simple interface"
DESCRIPTION = "Python logging component providing a single object \
which dispatches log messages to configured handlers."
LICENSE = "MIT"

PV = "0.7.0"

RPM_NAME = "python311-loguru-0.7.0-2.1.noarch.rpm"
RPM_HASH = "20f93aaaae615fa51fbbe53bb47cb4baa72f0895d30b5312f3e1f4a92307a8cdddad4876543e24540b7faa4a658556dc6372be1ffd4b13a81b6700a467013c0d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(loguru) \
python311-loguru \
python3dist(loguru)"

RDEPENDS:${PN} += "python(abi)"

inherit rpm
