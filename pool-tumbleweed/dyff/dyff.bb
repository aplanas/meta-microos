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

PV = "1.5.8"

RPM_NAME = "dyff-1.5.8-1.1.aarch64.rpm"
RPM_HASH = "58ae9c03773191da1eeba5098cb4a3c9969e276a957ebc248758eb361c4b55b56bb65326fdb5184def567f572fca1c253ba2d71fe40cbcfe06c0246dbe32cc13"

RPROVIDES:${PN} += "dyff"

RDEPENDS:${PN} += "libc.so.6"

inherit rpm
