SUMMARY = "Python bindings to Rust's persistent data structures (rpds)"
DESCRIPTION = "Python bindings to Rust's persistent data structures (rpds)"
LICENSE = "MIT"

PV = "0.7.1"

RPM_NAME = "python39-rpds-py-0.7.1-2.2.aarch64.rpm"
RPM_HASH = "7f427615d681555261dd4f3a10fcef2adcfc0d58a5295af4c8239a5a6caa65b6d8ea581da47f895d383d41124212b43a78106cf598664a60733edf45e43d8ed5"

RPROVIDES:${PN} += "python3.9dist-rpds-py \
python39-rpds-py \
python3dist-rpds-py"

RDEPENDS:${PN} += "libc.so.6 \
libgcc-s.so.1 \
python-abi"

inherit rpm
