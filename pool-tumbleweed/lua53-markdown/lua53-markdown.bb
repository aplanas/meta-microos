SUMMARY = "Markdown text-to-html markup system"
DESCRIPTION = "A pure-lua implementation of the Markdown text-to-html markup system."
LICENSE = "MIT"

PV = "0.331"

RPM_NAME = "lua53-markdown-0.331-4.2.noarch.rpm"
RPM_HASH = "ebf6ee4c6fdb34ee955e37ed11606313d2c45becf0347f88e7db5f71b4c503e50d565fc04d714e8ad6faa00d0638d6efb3beb69dd0d9d79e2643c088110273af"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "lua53-markdown"

RDEPENDS:${PN} += "lua53"

inherit rpm
