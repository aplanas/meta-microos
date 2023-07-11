SUMMARY = "A JavaScript minifier written in Python"
DESCRIPTION = "rJSmin is a Javascript minifier written in Python. \
 \
The minifier is based on the semantics of jsmin.c by Douglas Crockford. \
 \
The module is a re-implementation targeting speed, so it can be used \
at runtime (rather than during a preprocessing step)."
LICENSE = "Apache-2.0"

PV = "1.2.1"

RPM_NAME = "python310-rjsmin-1.2.1-2.1.aarch64.rpm"
RPM_HASH = "57f267933401f0fb8f93d23f383765fb7da362222bde3e113dd17fe83203a35dc95757808b155c5e5a0a7a3a7a96ea8f839f4bd9b09dcebccda99ac94c88f64e"

RPROVIDES:${PN} += "python3.10dist-rjsmin \
python310-rjsmin \
python3dist-rjsmin"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
python-abi"

inherit rpm
