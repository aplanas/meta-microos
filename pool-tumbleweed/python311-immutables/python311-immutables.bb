SUMMARY = "Immutable collections for Python"
DESCRIPTION = "Immutable collections for Python."
LICENSE = "Apache-2.0"

PV = "0.19"

RPM_NAME = "python311-immutables-0.19-2.1.aarch64.rpm"
RPM_HASH = "f069e374e79f9768fc8e628462f64ba1a140186d61df2928dee82e376b1c492f39cec74bce015c3a075b69ca5c4683313a7d74806d3c0cac60574dd3015db7e9"

RPROVIDES:${PN} += "python3.11dist(immutables) \
python311-immutables \
python311-immutables(aarch-64) \
python3dist(immutables)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.17)(64bit) \
python(abi)"

inherit rpm
