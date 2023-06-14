SUMMARY = "A JavaScript minifier written in Python"
DESCRIPTION = "rJSmin is a Javascript minifier written in Python. \
 \
The minifier is based on the semantics of jsmin.c by Douglas Crockford. \
 \
The module is a re-implementation targeting speed, so it can be used \
at runtime (rather than during a preprocessing step)."
LICENSE = "Apache-2.0"

PV = "1.2.1"

RPM_NAME = "python39-rjsmin-1.2.1-1.4.aarch64.rpm"
RPM_HASH = "1824a422d84fb664a2ac2086aed15be2b2cc2b765c9ef4f96b1aa8bd40a5253725af6d46a196adbdb5fe8633ed1926fc536b90df128f981b71852ad2ad289cb5"

RPROVIDES:${PN} += "python3.9dist-rjsmin \
python39-rjsmin \
python3dist-rjsmin"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
python-abi"

inherit rpm
