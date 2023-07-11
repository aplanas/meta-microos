SUMMARY = "Godot command line completion for Bash"
DESCRIPTION = "Bash command line completion support for godot3, godot3-headless, \
godot3-runner and godot3-server. This is branch 3.x with version specific file locations"
LICENSE = "MIT"

PV = "3.5.2"

RPM_NAME = "godot3-bash-completion-3.5.2-2.2.noarch.rpm"
RPM_HASH = "5225e76d0a198c0f31a7329a481d1f3de36140851e4a69af50f845bd717f4b6ae5976ab639603d500ee6d43b0e589c6e3814e9bea77b377598d1f49222eb44cb"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "godot3-bash-completion"

RDEPENDS:${PN} += "bash-completion"

inherit rpm
