SUMMARY = "A process utilities module for Python"
DESCRIPTION = "A graphical interface that lets you easily analyze and introspect unaltered running Python processes."
LICENSE = "BSD-3-Clause"

PV = "5.9.5"

RPM_NAME = "python39-psutil-5.9.5-1.3.aarch64.rpm"
RPM_HASH = "ddf1a669241646041d0bd2973d2da3f0e92fb58823b9f003c536797303976e16a85076495ecbd5b08e85528e3aff6ec891345c762a6e38d0e969429c5ad48e4b"

RPROVIDES:${PN} += "python3.9dist-psutil \
python39-psutil \
python3dist-psutil"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
procps \
python-abi"

inherit rpm
