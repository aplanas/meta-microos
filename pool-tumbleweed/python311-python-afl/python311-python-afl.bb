SUMMARY = "American fuzzy lop fork server and instrumentation for pure-Python code"
DESCRIPTION = "python-afl is an experimental module that enables American fuzzy lop fork server and instrumentation for pure-Python code. \
 \
The scripts to run the fuzzer are only in the package for python3."
LICENSE = "MIT"

PV = "0.7.3"

RPM_NAME = "python311-python-afl-0.7.3-3.11.aarch64.rpm"
RPM_HASH = "bcd8d8c10bb661fdce9b21a25090448908ffb34d91aca6d80d4803604c6db3e701916425995cc9ba7fbe2cb7d8b32eee2079cc1ee39978fff3e34fc1724ca928"

RPROVIDES:${PN} += "python3.11dist-python-afl \
python311-python-afl \
python3dist-python-afl"

RDEPENDS:${PN} += "/usr/bin/sh \
afl \
ld-linux-aarch64.so.1 \
libc.so.6 \
python-abi \
update-alternatives"

inherit rpm
