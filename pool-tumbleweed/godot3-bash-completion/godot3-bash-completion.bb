SUMMARY = "Godot command line completion for Bash"
DESCRIPTION = "Bash command line completion support for godot3, godot3-headless, \
godot3-runner and godot3-server. This is branch 3.x with version specific file locations"
LICENSE = "MIT"

PV = "3.5.2"

RPM_NAME = "godot3-bash-completion-3.5.2-2.1.noarch.rpm"
RPM_HASH = "df5faef0ddcb46359335dc1075f54dd5d80ee0886ef487b844e937167a9948bd12aa4f5114f4cf19b5efc2f17fc98b74ab4db8f01b78f6265685c83da99503ab"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "godot3-bash-completion"

RDEPENDS:${PN} += "bash-completion"

inherit rpm
