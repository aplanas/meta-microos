SUMMARY = "A declarative parser/builder for binary data"
DESCRIPTION = "Construct is a declarative parser (and builder) for binary data. \
 \
Instead of writing imperative code to parse a piece of data, a data \
structure that describes the data is declared. As this data structure is not \
code, it can be used in one direction to parse data into Pythonic objects, \
and in the other direction to convert ('build') objects into binary data."
LICENSE = "MIT"

PV = "2.10.68"

RPM_NAME = "python311-construct-2.10.68-1.6.noarch.rpm"
RPM_HASH = "82202640aab22828ddef489caf2b9b335bf5aea0284d70d5c4bf7ff73fb19a342e1875710518a21cc6b63f15d2f894ea768dd3e31f35475191cbda2954fa133d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(construct) \
python311-construct \
python3dist(construct)"

RDEPENDS:${PN} += "python(abi) \
python311-arrow"

inherit rpm
