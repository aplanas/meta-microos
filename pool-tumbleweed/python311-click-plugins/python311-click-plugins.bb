SUMMARY = "Click extension to register CLI commands via setuptools entry-points"
DESCRIPTION = "Use a decorator to get setuptools entry points that allows others \
to use your commandline utility as a home for their related sub-commands. \
You get to choose where these sub-commands or sub-groups can be registered \
but the plugin developer gets to choose they ARE registered. \
You could have all plugins register alongside the core commands, \
in a special sub-group, across multiple sub-groups, or some combination."
LICENSE = "BSD-3-Clause"

PV = "1.1.1"

RPM_NAME = "python311-click-plugins-1.1.1-4.8.noarch.rpm"
RPM_HASH = "7e7fb38d8aea342964b9c11ee5ee45628ea76d5dc270d3ec8b96444bb901b64ecbc2fc969926aa5a4923a52af4b94aad186c201c312f62929410f5e99720b860"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(click-plugins) \
python311-click-plugins \
python3dist(click-plugins)"

RDEPENDS:${PN} += "python(abi) \
python311-click"

inherit rpm
