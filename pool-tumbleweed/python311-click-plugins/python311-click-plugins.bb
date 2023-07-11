SUMMARY = "Click extension to register CLI commands via setuptools entry-points"
DESCRIPTION = "Use a decorator to get setuptools entry points that allows others \
to use your commandline utility as a home for their related sub-commands. \
You get to choose where these sub-commands or sub-groups can be registered \
but the plugin developer gets to choose they ARE registered. \
You could have all plugins register alongside the core commands, \
in a special sub-group, across multiple sub-groups, or some combination."
LICENSE = "BSD-3-Clause"

PV = "1.1.1"

RPM_NAME = "python311-click-plugins-1.1.1-5.3.noarch.rpm"
RPM_HASH = "f29613dfa50f0f62d93c946cef3a60a5e4ee23d52ad15c0da4164d1292bb50d3399999bba3d399807ad76fa440898296667fd80a3b57ca0481e66c9b9de7c794"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-click-plugins \
python3.11dist-click-plugins \
python311-click-plugins \
python3dist-click-plugins"

RDEPENDS:${PN} += "python-abi \
python311-click"

inherit rpm
