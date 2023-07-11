SUMMARY = "Click extension to register CLI commands via setuptools entry-points"
DESCRIPTION = "Use a decorator to get setuptools entry points that allows others \
to use your commandline utility as a home for their related sub-commands. \
You get to choose where these sub-commands or sub-groups can be registered \
but the plugin developer gets to choose they ARE registered. \
You could have all plugins register alongside the core commands, \
in a special sub-group, across multiple sub-groups, or some combination."
LICENSE = "BSD-3-Clause"

PV = "1.1.1"

RPM_NAME = "python39-click-plugins-1.1.1-5.3.noarch.rpm"
RPM_HASH = "0ce90e64b5f28a0417e3bb70438e30f9d7cc0e6236b8a643dc929c29063c1156362ed18d5d37f8a60cd18017585b3e064583fde52e89ec7a5e333e85164cbfd0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-click-plugins \
python39-click-plugins \
python3dist-click-plugins"

RDEPENDS:${PN} += "python-abi \
python39-click"

inherit rpm
