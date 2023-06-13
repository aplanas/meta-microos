SUMMARY = "Python bindings for espeak"
DESCRIPTION = "Python bindings for the eSpeak speech synthesizer."
LICENSE = "GPL-3.0-or-later"

PV = "0.5"

RPM_NAME = "python310-espeak-0.5-5.24.aarch64.rpm"
RPM_HASH = "bb918d60fcd9c8b6fff9d55046fe4816cbc62b19e11c602d56d79f80ee66287c1fdb721e0434f15c0e81a720bd2bcae29512a16f86ba29e622a64e487fdf6f2e"

RPROVIDES:${PN} += "python3-espeak \
python3.10dist(python-espeak) \
python310-espeak \
python310-espeak(aarch-64) \
python3dist(python-espeak)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
libc.so.6()(64bit) \
libespeak.so.1()(64bit) \
python(abi)"

inherit rpm
