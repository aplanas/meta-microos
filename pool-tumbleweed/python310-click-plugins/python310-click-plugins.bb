SUMMARY = "Click extension to register CLI commands via setuptools entry-points"
DESCRIPTION = "Use a decorator to get setuptools entry points that allows others \
to use your commandline utility as a home for their related sub-commands. \
You get to choose where these sub-commands or sub-groups can be registered \
but the plugin developer gets to choose they ARE registered. \
You could have all plugins register alongside the core commands, \
in a special sub-group, across multiple sub-groups, or some combination."
LICENSE = "BSD-3-Clause"

PV = "1.1.1"

RPM_NAME = "python310-click-plugins-1.1.1-4.8.noarch.rpm"
RPM_HASH = "a02be9e892d973fc984d8a329abf435b032d34b27ed5dca5a00881af50a04d408881eaa05d688d6636149689c8739663b719e41ef2e84848662c0855e0393d58"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-click-plugins \
python3.10dist-click-plugins \
python310-click-plugins \
python3dist-click-plugins"

RDEPENDS:${PN} += "python-abi \
python310-click"

inherit rpm
