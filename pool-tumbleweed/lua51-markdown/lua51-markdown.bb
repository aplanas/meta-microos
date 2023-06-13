SUMMARY = "Markdown text-to-html markup system"
DESCRIPTION = "A pure-lua implementation of the Markdown text-to-html markup system."
LICENSE = "MIT"

PV = "0.331"

RPM_NAME = "lua51-markdown-0.331-4.2.noarch.rpm"
RPM_HASH = "d5066ea98617f62666020a23c5cd21c13a7635aebe3a79f70a0b43d2e3cf066c3f2f5c3d8a4471ed9b34c389f08789a34054f2decdcdd3d6942406e96e848e4d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "lua51-markdown"

RDEPENDS:${PN} += "lua51"

inherit rpm
