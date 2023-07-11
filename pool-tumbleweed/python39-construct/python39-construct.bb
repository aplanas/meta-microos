SUMMARY = "A declarative parser/builder for binary data"
DESCRIPTION = "Construct is a declarative parser (and builder) for binary data. \
 \
Instead of writing imperative code to parse a piece of data, a data \
structure that describes the data is declared. As this data structure is not \
code, it can be used in one direction to parse data into Pythonic objects, \
and in the other direction to convert ('build') objects into binary data."
LICENSE = "MIT"

PV = "2.10.68"

RPM_NAME = "python39-construct-2.10.68-1.7.noarch.rpm"
RPM_HASH = "181a6e8d0efaa7c8d39315835192c3210b7d231abca6a9fcc2e90013b97732fb44aff73dd5a24f1eff3ac94277429b9b852e036d35f27c4e5e9dda745ef52209"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-construct \
python39-construct \
python3dist-construct"

RDEPENDS:${PN} += "python-abi \
python39-arrow"

inherit rpm
