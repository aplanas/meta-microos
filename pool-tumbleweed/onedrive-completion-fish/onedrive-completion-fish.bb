SUMMARY = "OneDrive fish completition"
DESCRIPTION = "OneDrive shell completions for fish."
LICENSE = "GPL-3.0-only"

PV = "2.4.25"

RPM_NAME = "onedrive-completion-fish-2.4.25-1.1.aarch64.rpm"
RPM_HASH = "b19ab277b4d896875c34b7f862fe31732a7b026b6099c512c89a37544eb1a16fdc4d698f6c40cafacd607d26d4bc1f49d97438a595c8424efd53875b6b7d8550"

RPROVIDES:${PN} += "onedrive-completion-fish"

RDEPENDS:${PN} += "fish"

inherit rpm
