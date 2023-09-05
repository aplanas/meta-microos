SUMMARY = "Parse gdb machine interface output with Python"
DESCRIPTION = "Parse gdb machine interface output with Python"
LICENSE = "MIT"

PV = "0.11.0.0"

RPM_NAME = "python39-pygdbmi-0.11.0.0-1.1.noarch.rpm"
RPM_HASH = "20c45f471dd32620aae79caad5cba90a08ff0b71190facb69847db01456d8a74bab8dc230fb79217df8b804ed4682e2b0b035b2c25a416fa472c3c8e34de76d8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-pygdbmi \
python39-pygdbmi \
python3dist-pygdbmi"

RDEPENDS:${PN} += "python-abi"

inherit rpm
