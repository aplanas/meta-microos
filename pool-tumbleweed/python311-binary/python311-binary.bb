SUMMARY = "Library to convert between binary and SI units"
DESCRIPTION = "Python library to convert between and within binary (IEC) and decimal (SI) units."
LICENSE = "Apache-2.0 | MIT"

PV = "1.0.0"

RPM_NAME = "python311-binary-1.0.0-2.10.noarch.rpm"
RPM_HASH = "03b7a8fd362b74011db28b30f03cf20186ba74db686062b9eedacb6dc48cc42e88472fad165b3e74e337ef25150fcfb3eeb11cbdf77bb0e36a51b865114c5429"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-binary \
python3.11dist-binary \
python311-binary \
python3dist-binary"

RDEPENDS:${PN} += "python-abi"

inherit rpm
