SUMMARY = "Cairo backend for python311-matplotlib"
DESCRIPTION = "This package includes the non-interactive Cairo-based backend \
for the python311-matplotlib plotting package"
LICENSE = "SUSE-Matplotlib"

PV = "3.6.3"

RPM_NAME = "python311-matplotlib-cairo-3.6.3-3.1.aarch64.rpm"
RPM_HASH = "06a463d1635d18ab1992d023bde5ffaaa19d8b04929645edb22fbac22e27c79baea855ce5fc796eaa0c30840e966f55107cb8489c08fd6128c59b55af8323b52"

RPROVIDES:${PN} += "python3-matplotlib-cairo \
python311-matplotlib-cairo"

RDEPENDS:${PN} += "python-abi \
python311-cairo \
python311-matplotlib"

inherit rpm
