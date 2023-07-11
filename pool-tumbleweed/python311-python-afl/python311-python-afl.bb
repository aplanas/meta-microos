SUMMARY = "American fuzzy lop fork server and instrumentation for pure-Python code"
DESCRIPTION = "python-afl is an experimental module that enables American fuzzy lop fork server and instrumentation for pure-Python code. \
 \
The scripts to run the fuzzer are only in the package for python3."
LICENSE = "MIT"

PV = "0.7.3"

RPM_NAME = "python311-python-afl-0.7.3-3.13.aarch64.rpm"
RPM_HASH = "8265a2171ab783b9adaa72c4818b85b42eefecbd1fa85071e5817b4adf2e09b3e012df9ac3fcca675e6e695cfe45a20ea56c231ae1af766caf6d0e922157b019"

RPROVIDES:${PN} += "python3-python-afl \
python3.11dist-python-afl \
python311-python-afl \
python3dist-python-afl"

RDEPENDS:${PN} += "/usr/bin/sh \
afl \
ld-linux-aarch64.so.1 \
libc.so.6 \
python-abi \
update-alternatives"

inherit rpm
