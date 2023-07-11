SUMMARY = "American fuzzy lop fork server and instrumentation for pure-Python code"
DESCRIPTION = "python-afl is an experimental module that enables American fuzzy lop fork server and instrumentation for pure-Python code. \
 \
The scripts to run the fuzzer are only in the package for python3."
LICENSE = "MIT"

PV = "0.7.3"

RPM_NAME = "python310-python-afl-0.7.3-3.13.aarch64.rpm"
RPM_HASH = "aa7f725b7b2a7b4e176839d1c01586285b535a3a175a5576a5919e8834d5dafdcb75a0149feefcdb57399c42fee8a05c05e012bdd3bbee299540e137421964c7"

RPROVIDES:${PN} += "python3.10dist-python-afl \
python310-python-afl \
python3dist-python-afl"

RDEPENDS:${PN} += "/usr/bin/sh \
afl \
ld-linux-aarch64.so.1 \
libc.so.6 \
python-abi \
update-alternatives"

inherit rpm
