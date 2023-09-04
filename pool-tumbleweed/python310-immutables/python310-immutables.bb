SUMMARY = "Immutable collections for Python"
DESCRIPTION = "Immutable collections for Python."
LICENSE = "Apache-2.0"

PV = "0.19"

RPM_NAME = "python310-immutables-0.19-4.1.aarch64.rpm"
RPM_HASH = "286fe3a3e7f294f99a0edcf7c35710545bd6c7f1c93c806f3e840cf4dee9d19634eb78c422e0b301935647c6bd0c57a36d07cf1a7297947706f9bae158f889ec"

RPROVIDES:${PN} += "python3.10dist-immutables \
python310-immutables \
python3dist-immutables"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
python-abi"

inherit rpm
