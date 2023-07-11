SUMMARY = "A declarative parser/builder for binary data"
DESCRIPTION = "Construct is a declarative parser (and builder) for binary data. \
 \
Instead of writing imperative code to parse a piece of data, a data \
structure that describes the data is declared. As this data structure is not \
code, it can be used in one direction to parse data into Pythonic objects, \
and in the other direction to convert ('build') objects into binary data."
LICENSE = "MIT"

PV = "2.10.68"

RPM_NAME = "python310-construct-2.10.68-1.7.noarch.rpm"
RPM_HASH = "12434560b435356efc9446519b7fed0a82334f84f23025eea440070f88efa7af6d7669e2f79f5d3c6783a8310e6c12a20671c0a2c454557f12289ec15f6774a0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-construct \
python310-construct \
python3dist-construct"

RDEPENDS:${PN} += "python-abi \
python310-arrow"

inherit rpm
