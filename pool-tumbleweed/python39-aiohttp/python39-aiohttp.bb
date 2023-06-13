SUMMARY = "Asynchronous HTTP client/server framework"
DESCRIPTION = "Asynchronous HTTP client/server framework for Python. \
 \
- Supports both the client and server side of HTTP protocol. \
- Supports both client and server WebSockets out-of-the-box. \
- Web-server has middleware and pluggable routing."
LICENSE = "Apache-2.0"

PV = "3.8.4"

RPM_NAME = "python39-aiohttp-3.8.4-1.1.aarch64.rpm"
RPM_HASH = "5d4d965351569d6e38280f36db9faf854693349aefc3d76cbfefec03e57de1e9cbaaf23748834f2bf2166099bc3be6cb9aee632daf461a032e0671380c22ed68"

RPROVIDES:${PN} += "python3.9dist(aiohttp) \
python39-aiohttp \
python39-aiohttp(aarch-64) \
python3dist(aiohttp)"

RDEPENDS:${PN} += "(python39-async_timeout >= 4.0 with python39-async_timeout < 5) \
(python39-asynctest = 0.13.0 if python39-base < 3.8) \
(python39-charset-normalizer >= 2.0 with python39-charset-normalizer < 4) \
(python39-idna_ssl >= 1.0 if python39-base < 3.7) \
(python39-multidict >= 4.5 with python39-multidict < 7) \
(python39-typing_extensions >= 3.7.4 if python39-base < 3.8) \
(python39-yarl >= 1.0 with python39-yarl < 2) \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.17)(64bit) \
python(abi) \
python39-aiosignal \
python39-attrs \
python39-frozenlist"

inherit rpm
