SUMMARY = "Godot command line completion for Bash"
DESCRIPTION = "Bash command line completion support for godot and godot-runner"
LICENSE = "MIT"

PV = "4.1.1"

RPM_NAME = "godot-bash-completion-4.1.1-1.2.noarch.rpm"
RPM_HASH = "3254959419a9246fc19be41f5a67a78529446f2eccd3537c10a18d4cf2becbe81c235ae0a5315d4174059a2d070123e6c35d9efd12b60d3ce362ef9b02c4954e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "godot-bash-completion"

RDEPENDS:${PN} += "bash-completion"

inherit rpm
