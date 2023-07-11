SUMMARY = "Utilities to manipulate matplotlib colormaps and color codecs"
DESCRIPTION = "The colormap package provides utilities to convert colors between \
RGB, HEX, HLS, HUV and a class to build colormaps for matplotlib. All \
matplotlib colormaps and some R colormaps are available altogether. The \
plot_colormap method is able to pick up a colormaps and \
the test_colormap can be used to visually test a new colormap."
LICENSE = "BSD-3-Clause"

PV = "1.0.4"

RPM_NAME = "python39-colormap-1.0.4-1.5.noarch.rpm"
RPM_HASH = "c6f02cd0ceb0f806681249c45389aa6d46efd833b62660cc714fcb6ab40a95fd5bc8ab16ec56355a8f4bc8a92eb94ab54b6072bbc5f34e51546f77f906496e8f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-colormap \
python39-colormap \
python3dist-colormap"

RDEPENDS:${PN} += "python-abi \
python39-easydev \
python39-matplotlib"

inherit rpm
