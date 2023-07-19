SUMMARY = "Tk backend for python39-matplotlib"
DESCRIPTION = "This package includes the Tk-based tkagg backend \
for the python39-matplotlib plotting package"
LICENSE = "SUSE-Matplotlib"

PV = "3.6.3"

RPM_NAME = "python39-matplotlib-tk-3.6.3-3.1.aarch64.rpm"
RPM_HASH = "7779c8d5b4e19c289f4c380c7af15c4faf6c82f08f77f00e41413864a55aa637dadbeb520d503d46d642e5da93dff4d1354e8773149cc66c44859e3d50c2b05c"

RPROVIDES:${PN} += "python39-matplotlib-tk"

RDEPENDS:${PN} += "python-abi \
python39-Pillow-tk \
python39-matplotlib \
python39-tk \
tcl"

inherit rpm
