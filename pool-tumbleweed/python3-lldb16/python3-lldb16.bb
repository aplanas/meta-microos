SUMMARY = "Python bindings for liblldb"
DESCRIPTION = "This package contains the Python bindings for LLDB. It also contains \
pretty printers for the C++ standard library."
LICENSE = "Apache-2.0-with-LLVM-exception & NCSA"

PV = "16.0.6"

RPM_NAME = "python3-lldb16-16.0.6-1.1.aarch64.rpm"
RPM_HASH = "1317955bbf7fb0cd10e23a71d634d6cd82a3d832c783cf655eb2639fdaa422c0e236364eaef3741371e0a07274d6c142bde92150868f4839c1e5a28d2c2201f6"

RPROVIDES:${PN} += "/usr/lib64/python3.11/site-packages/lldb/ \
python3-lldb16"

RDEPENDS:${PN} += "liblldb16 \
python-abi \
python3-base \
python3-six"

inherit rpm
