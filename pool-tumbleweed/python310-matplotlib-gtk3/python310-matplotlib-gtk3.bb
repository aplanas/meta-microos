SUMMARY = "GTK3 backends for python310-matplotlib"
DESCRIPTION = "This package includes the GTK3-based gtk3, gtk3agg, and \
gtk3cairo backends for the python310-matplotlib plotting package"
LICENSE = "SUSE-Matplotlib"

PV = "3.6.3"

RPM_NAME = "python310-matplotlib-gtk3-3.6.3-2.3.aarch64.rpm"
RPM_HASH = "6412b1cd6929df1c657f4a7894ab04f7578d638d206fc846a2ae69c99e0696882271f644732e63b8fa9f4785d306caa078b8944a30dbce919e46f458449a7faf"

RPROVIDES:${PN} += "python310-matplotlib-gtk3"

RDEPENDS:${PN} += "python-abi \
python310-matplotlib \
python310-matplotlib-gtk-common"

inherit rpm
