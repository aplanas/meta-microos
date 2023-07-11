SUMMARY = "The Schily 'make' program"
DESCRIPTION = "Smake executes command sequences based on relations of modification \
dates of files. The command sequences are taken from a set of rules \
found in a makefile or in the set of implicit rules. The argument \
target is typically a program that is to be built from the known \
rules."
LICENSE = "CDDL-1.0"

PV = "2022.10.16"

RPM_NAME = "smake-2022.10.16-47.4.aarch64.rpm"
RPM_HASH = "6957c13579af86bc516e88501c956bb576407b0a8c789ffb1925f1a8e0e7ce7b5c33cfa9ba7fe6839a2cb6fb3aa437610488c9ea69352e015433ef376fcbaca5"

RPROVIDES:${PN} += "smake"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libschily.so.2.0"

inherit rpm
