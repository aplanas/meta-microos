SUMMARY = "Fish completion for git-bug"
DESCRIPTION = "Fish shell completions for git-bug"
LICENSE = "MIT"

PV = "0.8.0"

RPM_NAME = "git-bug-fish-completion-0.8.0-1.3.noarch.rpm"
RPM_HASH = "37c50e6ae5ec52915d9c1cf78b3297e855eaca84afc1a2bd58c6c9bbe114aff594e3a81bb375c545a54166f2c58e61bbfcc24ab221009d3ddb67d10b892d2358"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "git-bug-fish-completion"

RDEPENDS:${PN} += "fish"

inherit rpm
