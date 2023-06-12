SUMMARY = "IPython magic function to psystem information"
DESCRIPTION = "An Jupyter magic extension for printing date and time stamps, version numbers, \
and hardware information."
LICENSE = "BSD-3-Clause"

PV = "2.3.1"

RPM_NAME = "python310-watermark-2.3.1-1.5.noarch.rpm"
RPM_HASH = "c775bcf8b5c9f83082dbd742abc73f9c072d0d4e66f6d3563c3657f7eff230375021b57496aac6ce1c63acfd99180c10e8e471ae949c696f106a699a8ae405f4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "jupyter-watermark \
python3-jupyter_watermark \
python3-watermark \
python3.10dist(watermark) \
python310-jupyter_watermark \
python310-watermark \
python3dist(watermark)"
RDEPENDS:${PN} += "python(abi) \
python310-ipython"

inherit rpm
