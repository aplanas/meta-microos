SUMMARY = "Tk backend for python310-matplotlib"
DESCRIPTION = "This package includes the Tk-based tkagg backend \
for the python310-matplotlib plotting package"
LICENSE = "SUSE-Matplotlib"

PV = "3.6.3"

RPM_NAME = "python310-matplotlib-tk-3.6.3-2.3.aarch64.rpm"
RPM_HASH = "d2dc54872e9481bca9c0d3b8bc524c9492e706ae00c6fec8bdee3fd7a0c8f606ab555b7f007ec20e954781b348f4080ad901d73ea1abc3b1f6bc76a0580069d5"

RPROVIDES:${PN} += "python310-matplotlib-tk"

RDEPENDS:${PN} += "python-abi \
python310-Pillow-tk \
python310-matplotlib \
python310-tk \
tcl"

inherit rpm
