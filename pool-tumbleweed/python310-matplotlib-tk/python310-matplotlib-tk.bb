SUMMARY = "Tk backend for python310-matplotlib"
DESCRIPTION = "This package includes the Tk-based tkagg backend \
for the python310-matplotlib plotting package"
LICENSE = "SUSE-Matplotlib"

PV = "3.6.3"

RPM_NAME = "python310-matplotlib-tk-3.6.3-3.1.aarch64.rpm"
RPM_HASH = "77c7153f96c3a66c196606abee572dd1447c347c3b38917c14911769ee5434d5a8a99a610b75660b1e32862705a2d3d97e031dc37a04c45c106241e092cb0ced"

RPROVIDES:${PN} += "python310-matplotlib-tk"

RDEPENDS:${PN} += "python-abi \
python310-Pillow-tk \
python310-matplotlib \
python310-tk \
tcl"

inherit rpm
