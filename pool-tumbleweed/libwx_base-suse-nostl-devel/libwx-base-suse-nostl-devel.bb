SUMMARY = "Development files for wxWidgets-3_2-nostl"
DESCRIPTION = "wxWidgets is a C++ library abstraction layer for a number of GUI \
backends. \
This package is a build artifact and need not be manually installed."
LICENSE = "LGPL-2.1-or-later-WITH-WxWindows-exception-3.1"

PV = "3.2.2.1"

RPM_NAME = "libwx_base-suse-nostl-devel-3.2.2.1-3.1.aarch64.rpm"
RPM_HASH = "38126fcea9f3a939967dbaf49f9a2ab37fa32fce8eb0dfe828cd293236db5ab7bc73139ea5ffcb10f4bae88a914ef92d0c23b9b13498ae93e6a3f7493eb17921"

RPROVIDES:${PN} += "libwx-base-devel \
libwx-base-suse-nostl-devel"

RDEPENDS:${PN} += "libwx-baseu-net-suse-nostl9-0-0 \
libwx-baseu-suse-nostl9-0-0 \
libwx-baseu-xml-suse-nostl9-0-0"

inherit rpm
