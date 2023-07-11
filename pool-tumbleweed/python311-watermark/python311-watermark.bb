SUMMARY = "IPython magic function to psystem information"
DESCRIPTION = "An Jupyter magic extension for printing date and time stamps, version numbers, \
and hardware information."
LICENSE = "BSD-3-Clause"

PV = "2.4.3"

RPM_NAME = "python311-watermark-2.4.3-1.1.noarch.rpm"
RPM_HASH = "b001ab161871131413c03fd34170efce088e4f6dd6f6661a408c46087c71154b3ef1c5b81c87019c3d7539be7271207263b9a99172e5d8912bd2dc0ccb02fa9f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "jupyter-watermark \
python3-jupyter-watermark \
python3-watermark \
python3.11dist-watermark \
python311-jupyter-watermark \
python311-watermark \
python3dist-watermark"

RDEPENDS:${PN} += "python-abi \
python311-importlib-metadata \
python311-ipython \
python311-setuptools"

inherit rpm
