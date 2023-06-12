SUMMARY = "Python Bindings for YARA (from Virus Total)"
DESCRIPTION = "python bindings for libyara. \
YARA is a tool to identify and classify malware samples."
LICENSE = "Apache-2.0"

PV = "4.0.2"

RPM_NAME = "python310-yara-4.0.2-1.18.aarch64.rpm"
RPM_HASH = "7c9214fee4060734c471474ef66fd84fe3db119a0a15bad2d1a83b723cbbb2582534ea54a5bbfbf2339fbec39614beba86147aad9c00ce55dc73745812b01cba"

RPROVIDES:${PN} += "python3-yara \
python3.10dist(yara-python) \
python310-yara \
python310-yara(aarch-64) \
python3dist(yara-python)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.17)(64bit) \
libyara.so.10()(64bit) \
python(abi)"

inherit rpm
