SUMMARY = "Object-oriented paths"
DESCRIPTION = "Python object-oriented paths."
LICENSE = "Apache-2.0"

PV = "0.4.3"

RPM_NAME = "python39-pathable-0.4.3-4.3.noarch.rpm"
RPM_HASH = "b95451df5adf3b94401185a4db833dc4d6cabe0594c4c6d3242a6bebb51bbd9f75829636753594ad3a4ee8cc5af77a6e45da630c30f3e723d4288d3ff944d1f9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-pathable \
python39-dictpath \
python39-pathable \
python3dist-pathable"

RDEPENDS:${PN} += "python-abi"

inherit rpm
