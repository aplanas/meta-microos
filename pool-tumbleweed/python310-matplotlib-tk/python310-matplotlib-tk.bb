SUMMARY = "Tk backend for python310-matplotlib"
DESCRIPTION = "This package includes the Tk-based tkagg backend \
for the python310-matplotlib plotting package"
LICENSE = "SUSE-Matplotlib"

PV = "3.6.3"

RPM_NAME = "python310-matplotlib-tk-3.6.3-2.1.aarch64.rpm"
RPM_HASH = "672c741be97831b87eb66a4f6781f6b431da9e5b0e75bf8eb31c89a64177177480600b47b8ccf9f82b08378cbe14ac5b12775588fde41fc523aa00fdfe13fde7"

RPROVIDES:${PN} += "python3-matplotlib-tk \
python310-matplotlib-tk \
python310-matplotlib-tk(aarch-64)"

RDEPENDS:${PN} += "python(abi) \
python310-Pillow-tk \
python310-matplotlib \
python310-tk \
tcl"

inherit rpm
