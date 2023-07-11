SUMMARY = "Python Bindings for YARA (from Virus Total)"
DESCRIPTION = "python bindings for libyara. \
YARA is a tool to identify and classify malware samples."
LICENSE = "Apache-2.0"

PV = "4.0.2"

RPM_NAME = "python39-yara-4.0.2-1.20.aarch64.rpm"
RPM_HASH = "b3ff3cd19f212df127bfb63085f53ae712e21f45f02759f34634f7a6c54ff7c52f7a3f76f4d0ebd982003b24e070ce100ae6351990b437068b55992c9c96fafd"

RPROVIDES:${PN} += "python3.9dist-yara-python \
python39-yara \
python3dist-yara-python"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libyara.so.10 \
python-abi"

inherit rpm
