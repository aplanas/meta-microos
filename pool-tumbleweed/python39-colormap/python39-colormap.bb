SUMMARY = "Utilities to manipulate matplotlib colormaps and color codecs"
DESCRIPTION = "The colormap package provides utilities to convert colors between \
RGB, HEX, HLS, HUV and a class to build colormaps for matplotlib. All \
matplotlib colormaps and some R colormaps are available altogether. The \
plot_colormap method is able to pick up a colormaps and \
the test_colormap can be used to visually test a new colormap."
LICENSE = "BSD-3-Clause"

PV = "1.0.4"

RPM_NAME = "python39-colormap-1.0.4-1.3.noarch.rpm"
RPM_HASH = "6907c5aa086b7a06b94cd505ed882720bb32d18a893c11d97482f2324e99591685f4c123e6cc2126659fdb031f8624accd3d4146c463ea8a9efc368d0abc8fcd"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-colormap \
python39-colormap \
python3dist-colormap"

RDEPENDS:${PN} += "python-abi \
python39-easydev \
python39-matplotlib"

inherit rpm
