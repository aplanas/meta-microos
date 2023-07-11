SUMMARY = "Python Bindings for YARA (from Virus Total)"
DESCRIPTION = "python bindings for libyara. \
YARA is a tool to identify and classify malware samples."
LICENSE = "Apache-2.0"

PV = "4.0.2"

RPM_NAME = "python311-yara-4.0.2-1.20.aarch64.rpm"
RPM_HASH = "4424c5bfd8dd9e801f6e372d4b23f474049ad2023393fc39e4daf9ae5319e9af5f9689255a25e67f8cda12b6e05b16fe266645fae7468a928f5904663f46c4c8"

RPROVIDES:${PN} += "python3-yara \
python3.11dist-yara-python \
python311-yara \
python3dist-yara-python"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libyara.so.10 \
python-abi"

inherit rpm
