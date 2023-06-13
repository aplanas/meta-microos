SUMMARY = "American fuzzy lop fork server and instrumentation for pure-Python code"
DESCRIPTION = "python-afl is an experimental module that enables American fuzzy lop fork server and instrumentation for pure-Python code. \
 \
The scripts to run the fuzzer are only in the package for python3."
LICENSE = "MIT"

PV = "0.7.3"

RPM_NAME = "python310-python-afl-0.7.3-3.11.aarch64.rpm"
RPM_HASH = "77df376ebc4adf1cb8fe92131295cef7ec255231d420be636bacae79aa1d9cdcd22a98d04aeb6dba5d7797e8274ea3a18aebbd0cf2aba37eb5186ebd2fa0d72e"

RPROVIDES:${PN} += "python3-python-afl \
python3-python_afl \
python3.10dist(python-afl) \
python310-python-afl \
python310-python-afl(aarch-64) \
python310-python_afl \
python3dist(python-afl)"

RDEPENDS:${PN} += "/bin/sh \
afl \
ld-linux-aarch64.so.1()(64bit) \
libc.so.6()(64bit) \
python(abi) \
update-alternatives"

inherit rpm
