SUMMARY = "The one true plugin for rbenv bundler integration"
DESCRIPTION = "This plugin makes rbenv 'bundle exec' your ruby executables so you don't have to."
LICENSE = "MIT"

PV = "1.0.0"

RPM_NAME = "rbenv-bundle-exec-1.0.0-1.2.noarch.rpm"
RPM_HASH = "fad7771b624459814dde0722f5eefa1eff5b2bef6f53733ab039985422ecb2f002de6552fb664583365a03588548e929b6a60b1d57de13aed0ab69aee39c9b94"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "rbenv-bundle-exec"

RDEPENDS:${PN} += "rbenv"

inherit rpm
