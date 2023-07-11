SUMMARY = "Multidict implementation"
DESCRIPTION = "Multidicts are useful for working with HTTP headers, URL query \
arguments, etc. \
 \
The code was extracted from the aiohttp library."
LICENSE = "Apache-2.0"

PV = "6.0.4"

RPM_NAME = "python310-multidict-6.0.4-2.3.aarch64.rpm"
RPM_HASH = "53475e3d6fd144bc0502c137dd761997512f42b835c8aca0bf30c4cc33a770960da51f9092e55d0050720c1f3a51758c2ca95f95f90ee523a0a090f353eb9564"

RPROVIDES:${PN} += "python3.10dist-multidict \
python310-multidict \
python3dist-multidict"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
python-abi"

inherit rpm
