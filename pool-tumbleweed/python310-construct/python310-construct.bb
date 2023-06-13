SUMMARY = "A declarative parser/builder for binary data"
DESCRIPTION = "Construct is a declarative parser (and builder) for binary data. \
 \
Instead of writing imperative code to parse a piece of data, a data \
structure that describes the data is declared. As this data structure is not \
code, it can be used in one direction to parse data into Pythonic objects, \
and in the other direction to convert ('build') objects into binary data."
LICENSE = "MIT"

PV = "2.10.68"

RPM_NAME = "python310-construct-2.10.68-1.6.noarch.rpm"
RPM_HASH = "0fe230e78839017a8ec0f94ca6967cafa2d3e5ad6b1c434cb460b4618243cdb5f382e1273086c7206566881c60291bcb8fb865e9713006bc0cc148270a421f2b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-construct \
python3.10dist(construct) \
python310-construct \
python3dist(construct)"

RDEPENDS:${PN} += "python(abi) \
python310-arrow"

inherit rpm
