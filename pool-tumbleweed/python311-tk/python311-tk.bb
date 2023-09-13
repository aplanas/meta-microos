SUMMARY = "TkInter, a Python Tk Interface"
DESCRIPTION = "Python interface to Tk. Tk is the GUI toolkit that comes with Tcl."
LICENSE = "Python-2.0"

PV = "3.11.5"

RPM_NAME = "python311-tk-3.11.5-1.1.aarch64.rpm"
RPM_HASH = "d0778888de84de239e165470875078a7b9182c957f09802029fe29383bb150132cabb511756c9586893d44541c4709f4dec9c9961bc0defbe36c89285467712f"

RPROVIDES:${PN} += "python3-tk \
python311-tk"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libtcl8.6.so \
libtk8.6.so \
python-abi \
python311"

inherit rpm
