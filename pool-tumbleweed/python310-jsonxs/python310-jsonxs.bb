SUMMARY = "Get/set values in JSON and Python datastructures"
DESCRIPTION = "JSONxs is a Python library that uses a path expression string to get and \
set values in JSON and Python datastructures. It's slightly similar to \
JSONPath, but supports only simpler expressions and allows \
modifications. \
JSONxs is safe to use with untrusted input."
LICENSE = "MIT"

PV = "0.6"

RPM_NAME = "python310-jsonxs-0.6-1.15.noarch.rpm"
RPM_HASH = "58cc5fb14223bb39b5894cc0dedbe5d938e14d636fdc7a0f296f6c91cb3e7b9c29aa0f14921baabc405c08c23cedec08f4b5fd0b82b0522993a9c5ff41601a69"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-jsonxs \
python310-jsonxs \
python3dist-jsonxs"

RDEPENDS:${PN} += "python-abi"

inherit rpm
