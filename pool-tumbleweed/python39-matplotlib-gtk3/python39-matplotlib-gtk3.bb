SUMMARY = "GTK3 backends for python39-matplotlib"
DESCRIPTION = "This package includes the GTK3-based gtk3, gtk3agg, and \
gtk3cairo backends for the python39-matplotlib plotting package"
LICENSE = "SUSE-Matplotlib"

PV = "3.6.3"

RPM_NAME = "python39-matplotlib-gtk3-3.6.3-2.3.aarch64.rpm"
RPM_HASH = "43809e55ad839fa3dfa07c858e88416ce78143cb019a658e917295745103e5c51817d30f84023cc1b2e6f3f03dd59873c956ab89c5638d8cec57de1d8274854d"

RPROVIDES:${PN} += "python39-matplotlib-gtk3"

RDEPENDS:${PN} += "python-abi \
python39-matplotlib \
python39-matplotlib-gtk-common"

inherit rpm
