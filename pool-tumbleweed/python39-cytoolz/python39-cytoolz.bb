SUMMARY = "High performance python functional utilities in Cython"
DESCRIPTION = "Cython implementation of the toolz package, which provides high \
performance utility functions for iterables, functions, and \
dictionaries."
LICENSE = "BSD-3-Clause"

PV = "0.12.1"

RPM_NAME = "python39-cytoolz-0.12.1-1.6.aarch64.rpm"
RPM_HASH = "d350f65806e8d9c895b2a88075bba26916c5655ef5af91e344e0f32b3503ac991af2ecf77a8625425125fd51df912ceda5556695e5ab751dba62a80f98e4d5e4"

RPROVIDES:${PN} += "python3.9dist-cytoolz \
python39-cytoolz \
python3dist-cytoolz"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
python-abi \
python39-toolz"

inherit rpm
