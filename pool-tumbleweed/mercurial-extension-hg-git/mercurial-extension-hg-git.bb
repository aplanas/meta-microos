SUMMARY = "Hg-Git Mercurial plugin"
DESCRIPTION = "This plugin for Mercurial adds the ability to push and pull to/from a Git server repository from Hg. This means you can collaborate on Git based projects from Hg, or use a Git server as a collaboration point for a team with developers using both Git and Hg. \
 \
The Hg-Git plugin can convert commits/changesets losslessly from one system to another, so you can push via a Mercurial repository and another Hg client can pull it and their changeset node ids will be identical - Mercurial data does not get lost in translation. It is intended that Hg users may wish to use this to collaborate even if no Git users are involved in the project, and it may even provide some advantages if you’re using Bookmarks."
LICENSE = "GPL-2.0-only"

PV = "1.0.2"

RPM_NAME = "mercurial-extension-hg-git-1.0.2-1.1.noarch.rpm"
RPM_HASH = "7a4989c695875ebf13e47f092804f729c30298c87ff5daff2d7315b942e065933e4994b7dad624e5cbc441c018f90d13458c62ca36c07b7c82d6926148b6356d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "mercurial-extension-hg-git \
python3-hg-git \
python3.10dist(hg-git) \
python3dist(hg-git)"

RDEPENDS:${PN} += "mercurial \
python(abi) \
python3-dulwich"

inherit rpm
