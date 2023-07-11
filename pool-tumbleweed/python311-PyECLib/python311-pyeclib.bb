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

RPM_NAME = "python311-PyECLib-1.6.1-1.9.aarch64.rpm"
RPM_HASH = "683e2ef0412a2102a455e79349c113fd3ae17d29dd6b6a5e1a8cce4cef306d7585fa886a1773001f48d7fea378809f52708e9f3460b070fee8faea3dad5ee5d5"

RPROVIDES:${PN} += "python3-PyECLib \
python3.11dist-pyeclib \
python311-PyECLib \
python3dist-pyeclib"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
liberasurecode.so.1 \
python-abi"

inherit rpm
