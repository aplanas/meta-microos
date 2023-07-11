SUMMARY = "Tk backend for python39-matplotlib"
DESCRIPTION = "This package includes the Tk-based tkagg backend \
for the python39-matplotlib plotting package"
LICENSE = "SUSE-Matplotlib"

PV = "3.6.3"

RPM_NAME = "python39-matplotlib-tk-3.6.3-2.3.aarch64.rpm"
RPM_HASH = "9d5e378d014404354f61f00b414b2c0f97659f97af2ef0585613bf06c157e3cdc919d7e3f56455034610b037e1cfec55222512f55ff252a2695345ce7efdbb3e"

RPROVIDES:${PN} += "python39-matplotlib-tk"

RDEPENDS:${PN} += "python-abi \
python39-Pillow-tk \
python39-matplotlib \
python39-tk \
tcl"

inherit rpm
