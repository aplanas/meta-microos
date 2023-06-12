SUMMARY = "Lua string hashing library, useful for internationalization"
DESCRIPTION = "Useful for internationalization."
LICENSE = "MIT"

PV = "1.31"

RPM_NAME = "lua53-say-1.31-5.1.noarch.rpm"
RPM_HASH = "a57ba8960cd8b3515409b0ebe31b48bab2f6f44f484f1c2087193de7d7df3e9cadfab45446a27b4b1f2af6d19021ae0c9e422e933ca22bc48a935a63b7e1e330"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "lua53-say"
RDEPENDS:${PN} += "lua53"

inherit rpm
