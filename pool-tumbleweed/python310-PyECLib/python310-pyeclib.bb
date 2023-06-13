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

RPM_NAME = "python310-PyECLib-1.6.1-1.7.aarch64.rpm"
RPM_HASH = "5d76b2ae61edc94de27c44f5fdbdd7f3661f519b041bf07721aa29561677a8af9778532139098436eb6f90e7c544f9562524b8a9690b84eaa9e715694b8af897"

RPROVIDES:${PN} += "python3-PyECLib \
python3.10dist(pyeclib) \
python310-PyECLib \
python310-PyECLib(aarch-64) \
python3dist(pyeclib)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
liberasurecode.so.1()(64bit) \
python(abi)"

inherit rpm
