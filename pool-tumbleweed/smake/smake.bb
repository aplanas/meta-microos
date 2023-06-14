SUMMARY = "The Schily 'make' program"
DESCRIPTION = "Smake executes command sequences based on relations of modification \
dates of files. The command sequences are taken from a set of rules \
found in a makefile or in the set of implicit rules. The argument \
target is typically a program that is to be built from the known \
rules."
LICENSE = "CDDL-1.0"

PV = "2022.10.16"

RPM_NAME = "smake-2022.10.16-47.3.aarch64.rpm"
RPM_HASH = "9237d92ef4ae3ea6a8f1df139dddca5ee762b92c36c326b6dc7b17c7f2eb21153cdcb8c7b641ea018e010b246f6019cf67cf5cea6da2eea1b5ad7777f5674a95"

RPROVIDES:${PN} += "smake"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libschily.so.2.0"

inherit rpm
