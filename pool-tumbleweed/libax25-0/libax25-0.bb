SUMMARY = "AX.25 data link layer protocol library"
DESCRIPTION = "Libraries for AX.25. AX.25 (Amateur X.25) is a data link layer \
protocol derived from the X.25 protocol suite and designed for use by \
amateur radio operators."
LICENSE = "LGPL-2.1+"

PV = "0.0.12~rc5"

RPM_NAME = "libax25-0-0.0.12~rc5-1.9.aarch64.rpm"
RPM_HASH = "c51a2e23b1f6aad9916c11b01fd33b6a73dced15b37c19caa73d64015fa68b8a06580503200dfb73eca034c3e5aa0fc79d4e2e49230d7ee676ecf7585c54a385"

RPROVIDES:${PN} += "libax25-0 \
libax25.so.0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libax25-common \
libc.so.6"

inherit rpm
