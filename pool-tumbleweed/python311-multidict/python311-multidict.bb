SUMMARY = "Multidict implementation"
DESCRIPTION = "Multidicts are useful for working with HTTP headers, URL query \
arguments, etc. \
 \
The code was extracted from the aiohttp library."
LICENSE = "Apache-2.0"

PV = "6.0.4"

RPM_NAME = "python311-multidict-6.0.4-2.3.aarch64.rpm"
RPM_HASH = "9c89502d4b121bc1e9c73ce4d318799dc38001999312d7da2a14942050d90bb73989bb2e516afa8356afa9110cc46f021a9360d06d39416905189b3c0e376bab"

RPROVIDES:${PN} += "python3-multidict \
python3.11dist-multidict \
python311-multidict \
python3dist-multidict"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
python-abi"

inherit rpm
