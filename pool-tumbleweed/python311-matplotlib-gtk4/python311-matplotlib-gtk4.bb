SUMMARY = "GTK4 backends for python311-matplotlib"
DESCRIPTION = "This package includes the GTK4-based gtk4, gtk4agg, and \
gtk4cairo backends for the python311-matplotlib plotting package"
LICENSE = "SUSE-Matplotlib"

PV = "3.6.3"

RPM_NAME = "python311-matplotlib-gtk4-3.6.3-2.1.aarch64.rpm"
RPM_HASH = "9d53fe5df7f8bc98c68490160c37700af102a97a68187817ea75fa968eafcefa832664bc9c7db8904881b9baf74d7b4f0efbe6733a5e9c1dcfa223ff3bb4780e"

RPROVIDES:${PN} += "python311-matplotlib-gtk4"

RDEPENDS:${PN} += "python-abi \
python311-matplotlib \
python311-matplotlib-gtk-common"

inherit rpm
