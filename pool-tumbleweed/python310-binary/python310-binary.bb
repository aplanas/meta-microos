SUMMARY = "Library to convert between binary and SI units"
DESCRIPTION = "Python library to convert between and within binary (IEC) and decimal (SI) units."
LICENSE = "Apache-2.0 | MIT"

PV = "1.0.0"

RPM_NAME = "python310-binary-1.0.0-2.10.noarch.rpm"
RPM_HASH = "4b786f6bca5dba26f340ddde1ffd5d3cfc9200d015579c8766773713672487c601f7930a15abf3815fa88b00f3828e45dabd57608d7c44696a5eb99ee7054783"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-binary \
python310-binary \
python3dist-binary"

RDEPENDS:${PN} += "python-abi"

inherit rpm
