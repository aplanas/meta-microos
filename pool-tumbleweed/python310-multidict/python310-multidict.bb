SUMMARY = "Multidict implementation"
DESCRIPTION = "Multidicts are useful for working with HTTP headers, URL query \
arguments, etc. \
 \
The code was extracted from the aiohttp library."
LICENSE = "Apache-2.0"

PV = "6.0.4"

RPM_NAME = "python310-multidict-6.0.4-2.1.aarch64.rpm"
RPM_HASH = "c36db652956d5bebb7f7191ef40b42e1718e41a4778fcd3f9e231407ab662f76c6d4ac71a702f14d288231d2cd41a0201c40203ae1a8ef10694f21afe564953f"

RPROVIDES:${PN} += "python3-multidict \
python3.10dist-multidict \
python310-multidict \
python3dist-multidict"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
python-abi"

inherit rpm
