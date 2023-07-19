SUMMARY = "Tk backend for python311-matplotlib"
DESCRIPTION = "This package includes the Tk-based tkagg backend \
for the python311-matplotlib plotting package"
LICENSE = "SUSE-Matplotlib"

PV = "3.6.3"

RPM_NAME = "python311-matplotlib-tk-3.6.3-3.1.aarch64.rpm"
RPM_HASH = "e8552cc64ca40804e90bdecb8b9571678e3e40af3861cc8d1993179b86d31936ddec2f3f25c47396d7f60ee816dc863aac630562e5ce62ab88e3da459ad969da"

RPROVIDES:${PN} += "python3-matplotlib-tk \
python311-matplotlib-tk"

RDEPENDS:${PN} += "python-abi \
python311-Pillow-tk \
python311-matplotlib \
python311-tk \
tcl"

inherit rpm
