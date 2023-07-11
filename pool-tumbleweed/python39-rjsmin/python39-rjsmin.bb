SUMMARY = "A JavaScript minifier written in Python"
DESCRIPTION = "rJSmin is a Javascript minifier written in Python. \
 \
The minifier is based on the semantics of jsmin.c by Douglas Crockford. \
 \
The module is a re-implementation targeting speed, so it can be used \
at runtime (rather than during a preprocessing step)."
LICENSE = "Apache-2.0"

PV = "1.2.1"

RPM_NAME = "python39-rjsmin-1.2.1-2.1.aarch64.rpm"
RPM_HASH = "d38e0ed9e7425376ad7e6d3d4ef2f2c361acdc7e548f55839b2f946b73d0b9b5d0a11bc46c1c1c4fb7a4703f84297129056e2437726fc62484936638b10d73e2"

RPROVIDES:${PN} += "python3.9dist-rjsmin \
python39-rjsmin \
python3dist-rjsmin"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
python-abi"

inherit rpm
