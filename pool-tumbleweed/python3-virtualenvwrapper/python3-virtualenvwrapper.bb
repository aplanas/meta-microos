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

RPM_NAME = "python3-virtualenvwrapper-4.8.4-4.8.noarch.rpm"
RPM_HASH = "78670a474fcd7b75fbf86e4d59bc769ddf2d6d401531495804ad02955204b0191c671ffc572b5ba640dea5a5200b1495d2a0cdcaf739258c6f8f9f324ba2835b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-virtualenvwrapper \
python3.10dist-virtualenvwrapper \
python3dist-virtualenvwrapper"

RDEPENDS:${PN} += "/bin/sh \
python-abi \
python3-stevedore \
python3-virtualenv \
python3-virtualenv-clone"

inherit rpm
