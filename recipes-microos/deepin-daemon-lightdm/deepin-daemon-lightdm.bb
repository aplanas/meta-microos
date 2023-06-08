SUMMARY = "Deepin Desktop branding setting for lightdm"
DESCRIPTION = "Deepin Desktop branding setting for lightdm"
LICENSE = "GPL-3.0-or-later"

PV = "5.14.45"

RPM_NAME = "deepin-daemon-lightdm-5.14.45-2.3.aarch64.rpm"
RPM_HASH = "1a63db9a652242bd9436d91a11fa097f9202267a5699dc48bf1cf0e3ac1fd3478fa74240aa96bfa58e678b5f156ce2eec682f07fc5ee07e15e961ced9b92e2e5"

RPROVIDES:${PN} += "deepin-daemon-lightdm deepin-daemon-lightdm(aarch-64)"
RDEPENDS:${PN} += "deepin-daemon lightdm"

inherit rpm
