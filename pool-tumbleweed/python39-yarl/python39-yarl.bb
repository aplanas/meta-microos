SUMMARY = "Yet another URL library"
DESCRIPTION = "The module provides a URL class for url parsing and changing."
LICENSE = "Apache-2.0"

PV = "1.9.2"

RPM_NAME = "python39-yarl-1.9.2-2.1.aarch64.rpm"
RPM_HASH = "13f0aa4132f004534ec9e54580a96b4c90ba96b78937843a4e490b213f15f345147c0d2aa5d7876fe83291cd3b9d18e94a1b9b90840b82762a3ed1c6d92c0227"

RPROVIDES:${PN} += "python3.9dist-yarl \
python39-yarl \
python3dist-yarl"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
python-abi \
python39-idna \
python39-multidict"

inherit rpm
