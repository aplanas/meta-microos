SUMMARY = "A declarative parser/builder for binary data"
DESCRIPTION = "Construct is a declarative parser (and builder) for binary data. \
 \
Instead of writing imperative code to parse a piece of data, a data \
structure that describes the data is declared. As this data structure is not \
code, it can be used in one direction to parse data into Pythonic objects, \
and in the other direction to convert ('build') objects into binary data."
LICENSE = "MIT"

PV = "2.10.68"

RPM_NAME = "python311-construct-2.10.68-1.7.noarch.rpm"
RPM_HASH = "f858b3cd51982a46a7fc22e61feccb9d702ab986bdfa16033d6aeae4c9eee501eb0d0b06a522a1c9dafb5769b7aed8af244ff874e1a5e2330e4b97bef6691920"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-construct \
python3.11dist-construct \
python311-construct \
python3dist-construct"

RDEPENDS:${PN} += "python-abi \
python311-arrow"

inherit rpm
