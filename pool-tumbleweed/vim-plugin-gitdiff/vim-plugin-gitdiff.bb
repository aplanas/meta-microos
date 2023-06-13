SUMMARY = "Show git diff in a split window"
DESCRIPTION = "This script provides two functions to display git diffs in vim. \
:GITDiff [commitish] \
    Split the vim window vertically, display the HEAD, or some other changeset, version of the file in the split, then diff them. \
:GITChanges [commitish] \
    Highlight lines that were changed since the HEAD or some other changeset."
LICENSE = "GPL-2.0-only"

PV = "2"

RPM_NAME = "vim-plugin-gitdiff-2-55.1.noarch.rpm"
RPM_HASH = "8fade6151c0d8863533e5629545476378cb21bf8cc8983668b9c104f48e801c164b22cfe36068dab23cc82fad70dae1fcdfecad531e05b6f4029dc29455b246f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "vim-plugin-gitdiff"

RDEPENDS:${PN} += "git-core"

inherit rpm
