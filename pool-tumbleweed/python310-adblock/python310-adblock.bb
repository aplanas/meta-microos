SUMMARY = "Brave's adblock library in Python"
DESCRIPTION = "Python wrapper for Brave's adblocking library."
LICENSE = "Apache-2.0 | MIT"

PV = "0.6.0"

RPM_NAME = "python310-adblock-0.6.0-2.2.aarch64.rpm"
RPM_HASH = "2f38547d7fcdb5a3503d7b4a15347f12fde1c91e0334c0ebd9bc86b32bfb195cece7ec64f57133239845ab100dd6c0272b2cceb310f42bbe839b559f70d6ef20"

RPROVIDES:${PN} += "python3-adblock \
python3.10dist(adblock) \
python310-adblock \
python310-adblock(aarch-64) \
python3dist(adblock)"
RDEPENDS:${PN} += "libc.so.6(GLIBC_2.34)(64bit) \
libgcc_s.so.1()(64bit) \
libgcc_s.so.1(GCC_3.0)(64bit) \
libgcc_s.so.1(GCC_3.3)(64bit) \
libgcc_s.so.1(GCC_4.2.0)(64bit) \
python(abi)"

inherit rpm
