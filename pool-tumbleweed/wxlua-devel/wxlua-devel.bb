SUMMARY = "Development files of libwxlua"
DESCRIPTION = "This package contains files to be used in your C++ programs to embed a Lua \
interpreter with the wxWidgets API."
LICENSE = "GPL-2.0-or-later-with-WxWindows-exception-3.1"

PV = "3.1.0.0+42"

RPM_NAME = "wxlua-devel-3.1.0.0+42-2.3.aarch64.rpm"
RPM_HASH = "0422cd371ffe503a2f1a30d9317ed4f8d8aa5d1c44a42d21a4334b4f9d9f9346725e3e75a64de8dba2c12c7e9cd946f52ea9eb34b4d16fcf2e71d4ccf8637ea7"

RPROVIDES:${PN} += "wxlua-devel"

RDEPENDS:${PN} += "libwxlua"

inherit rpm
