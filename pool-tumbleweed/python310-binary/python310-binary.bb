SUMMARY = "Library to convert between binary and SI units"
DESCRIPTION = "Python library to convert between and within binary (IEC) and decimal (SI) units."
LICENSE = "Apache-2.0 | MIT"

PV = "1.0.0"

RPM_NAME = "python310-binary-1.0.0-2.8.noarch.rpm"
RPM_HASH = "6083ed16cdb0b2f80c6fe35d87d3523d5e299776b7f61bbad802ed525a58ae68f0c25c4e893da0faaa813a5837ee31d8667bd8849ba127005769e0cc15149e83"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-binary \
python3.10dist(binary) \
python310-binary \
python3dist(binary)"

RDEPENDS:${PN} += "python(abi)"

inherit rpm
