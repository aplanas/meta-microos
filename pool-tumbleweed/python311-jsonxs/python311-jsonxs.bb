SUMMARY = "Get/set values in JSON and Python datastructures"
DESCRIPTION = "JSONxs is a Python library that uses a path expression string to get and \
set values in JSON and Python datastructures. It's slightly similar to \
JSONPath, but supports only simpler expressions and allows \
modifications. \
JSONxs is safe to use with untrusted input."
LICENSE = "MIT"

PV = "0.6"

RPM_NAME = "python311-jsonxs-0.6-1.14.noarch.rpm"
RPM_HASH = "c566d7b7e571884e8307842dcb9631dd0f7a588c6e1fa9730a092aae1e51c4cf57bbd370b53e45ae132733ae8cc6906695c6321bc125a07a25104cc2defb8816"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(jsonxs) \
python311-jsonxs \
python3dist(jsonxs)"

RDEPENDS:${PN} += "python(abi)"

inherit rpm
