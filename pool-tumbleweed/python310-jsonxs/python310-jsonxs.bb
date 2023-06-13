SUMMARY = "Get/set values in JSON and Python datastructures"
DESCRIPTION = "JSONxs is a Python library that uses a path expression string to get and \
set values in JSON and Python datastructures. It's slightly similar to \
JSONPath, but supports only simpler expressions and allows \
modifications. \
JSONxs is safe to use with untrusted input."
LICENSE = "MIT"

PV = "0.6"

RPM_NAME = "python310-jsonxs-0.6-1.14.noarch.rpm"
RPM_HASH = "7ba7a1050cac7ccc37b80530a9bc1635a479c0fe92b8f8f8aa6f828869f6c7729f7a8e70b52228972372ac1d7adff025fff1fca6a4506ee3bde0533f355eb75c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-jsonxs \
python3.10dist(jsonxs) \
python310-jsonxs \
python3dist(jsonxs)"

RDEPENDS:${PN} += "python(abi)"

inherit rpm
