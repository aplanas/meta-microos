SUMMARY = "Python Bindings for YARA (from Virus Total)"
DESCRIPTION = "python bindings for libyara. \
YARA is a tool to identify and classify malware samples."
LICENSE = "Apache-2.0"

PV = "4.0.2"

RPM_NAME = "python311-yara-4.0.2-1.18.aarch64.rpm"
RPM_HASH = "09baf2b618615000a00eef391a2bb84409fb7d07e597dda7f2239917947a3c0d3896b8eceb2c2bb3fe44e0b71bc13e9106432294e198577a87b217d69c6fd6c2"

RPROVIDES:${PN} += "python3.11dist(yara-python) \
python311-yara \
python311-yara(aarch-64) \
python3dist(yara-python)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
libc.so.6()(64bit) \
libyara.so.10()(64bit) \
python(abi)"

inherit rpm
