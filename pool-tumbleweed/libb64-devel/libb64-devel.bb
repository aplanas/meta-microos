SUMMARY = "A library for working with base64 encoding/decoding"
DESCRIPTION = "libb64 is a library of ANSI C routines for fast encoding/decoding data into and \
from a base64-encoded format. C++ wrappers are included, as well as the source \
code for standalone encoding and decoding executables."
LICENSE = "SUSE-Public-Domain"

PV = "1.2.1"

RPM_NAME = "libb64-devel-1.2.1-3.13.aarch64.rpm"
RPM_HASH = "02fd87b294dbcd0901e4dc6da2cd0f0bd9712f229f85ff3be249f5dc0b0d412f7224a0d9595183a900b0f42a257926bf9379eabd929a00fb0781ca2d633fecac"

RPROVIDES:${PN} += "libb64-devel"

RDEPENDS:${PN} += "libb64-0"

inherit rpm
