SUMMARY = "Python unicodedata backport/updates"
DESCRIPTION = "Unicodedata backport and updates for the latest unicode version. \
The versions of this package match Unicode versions, so \
unicodedata2==15.0.0 is data from Unicode 15.0.0."
LICENSE = "Apache-2.0 & Python-2.0"

PV = "15.0.0"

RPM_NAME = "python39-unicodedata2-15.0.0-1.4.aarch64.rpm"
RPM_HASH = "96b8069274f34a5a830f36d2c9247b2b3639c5d6affdaa1bbe1c968e6aa96be06bf7552410a3e339f2346d7c97a227a00191ac449969d629261d0972e5155b24"

RPROVIDES:${PN} += "python3.9dist(unicodedata2) \
python39-unicodedata2 \
python39-unicodedata2(aarch-64) \
python3dist(unicodedata2)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.17)(64bit) \
python(abi)"

inherit rpm
