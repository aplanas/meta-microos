SUMMARY = "Utilities to manipulate matplotlib colormaps and color codecs"
DESCRIPTION = "The colormap package provides utilities to convert colors between \
RGB, HEX, HLS, HUV and a class to build colormaps for matplotlib. All \
matplotlib colormaps and some R colormaps are available altogether. The \
plot_colormap method is able to pick up a colormaps and \
the test_colormap can be used to visually test a new colormap."
LICENSE = "BSD-3-Clause"

PV = "1.0.4"

RPM_NAME = "python311-colormap-1.0.4-1.3.noarch.rpm"
RPM_HASH = "d70e4c05ecb3fdce06e9c079a3b4021029004153e8c477360fc71d0ecdc6be172a1f3b95b857352b3e0bbc0197dc45413ce1ce929927565150ae0a6d68c82c87"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(colormap) \
python311-colormap \
python3dist(colormap)"
RDEPENDS:${PN} += "python(abi) \
python311-easydev \
python311-matplotlib"

inherit rpm
