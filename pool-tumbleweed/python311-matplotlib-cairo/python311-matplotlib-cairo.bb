SUMMARY = "Cairo backend for python311-matplotlib"
DESCRIPTION = "This package includes the non-interactive Cairo-based backend \
for the python311-matplotlib plotting package"
LICENSE = "SUSE-Matplotlib"

PV = "3.6.3"

RPM_NAME = "python311-matplotlib-cairo-3.6.3-2.3.aarch64.rpm"
RPM_HASH = "261fa5c2d644845ad433788cfc0c601aaa9c6868e210be0e446a75934d9553c4478149d035247278082aa6191a0ca34ddb0eb9931c54ca2652b9108bcb4d1941"

RPROVIDES:${PN} += "python3-matplotlib-cairo \
python311-matplotlib-cairo"

RDEPENDS:${PN} += "python-abi \
python311-cairo \
python311-matplotlib"

inherit rpm
