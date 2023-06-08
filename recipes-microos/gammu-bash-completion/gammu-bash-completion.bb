SUMMARY = "Bash completion for gammu"
DESCRIPTION = "This package contains the bash completion command for gammu."
LICENSE = "GPL-2.0-only"

PV = "1.42.0"

RPM_NAME = "gammu-bash-completion-1.42.0-4.6.aarch64.rpm"
RPM_HASH = "6cebf246c5b3af472dfc3bd12b6e07cf6a801c82fa6dca64aa22c5a34cebf5fea0dd5776cb7c11785bfcd2551984dff32cce4dbc81908021e967064b1a1bb0df"

RPROVIDES:${PN} += "gammu-bash-completion gammu-bash-completion(aarch-64)"
RDEPENDS:${PN} += "bash-completion gammu"

inherit rpm
