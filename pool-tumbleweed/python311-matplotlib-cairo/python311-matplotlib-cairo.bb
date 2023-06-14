SUMMARY = "Cairo backend for python311-matplotlib"
DESCRIPTION = "This package includes the non-interactive Cairo-based backend \
for the python311-matplotlib plotting package"
LICENSE = "SUSE-Matplotlib"

PV = "3.6.3"

RPM_NAME = "python311-matplotlib-cairo-3.6.3-2.1.aarch64.rpm"
RPM_HASH = "6bcf2a6a358d34749c78ece116fdf86e24e5a4ee873ce41d922ed1381e7e9f4ed62b5e0896826375184a380b7e40e5b47a47556c6111adb0d5fe7b6efe0639ef"

RPROVIDES:${PN} += "python311-matplotlib-cairo"

RDEPENDS:${PN} += "python-abi \
python311-cairo \
python311-matplotlib"

inherit rpm
