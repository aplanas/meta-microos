SUMMARY = "Python object model built on top of JSON schema"
DESCRIPTION = "Build self-validating python objects using JSON schemas."
LICENSE = "Apache-2.0"

PV = "2.0.1"

RPM_NAME = "python39-warlock-2.0.1-1.5.noarch.rpm"
RPM_HASH = "cbed3a755d39c9211a725f5d57d9c668e3b444453c14b88c094de66839211371c72c384db8452ba16ceb28971625740e3bf9c6d1181d703b48d0b0269c75ce96"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-warlock \
python39-warlock \
python3dist-warlock"

RDEPENDS:${PN} += "python-abi \
python39-jsonpatch \
python39-jsonschema"

inherit rpm
