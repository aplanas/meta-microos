SUMMARY = "Library to convert between binary and SI units"
DESCRIPTION = "Python library to convert between and within binary (IEC) and decimal (SI) units."
LICENSE = "Apache-2.0 | MIT"

PV = "1.0.0"

RPM_NAME = "python311-binary-1.0.0-2.8.noarch.rpm"
RPM_HASH = "cb6e6d1b9860e1bcf235eaa8522a6730f02c4fae51d58b2f61e2e955ca4061e00461367a21f387a7b456740288366697dcfd25afa09bd17ec5521404777824c4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(binary) \
python311-binary \
python3dist(binary)"
RDEPENDS:${PN} += "python(abi)"

inherit rpm
