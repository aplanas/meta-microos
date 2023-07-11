SUMMARY = "Get/set values in JSON and Python datastructures"
DESCRIPTION = "JSONxs is a Python library that uses a path expression string to get and \
set values in JSON and Python datastructures. It's slightly similar to \
JSONPath, but supports only simpler expressions and allows \
modifications. \
JSONxs is safe to use with untrusted input."
LICENSE = "MIT"

PV = "0.6"

RPM_NAME = "python39-jsonxs-0.6-1.15.noarch.rpm"
RPM_HASH = "8e46378c7ac0c6c601ea742d1239268cfa2fb7528ab2c137efbdf4df0190e951eabd392edcb118170a4296fe082eafefac542bf91760c77ff7d355934b7768b5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-jsonxs \
python39-jsonxs \
python3dist-jsonxs"

RDEPENDS:${PN} += "python-abi"

inherit rpm
