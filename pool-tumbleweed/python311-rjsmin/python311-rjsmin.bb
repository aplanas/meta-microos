SUMMARY = "A JavaScript minifier written in Python"
DESCRIPTION = "rJSmin is a Javascript minifier written in Python. \
 \
The minifier is based on the semantics of jsmin.c by Douglas Crockford. \
 \
The module is a re-implementation targeting speed, so it can be used \
at runtime (rather than during a preprocessing step)."
LICENSE = "Apache-2.0"

PV = "1.2.1"

RPM_NAME = "python311-rjsmin-1.2.1-1.4.aarch64.rpm"
RPM_HASH = "1b30dce4a411d70a8febddb3e016600884f8041e6f4a9999d2f89c6fe67c304007133132411630ae064a814df3d4e8a3a6eed86f5770ab8d12f3a6db603a6b04"

RPROVIDES:${PN} += "python3.11dist(rjsmin) \
python311-rjsmin \
python311-rjsmin(aarch-64) \
python3dist(rjsmin)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.17)(64bit) \
python(abi)"

inherit rpm
