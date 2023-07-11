SUMMARY = "Enhancements to virtualenv"
DESCRIPTION = "virtualenvwrapper is a set of extensions to Ian Bicking's virtualenv \
tool.  The extensions include wrappers for creating and deleting virtual \
environments and otherwise managing your development workflow, making it \
easier to work on more than one project at a time without introducing \
conflicts in their dependencies. \
 \
1.  Organizes all of your virtual environments in one place. \
2.  Wrappers for creating, copying and deleting environments, including \
    user-configurable hooks. \
3.  Use a single command to switch between environments. \
4.  Tab completion for commands that take a virtual environment as \
    argument. \
5.  User-configurable hooks for all operations. \
6.  Plugin system for more creating sharable extensions."
LICENSE = "MIT"

PV = "4.8.4"

RPM_NAME = "python3-virtualenvwrapper-4.8.4-4.9.noarch.rpm"
RPM_HASH = "cf0f4a1389dde90ce4a5dc772fb389ac16587d606ea0ddf752fd4487360bff2eb1d0f51b699522ab08f7fd01b46e5f3943d79edf8011ef4036590da310c7fc25"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-virtualenvwrapper \
python3.11dist-virtualenvwrapper \
python3dist-virtualenvwrapper"

RDEPENDS:${PN} += "/usr/bin/sh \
python-abi \
python3-stevedore \
python3-virtualenv \
python3-virtualenv-clone"

inherit rpm
