SUMMARY = "Show git diff in a split window"
DESCRIPTION = "This script provides two functions to display git diffs in vim. \
:GITDiff [commitish] \
    Split the vim window vertically, display the HEAD, or some other changeset, version of the file in the split, then diff them. \
:GITChanges [commitish] \
    Highlight lines that were changed since the HEAD or some other changeset."
LICENSE = "GPL-2.0-only"

PV = "2"

RPM_NAME = "vim-plugin-gitdiff-2-56.1.noarch.rpm"
RPM_HASH = "569818b7658a93d08dcbe97cb70118935b631313759fe17fb1effe5baf57c1062a336fbc27184ffa1a65fd010ff131eb13f4dbf0dd4567c2b632e475809ccd86"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "vim-plugin-gitdiff"

RDEPENDS:${PN} += "git-core"

inherit rpm
