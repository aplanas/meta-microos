SUMMARY = "Python Bindings for YARA (from Virus Total)"
DESCRIPTION = "python bindings for libyara. \
YARA is a tool to identify and classify malware samples."
LICENSE = "Apache-2.0"

PV = "4.0.2"

RPM_NAME = "python310-yara-4.0.2-1.20.aarch64.rpm"
RPM_HASH = "2fc4269e24263946df6d8aabcf182fe3a7a274748fbe831ff13c7935728d8d5844b8740d59a9e0976537993f4ff76ecb86feefba306400dc67d07a678513deb8"

RPROVIDES:${PN} += "python3.10dist-yara-python \
python310-yara \
python3dist-yara-python"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libyara.so.10 \
python-abi"

inherit rpm
