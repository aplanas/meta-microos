SUMMARY = "Code common for GTK3 and GTK4 backends for python311-matplotlib"
DESCRIPTION = "This package provides code common for the GTK3 and GTK4 backends \
for the python311-matplotlib plotting package"
LICENSE = "SUSE-Matplotlib"

PV = "3.6.3"

RPM_NAME = "python311-matplotlib-gtk-common-3.6.3-2.3.aarch64.rpm"
RPM_HASH = "21882ca81fc73a536b79f197783ffbbef21807dc35501a5a7bc4f3a9a317f2411f1d60c0b9dff0123563ed4565cf28d7a1d91a7df0793ac2954d7dd6a3ce1c44"

RPROVIDES:${PN} += "python3-matplotlib-gtk-common \
python311-matplotlib-gtk-common"

RDEPENDS:${PN} += "gdk-pixbuf-loader-rsvg \
python-abi \
python311-gobject-Gdk \
python311-gobject-cairo \
python311-matplotlib \
python311-matplotlib-cairo"

inherit rpm
