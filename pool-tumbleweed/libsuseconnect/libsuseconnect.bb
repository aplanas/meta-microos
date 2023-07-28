SUMMARY = "C interface to suseconnect-ng"
DESCRIPTION = "This package contains library which provides C interface to selected \
suseconnect-ng functions."
LICENSE = "LGPL-2.1-or-later"

PV = "1.2.0~git0.abd0fec"

RPM_NAME = "libsuseconnect-1.2.0~git0.abd0fec-1.1.aarch64.rpm"
RPM_HASH = "cc6c2cb3c5b209fd8455c2a5056653a9db08381433b132c8a2114cbb93693b37a76f1adfa3de836c3e93de760a24e5b06e38e7173627b0755e79675304869bf3"

RPROVIDES:${PN} += "libsuseconnect"

RDEPENDS:${PN} += "suseconnect-ng"

inherit rpm
