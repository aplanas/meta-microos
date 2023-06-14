SUMMARY = "IPython magic function to psystem information"
DESCRIPTION = "An Jupyter magic extension for printing date and time stamps, version numbers, \
and hardware information."
LICENSE = "BSD-3-Clause"

PV = "2.3.1"

RPM_NAME = "python311-watermark-2.3.1-1.5.noarch.rpm"
RPM_HASH = "78a627ce7993298cdbda3a3c986994277f5a101f9ffacad93c16218990cd0ce68190dfd38478e0816f010bb076b47bf3c25419cf53848b3378686d798b15b64c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist-watermark \
python311-jupyter-watermark \
python311-watermark \
python3dist-watermark"

RDEPENDS:${PN} += "python-abi \
python311-ipython"

inherit rpm
