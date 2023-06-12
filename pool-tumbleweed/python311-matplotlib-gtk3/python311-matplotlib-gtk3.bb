SUMMARY = "GTK3 backends for python311-matplotlib"
DESCRIPTION = "This package includes the GTK3-based gtk3, gtk3agg, and \
gtk3cairo backends for the python311-matplotlib plotting package"
LICENSE = "SUSE-Matplotlib"

PV = "3.6.3"

RPM_NAME = "python311-matplotlib-gtk3-3.6.3-2.1.aarch64.rpm"
RPM_HASH = "53e5797b939763f9b78035efba754fdb73f0589fe738fd298ff539378c56720a66cc2ffecf730a4a2c1a412de6a35fa38e3ba8564c324a41ee07dea5e2312e73"

RPROVIDES:${PN} += "python311-matplotlib-gtk3 \
python311-matplotlib-gtk3(aarch-64)"
RDEPENDS:${PN} += "python(abi) \
python311-matplotlib \
python311-matplotlib-gtk-common"

inherit rpm
