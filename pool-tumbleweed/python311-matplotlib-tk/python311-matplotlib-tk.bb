SUMMARY = "Tk backend for python311-matplotlib"
DESCRIPTION = "This package includes the Tk-based tkagg backend \
for the python311-matplotlib plotting package"
LICENSE = "SUSE-Matplotlib"

PV = "3.6.3"

RPM_NAME = "python311-matplotlib-tk-3.6.3-2.3.aarch64.rpm"
RPM_HASH = "73b5615e33432d3073643ef9af1b9f3f257cc60c12c6294279402a494b09cda38823815efac64ad2397f54964cddb5b10ff20f7de2b5f03f346454d84a86992d"

RPROVIDES:${PN} += "python3-matplotlib-tk \
python311-matplotlib-tk"

RDEPENDS:${PN} += "python-abi \
python311-Pillow-tk \
python311-matplotlib \
python311-tk \
tcl"

inherit rpm
