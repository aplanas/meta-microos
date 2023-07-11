SUMMARY = "zsh completion for profile-sync-daemon"
DESCRIPTION = "zsh completion for profile-sync-daemon."
LICENSE = "MIT"

PV = "6.48"

RPM_NAME = "profile-sync-daemon-zsh-completion-6.48-1.3.noarch.rpm"
RPM_HASH = "53894dd4bb7b4e756878c167689f5601d97008bab69122369b861ef72ca638cb134467f0cc028b6ed7f8a3848e7d96f3d92b6139188fd3048ac590f68a9fe4a0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "profile-sync-daemon-zsh-completion"

RDEPENDS:${PN} += "profile-sync-daemon"

inherit rpm
