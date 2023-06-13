SUMMARY = "Command line integration of git with Bugzilla"
DESCRIPTION = "git-bz is a tool for integrating the Git command line with the \
Bugzilla bug-tracking system. Operations such as attaching patches to \
bugs, applying patches in bugs to your current tree, and closing bugs \
once you've pushed the fixes publicly can be done completely from the \
command line without having to go to your web browser."
LICENSE = "GPL-2.0+"

PV = "0.0+git.20150908"

RPM_NAME = "git-bz-0.0+git.20150908-1.15.noarch.rpm"
RPM_HASH = "8bc176101f949c6ac64c561da5234181288eec46b4e90775a8a6be5144bc1feda5303fdae3f8e296cd3ddb8f89d1472e8039da9c5df4b3e9c396224073d91911"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "git-bz"

RDEPENDS:${PN} += "/usr/bin/python2"

inherit rpm
