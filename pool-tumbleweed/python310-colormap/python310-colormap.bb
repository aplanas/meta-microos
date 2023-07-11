SUMMARY = "Utilities to manipulate matplotlib colormaps and color codecs"
DESCRIPTION = "The colormap package provides utilities to convert colors between \
RGB, HEX, HLS, HUV and a class to build colormaps for matplotlib. All \
matplotlib colormaps and some R colormaps are available altogether. The \
plot_colormap method is able to pick up a colormaps and \
the test_colormap can be used to visually test a new colormap."
LICENSE = "BSD-3-Clause"

PV = "1.0.4"

RPM_NAME = "python310-colormap-1.0.4-1.5.noarch.rpm"
RPM_HASH = "cf215d7125f4ebca0308b4332a101a5abbce32c6770f548e87e5ba2f23e734d24d325859286e979f5d536ce66782bc57aa8188198b34f31981b9a524cb0e92c7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-colormap \
python310-colormap \
python3dist-colormap"

RDEPENDS:${PN} += "python-abi \
python310-easydev \
python310-matplotlib"

inherit rpm
