SUMMARY = "Loadkit allows you to load arbitrary files within the Lua package path"
DESCRIPTION = "Loadkit lets you register new file extension handlers that \
can be opened with require, or you can just search for files \
of any extension using the current search path."
LICENSE = "MIT"

PV = "1.1.0"

RPM_NAME = "lua53-loadkit-1.1.0-4.2.noarch.rpm"
RPM_HASH = "5133e0f9e8191c98c35344f8321997e254e47569150150bac1212808f5e1c2d6f7e62a434e3b455810a290ff75aaf874dfe663358bf897e4e472c46cf0a9ee0e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "lua53-loadkit"

RDEPENDS:${PN} += "lua53"

inherit rpm
