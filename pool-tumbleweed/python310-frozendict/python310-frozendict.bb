SUMMARY = "An immutable dictionary"
DESCRIPTION = "frozendict is an immutable wrapper around dictionaries that implements the \
complete mapping interface. It can be used as a drop-in replacement for \
dictionaries where immutability is desired."
LICENSE = "MIT"

PV = "2.3.5"

RPM_NAME = "python310-frozendict-2.3.5-2.4.aarch64.rpm"
RPM_HASH = "1af2734ec14bf75587ffea9ddd31fc4dd8dfb9af56478b80531b2a6ff1a56f7a048717181e0c9a0abe8f0006dba00cc31fc9d8c5549b69ceded9b8f54221d0d7"

RPROVIDES:${PN} += "python3-frozendict \
python3.10dist(frozendict) \
python310-frozendict \
python310-frozendict(aarch-64) \
python3dist(frozendict)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.17)(64bit) \
python(abi)"

inherit rpm
