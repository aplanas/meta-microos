SUMMARY = "Realtime Blacklist (RBL) service library"
DESCRIPTION = "This package provides librbl which is an interface \
to a facility to conduct Realtime Blacklist (RBL) \
queries and return their results.  RBLs are described in RFC5782."
LICENSE = "BSD-3-Clause"

PV = "2.11.0"

RPM_NAME = "librbl1-2.11.0-7.16.aarch64.rpm"
RPM_HASH = "132a38e18de663567d60f922f22074e67aad40b0e2d9222c313902de9fec15d6d89a031245ab22badf64bbe7846e0b5fda5663fcd3497476af805061475671fc"

RPROVIDES:${PN} += "librbl.so.1 \
librbl1"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm
