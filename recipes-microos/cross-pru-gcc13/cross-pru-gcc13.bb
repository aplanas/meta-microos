SUMMARY = "The GNU Compiler Collection targeting pru"
DESCRIPTION = "The GNU Compiler Collection as a cross-compiler targeting pru."
LICENSE = "GPL-3.0-or-later"

PV = "13.0.1+git7231"

RPM_NAME = "cross-pru-gcc13-13.0.1+git7231-1.1.aarch64.rpm"
RPM_HASH = "27a0f63feb15ae6a706d0e104be122c2b1f89a7f939e76de38604676a106ace50a8b0a6d5e9b6fa151a6c303f2e44efe2f51cce9fab3313f385fd278fa5e7cfb"

RPROVIDES:${PN} += "cross-pru-gcc13 cross-pru-gcc13(aarch-64) pru-gcc"
RDEPENDS:${PN} += "/bin/sh cross-pru-binutils libstdc++6-devel-gcc13 update-alternatives"

inherit rpm
