SUMMARY = "A library for working with base64 encoding/decoding"
DESCRIPTION = "libb64 is a library of ANSI C routines for fast encoding/decoding data into and \
from a base64-encoded format. C++ wrappers are included, as well as the source \
code for standalone encoding and decoding executables."
LICENSE = "SUSE-Public-Domain"

PV = "1.2.1"

RPM_NAME = "libb64-0-1.2.1-3.13.aarch64.rpm"
RPM_HASH = "dd1f2e6e9447c3d993ec39c1a59912f1de0e1661c7481aa07035059345bc0cd2b0872dba84502128e3c9fe3432b5a206545aa8a795c584a7e4d664272cd66f61"

RPROVIDES:${PN} += "libb64-0 \
libb64.so.0"

RDEPENDS:${PN} += "/sbin/ldconfig"

inherit rpm
