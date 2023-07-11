SUMMARY = "Simple interface for implementing erasure codes"
DESCRIPTION = "This library makes use of Jesasure for Reed-Solomon as implemented by the \
liberasurecode library and provides its' own flat XOR-based erasure code \
encoder and decoder.  Currently, it implements a specific class of HD \
Combination Codes (see 'Flat XOR-based erasure codes in storage systems: \
Constructions, efficient recovery, and tradeoffs' in IEEE MSST 2010).  These \
codes are well-suited to archival use-cases, have a simple construction and \
require a minimum number of participating disks during single-disk \
reconstruction (think XOR-based LRC code)."
LICENSE = "BSD-3-Clause"

PV = "1.6.1"

RPM_NAME = "python39-PyECLib-1.6.1-1.9.aarch64.rpm"
RPM_HASH = "f4cfd2c0e6b1800e3931d295f7577e91f608e9f83b174935cdab4b8411be63de957e1ac33e304ac63da509d9226f12979f0c60aea0f6970391e8ba12b41bb0f6"

RPROVIDES:${PN} += "python3.9dist-pyeclib \
python39-PyECLib \
python3dist-pyeclib"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
liberasurecode.so.1 \
python-abi"

inherit rpm
