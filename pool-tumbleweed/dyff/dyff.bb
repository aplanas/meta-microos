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

RPM_NAME = "dyff-1.5.7-1.2.aarch64.rpm"
RPM_HASH = "4c8a474165b837ac07a6d2c260f3fcb3fc823cc6dc01a1b2dd4f224a3a7a340d1fad813d5538454787a5d91b37f59bfbd06629b0f7b2d9430d3b7bfb2a775fc6"

RPROVIDES:${PN} += "dyff"

RDEPENDS:${PN} += "libc.so.6"

inherit rpm
