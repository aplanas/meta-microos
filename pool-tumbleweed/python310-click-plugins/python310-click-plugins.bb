SUMMARY = "Click extension to register CLI commands via setuptools entry-points"
DESCRIPTION = "Use a decorator to get setuptools entry points that allows others \
to use your commandline utility as a home for their related sub-commands. \
You get to choose where these sub-commands or sub-groups can be registered \
but the plugin developer gets to choose they ARE registered. \
You could have all plugins register alongside the core commands, \
in a special sub-group, across multiple sub-groups, or some combination."
LICENSE = "BSD-3-Clause"

PV = "1.1.1"

RPM_NAME = "python310-click-plugins-1.1.1-5.3.noarch.rpm"
RPM_HASH = "fd84aa5ef6d8c93acc2576e045e6c399636a02b6ec7cfb1d3c58a530570aaea75f2f89e6803cc1d4cfab925700803af54819dfda198cba9d7932e7d0e1f7a50e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-click-plugins \
python310-click-plugins \
python3dist-click-plugins"

RDEPENDS:${PN} += "python-abi \
python310-click"

inherit rpm
