SUMMARY = "Get/set values in JSON and Python datastructures"
DESCRIPTION = "JSONxs is a Python library that uses a path expression string to get and \
set values in JSON and Python datastructures. It's slightly similar to \
JSONPath, but supports only simpler expressions and allows \
modifications. \
JSONxs is safe to use with untrusted input."
LICENSE = "MIT"

PV = "0.6"

RPM_NAME = "python311-jsonxs-0.6-1.15.noarch.rpm"
RPM_HASH = "0b91facaf7d410b60acb2512ca0e4319ff26bbc078c8df39875dbede976b9ef07eb1deeade329b860567cfabcb8eedd52119ff3f1d0d689ab679a671649c3dda"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-jsonxs \
python3.11dist-jsonxs \
python311-jsonxs \
python3dist-jsonxs"

RDEPENDS:${PN} += "python-abi"

inherit rpm
