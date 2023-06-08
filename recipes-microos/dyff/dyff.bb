SUMMARY = "Diff tool for YAML files, and sometimes JSON"
DESCRIPTION = "A diff tool for YAML files, and sometimes JSON. \
 \
dyff is inspired by the way the old BOSH v1 deployment output reported changes from one version to another by only showing the parts of a YAML file that change. \
 \
Each difference is referenced by its location in the YAML document by using either the Spruce dot-style syntax (some.path.in.the.file) or go-patch path syntax (/some/name=path/in/the/id=file). The output report aims to be as compact as possible to give a clear and simple overview of the change. \
 \
Similar to the standard diff tool, it follows the principle of describing the change by going from the from input file to the target to input file. \
 \
Input files can be local files (filesystem path), remote files (URI), or the standard input stream (using -). \
 \
All orders of keys in hashes are preserved during processing and output to the terminal, most notably in the sub-commands to convert YAML to JSON and vice versa."
LICENSE = "MIT"

PV = "1.5.7"

RPM_NAME = "dyff-1.5.7-1.1.aarch64.rpm"
RPM_HASH = "f5bc01a93c2671c3b38bb0e3eb61fbc9116323bdba05c5ba9968dfa1204bac80032254223a2f8672d1718ba3629b32bd6f7630731391958457119a1f1027b63e"

RPROVIDES:${PN} += "dyff dyff(aarch-64)"
RDEPENDS:${PN} += "libc.so.6(GLIBC_2.34)(64bit)"

inherit rpm
