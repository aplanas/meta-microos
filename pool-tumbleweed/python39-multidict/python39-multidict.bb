SUMMARY = "Multidict implementation"
DESCRIPTION = "Multidicts are useful for working with HTTP headers, URL query \
arguments, etc. \
 \
The code was extracted from the aiohttp library."
LICENSE = "Apache-2.0"

PV = "6.0.4"

RPM_NAME = "python39-multidict-6.0.4-2.3.aarch64.rpm"
RPM_HASH = "e7d5b1fc2feeaa281538e447cd5ec58a0995003310ce687a0b249bfdc2aff469f9b0eea73bd48f30218270c8cf7b83dd3ff9fe9e965af24c75913a5390842c10"

RPROVIDES:${PN} += "python3.9dist-multidict \
python39-multidict \
python3dist-multidict"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
python-abi"

inherit rpm
