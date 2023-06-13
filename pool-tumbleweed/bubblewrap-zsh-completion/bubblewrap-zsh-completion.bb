SUMMARY = "Zsh tab-completion for bubblewrap"
DESCRIPTION = "This package provides zsh tab-completion for bubblewrap."
LICENSE = "LGPL-2.0-or-later"

PV = "0.8.0"

RPM_NAME = "bubblewrap-zsh-completion-0.8.0-1.1.aarch64.rpm"
RPM_HASH = "e913dd13bd6b338acbf66d28a0c49f18d02b9dab08ebc73ff45d3d683a0f75ea42da52ab73c95a219634553795f298a93c52bb064b90b3550dabfc94503e9e0a"

RPROVIDES:${PN} += "bubblewrap-zsh-completion \
bubblewrap-zsh-completion(aarch-64)"

RDEPENDS:${PN} += ""

inherit rpm
