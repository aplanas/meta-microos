SUMMARY = "Tk backend for python311-matplotlib"
DESCRIPTION = "This package includes the Tk-based tkagg backend \
for the python311-matplotlib plotting package"
LICENSE = "SUSE-Matplotlib"

PV = "3.6.3"

RPM_NAME = "python311-matplotlib-tk-3.6.3-2.1.aarch64.rpm"
RPM_HASH = "448a29d56fc08d32273e35acb9c8216bbe0475efe9919cefbba3e69f365f7673662015981beaa8aa407565efad788918587b5fc55c94038daf03b754e417a311"

RPROVIDES:${PN} += "python311-matplotlib-tk"

RDEPENDS:${PN} += "python-abi \
python311-Pillow-tk \
python311-matplotlib \
python311-tk \
tcl"

inherit rpm
