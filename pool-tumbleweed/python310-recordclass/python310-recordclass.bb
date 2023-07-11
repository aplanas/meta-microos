SUMMARY = "Library implementing a mutable variant of namedtuple"
DESCRIPTION = "Mutable variant of namedtuple -- recordclass, which support assignments, and \
other memory saving variants."
LICENSE = "MIT"

PV = "0.18.0.1"

RPM_NAME = "python310-recordclass-0.18.0.1-1.7.aarch64.rpm"
RPM_HASH = "27ac096736197ed1f51692cd3992711369bc09625d7dde4849b2822855dfbc1143525ed1fce9c547318364d6026875d8116be54b8010604753fd8d276f99da6c"

RPROVIDES:${PN} += "python3.10dist-recordclass \
python310-recordclass \
python3dist-recordclass"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
python-abi"

inherit rpm
