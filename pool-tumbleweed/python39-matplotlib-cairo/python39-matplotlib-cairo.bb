SUMMARY = "Cairo backend for python39-matplotlib"
DESCRIPTION = "This package includes the non-interactive Cairo-based backend \
for the python39-matplotlib plotting package"
LICENSE = "SUSE-Matplotlib"

PV = "3.6.3"

RPM_NAME = "python39-matplotlib-cairo-3.6.3-3.1.aarch64.rpm"
RPM_HASH = "0ab157c5d95f0fd0b977709b48d0300c74286748214478f5f41e5087f24753071a55e6ff3b6fbe8266c6f69d4f4b672c6f8944f108ed425d91dd218100dc59b6"

RPROVIDES:${PN} += "python39-matplotlib-cairo"

RDEPENDS:${PN} += "python-abi \
python39-cairo \
python39-matplotlib"

inherit rpm
