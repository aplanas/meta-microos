SUMMARY = "Hg-Git Mercurial plugin"
DESCRIPTION = "This plugin for Mercurial adds the ability to push and pull to/from a Git server repository from Hg. This means you can collaborate on Git based projects from Hg, or use a Git server as a collaboration point for a team with developers using both Git and Hg. \
 \
The Hg-Git plugin can convert commits/changesets losslessly from one system to another, so you can push via a Mercurial repository and another Hg client can pull it and their changeset node ids will be identical - Mercurial data does not get lost in translation. It is intended that Hg users may wish to use this to collaborate even if no Git users are involved in the project, and it may even provide some advantages if you’re using Bookmarks."
LICENSE = "GPL-2.0-only"

PV = "1.0.2"

RPM_NAME = "mercurial-extension-hg-git-1.0.2-2.1.noarch.rpm"
RPM_HASH = "1791da8d9c8daaae7797ab233d384841e1a4d9cdeed8ed7171105f9d23fd191f7370316e4abc170d017054694d859a8c554dc06549dd4966f3877374593e9c90"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "mercurial-extension-hg-git \
python3-hg-git \
python3.11dist-hg-git \
python3dist-hg-git"

RDEPENDS:${PN} += "mercurial \
python-abi \
python3-dulwich"

inherit rpm
