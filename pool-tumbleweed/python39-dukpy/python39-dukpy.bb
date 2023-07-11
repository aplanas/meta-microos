SUMMARY = "JavaScript interpreter for Python"
DESCRIPTION = "DukPy is a javascript interpreter for Python built on top of \
duktape engine. \
It comes with a bunch of common transpilers built-in for convenience: \
 \
    - CoffeeScript \
    - BabelJS \
    - TypeScript \
    - JSX \
    - LESS"
LICENSE = "MIT"

PV = "0.3.0"

RPM_NAME = "python39-dukpy-0.3.0-1.7.aarch64.rpm"
RPM_HASH = "efeecfb288df11a04aadfc2966f2685cb8d99bd83c5afb820f335865dc422884655b967aefdcc47a259c02db807647bc6d1cfb111985b14c6b0183e0fb595083"

RPROVIDES:${PN} += "python3.9dist-dukpy \
python39-dukpy \
python3dist-dukpy"

RDEPENDS:${PN} += "/usr/bin/python3.9 \
/usr/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6 \
python-abi \
update-alternatives"

inherit rpm
