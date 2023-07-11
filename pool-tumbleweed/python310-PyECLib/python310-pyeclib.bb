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

RPM_NAME = "python310-PyECLib-1.6.1-1.9.aarch64.rpm"
RPM_HASH = "38606def4052c4fb2f09043fecb3026c5499c0b28ae0f5302f7d662bf76369821d4a489f86c7f19a7d3f3bea41972be946bc2dbe92a8f78215805bccceefdf8d"

RPROVIDES:${PN} += "python3.10dist-pyeclib \
python310-PyECLib \
python3dist-pyeclib"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
liberasurecode.so.1 \
python-abi"

inherit rpm
