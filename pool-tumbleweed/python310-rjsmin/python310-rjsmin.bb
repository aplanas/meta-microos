SUMMARY = "A JavaScript minifier written in Python"
DESCRIPTION = "rJSmin is a Javascript minifier written in Python. \
 \
The minifier is based on the semantics of jsmin.c by Douglas Crockford. \
 \
The module is a re-implementation targeting speed, so it can be used \
at runtime (rather than during a preprocessing step)."
LICENSE = "Apache-2.0"

PV = "1.2.1"

RPM_NAME = "python310-rjsmin-1.2.1-1.4.aarch64.rpm"
RPM_HASH = "2fb85caaaee9ae3434f087d4d2310ce0c0eaa4f7ff6be3486706038b424931af159a87705e06a99f21881c514b48aad172ac2a9bf15784711490be9bae9dc826"

RPROVIDES:${PN} += "python3-rjsmin \
python3.10dist-rjsmin \
python310-rjsmin \
python3dist-rjsmin"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
python-abi"

inherit rpm
