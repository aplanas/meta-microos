SUMMARY = "Click extension to register CLI commands via setuptools entry-points"
DESCRIPTION = "Use a decorator to get setuptools entry points that allows others \
to use your commandline utility as a home for their related sub-commands. \
You get to choose where these sub-commands or sub-groups can be registered \
but the plugin developer gets to choose they ARE registered. \
You could have all plugins register alongside the core commands, \
in a special sub-group, across multiple sub-groups, or some combination."
LICENSE = "BSD-3-Clause"

PV = "1.1.1"

RPM_NAME = "python39-click-plugins-1.1.1-4.8.noarch.rpm"
RPM_HASH = "f275465154e88ddf79bd5f8626abf07078254694fa17b8a95fb9e020636db566138806094a1f068ba91de218e40867c58148f14123038992eb83d05f8d456314"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-click-plugins \
python39-click-plugins \
python3dist-click-plugins"

RDEPENDS:${PN} += "python-abi \
python39-click"

inherit rpm
