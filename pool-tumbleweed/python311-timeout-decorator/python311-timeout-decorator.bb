SUMMARY = "Python timeout decorator"
DESCRIPTION = "Python timeout decorator."
LICENSE = "MIT"

PV = "0.5.0"

RPM_NAME = "python311-timeout-decorator-0.5.0-1.1.noarch.rpm"
RPM_HASH = "c17e4a5b5f237c8b41d3b37c5c20bba7f66c517dc133d7cdd0f421e34e6117a5a4edd10eb0b4ad3ace8ac40ebaba6673949ef5c3ee4cf2e650113aa7e588e39a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(timeout-decorator) \
python311-timeout-decorator \
python3dist(timeout-decorator)"
RDEPENDS:${PN} += "python(abi)"

inherit rpm
