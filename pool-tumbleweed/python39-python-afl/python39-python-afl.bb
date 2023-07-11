SUMMARY = "American fuzzy lop fork server and instrumentation for pure-Python code"
DESCRIPTION = "python-afl is an experimental module that enables American fuzzy lop fork server and instrumentation for pure-Python code. \
 \
The scripts to run the fuzzer are only in the package for python3."
LICENSE = "MIT"

PV = "0.7.3"

RPM_NAME = "python39-python-afl-0.7.3-3.13.aarch64.rpm"
RPM_HASH = "400a786b8844d71cac61d414d3a48ec016eb0cc3a091fa95b5a4b046b378a3912916ab100b6c99869e7052faa5dd20ca05484db18b0e80d8612b81801550bfff"

RPROVIDES:${PN} += "python3.9dist-python-afl \
python39-python-afl \
python3dist-python-afl"

RDEPENDS:${PN} += "/usr/bin/sh \
afl \
ld-linux-aarch64.so.1 \
libc.so.6 \
python-abi \
update-alternatives"

inherit rpm
