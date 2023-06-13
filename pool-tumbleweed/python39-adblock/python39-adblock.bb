SUMMARY = "Brave's adblock library in Python"
DESCRIPTION = "Python wrapper for Brave's adblocking library."
LICENSE = "Apache-2.0 | MIT"

PV = "0.6.0"

RPM_NAME = "python39-adblock-0.6.0-2.2.aarch64.rpm"
RPM_HASH = "f43f07a12c3109bb77001606e39bb474fdddbe323d9841cd30464413cb62456c78bd6101e833f280ea5e36385abfaa96c2a196ab999a15368b0dd46a7f4d854f"

RPROVIDES:${PN} += "python3.9dist(adblock) \
python39-adblock \
python39-adblock(aarch-64) \
python3dist(adblock)"

RDEPENDS:${PN} += "libc.so.6(GLIBC_2.34)(64bit) \
libgcc_s.so.1()(64bit) \
libgcc_s.so.1(GCC_3.0)(64bit) \
libgcc_s.so.1(GCC_3.3)(64bit) \
libgcc_s.so.1(GCC_4.2.0)(64bit) \
python(abi)"

inherit rpm
