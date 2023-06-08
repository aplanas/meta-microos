SUMMARY = "Traces all program executions occurring on a system"
DESCRIPTION = "extrace traces all program executions occurring on a system and prints the process call hierarchy in a human-readable form. \
 \
While process tracing is exact, looking up all information is inherently sensitive to race conditions. In doubt, you can only trust the PID was written correctly."
LICENSE = "GPL-2.0-only"

PV = "0.9"

RPM_NAME = "extrace-0.9-1.2.aarch64.rpm"
RPM_HASH = "a20b53f2e89a1747f5a450b273100faafc91445d40a299e015d39917a45814b03806697d01aad2738845e8ccac90692924f326735f0d2b747806d8c78f6bfca2"

RPROVIDES:${PN} += "extrace extrace(aarch-64)"
RDEPENDS:${PN} += "libc.so.6(GLIBC_2.34)(64bit)"

inherit rpm
