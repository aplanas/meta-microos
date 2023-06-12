SUMMARY = "Utilities to manipulate matplotlib colormaps and color codecs"
DESCRIPTION = "The colormap package provides utilities to convert colors between \
RGB, HEX, HLS, HUV and a class to build colormaps for matplotlib. All \
matplotlib colormaps and some R colormaps are available altogether. The \
plot_colormap method is able to pick up a colormaps and \
the test_colormap can be used to visually test a new colormap."
LICENSE = "BSD-3-Clause"

PV = "1.0.4"

RPM_NAME = "python310-colormap-1.0.4-1.3.noarch.rpm"
RPM_HASH = "445cff839fc52a1d451660af5bfa4063ada329cbe3008d47873abe5142ff1284b4cd23a71a15008879295ffe60298462f9f1afda562f5e991e79dea9b14321f4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-colormap \
python3.10dist(colormap) \
python310-colormap \
python3dist(colormap)"
RDEPENDS:${PN} += "python(abi) \
python310-easydev \
python310-matplotlib"

inherit rpm
