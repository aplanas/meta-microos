SUMMARY = "Files for HP SmartArray support for libstoragemgmt"
DESCRIPTION = "The libstoragemgmt-hpsa-plugin package contains the plugin for HP SmartArray storage \
management via hpssacli."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "1.9.8"

RPM_NAME = "libstoragemgmt-hpsa-plugin-1.9.8-1.2.noarch.rpm"
RPM_HASH = "feb9ac01d91fdf907dc50e0b3139f63b99f6ac9368f03692123125279c3c88cb1759bd5288f769366510f99262b4ad8e513ef73a6382e06a82c187119df56cce"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "config-libstoragemgmt-hpsa-plugin \
libstoragemgmt-hpsa-plugin"

RDEPENDS:${PN} += "/usr/bin/python3 \
/usr/bin/sh \
python-abi \
python3-libstoragemgmt"

inherit rpm
