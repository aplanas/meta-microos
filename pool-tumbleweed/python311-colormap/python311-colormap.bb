SUMMARY = "Utilities to manipulate matplotlib colormaps and color codecs"
DESCRIPTION = "The colormap package provides utilities to convert colors between \
RGB, HEX, HLS, HUV and a class to build colormaps for matplotlib. All \
matplotlib colormaps and some R colormaps are available altogether. The \
plot_colormap method is able to pick up a colormaps and \
the test_colormap can be used to visually test a new colormap."
LICENSE = "BSD-3-Clause"

PV = "1.0.4"

RPM_NAME = "python311-colormap-1.0.4-1.5.noarch.rpm"
RPM_HASH = "2db980ba3a7bdea92f55ef1cb714abfffeaffe615efa1277c0ddeabd993c99dc5ebe4ac3f17f742eff8f4f3b117245a5d5a32222002571fc75eeae8022fd5640"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-colormap \
python3.11dist-colormap \
python311-colormap \
python3dist-colormap"

RDEPENDS:${PN} += "python-abi \
python311-easydev \
python311-matplotlib"

inherit rpm
