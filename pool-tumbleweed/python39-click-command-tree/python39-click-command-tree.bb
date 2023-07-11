SUMMARY = "Plugin for click to show the command tree of your CLI"
DESCRIPTION = "click-command-tree is a click plugin to show the command tree of your CLI"
LICENSE = "MIT"

PV = "1.1.1"

RPM_NAME = "python39-click-command-tree-1.1.1-1.1.noarch.rpm"
RPM_HASH = "0b1b40ddf16813746912112b0d0c7361b0108bb01577ba58bdca0b66b3cc3977615c7e3bb33558dc16ebbca0ae5e5b6c12bb424d8269d670f919e4365e6b2ccb"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-click-command-tree \
python39-click-command-tree \
python3dist-click-command-tree"

RDEPENDS:${PN} += "python-abi \
python39-click"

inherit rpm
