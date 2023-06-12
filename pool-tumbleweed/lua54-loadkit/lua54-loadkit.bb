SUMMARY = "Loadkit allows you to load arbitrary files within the Lua package path"
DESCRIPTION = "Loadkit lets you register new file extension handlers that \
can be opened with require, or you can just search for files \
of any extension using the current search path."
LICENSE = "MIT"

PV = "1.1.0"

RPM_NAME = "lua54-loadkit-1.1.0-4.2.noarch.rpm"
RPM_HASH = "5705537fda45b1d60a57e87250ecd3f6e02323906c66ad2dd31f3aa03ce225adb44f1d5125b0dc67c96b74450e92dedcb866da13e5fd1dfe5d71b67ffdfa2ca6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "lua-loadkit \
lua54-loadkit"
RDEPENDS:${PN} += "lua54"

inherit rpm
