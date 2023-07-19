SUMMARY = "GTK3 backends for python311-matplotlib"
DESCRIPTION = "This package includes the GTK3-based gtk3, gtk3agg, and \
gtk3cairo backends for the python311-matplotlib plotting package"
LICENSE = "SUSE-Matplotlib"

PV = "3.6.3"

RPM_NAME = "python311-matplotlib-gtk3-3.6.3-3.1.aarch64.rpm"
RPM_HASH = "e26414980ac4c8090dc814320227dc1a3d8a2bc9cc2e18a4735bdd53d32dc276ba31aeb79e5ffa39e615f3143f32c85719da4e9dea7ec48c5ef78ba47d27942f"

RPROVIDES:${PN} += "python3-matplotlib-gtk3 \
python311-matplotlib-gtk3"

RDEPENDS:${PN} += "python-abi \
python311-matplotlib \
python311-matplotlib-gtk-common"

inherit rpm
