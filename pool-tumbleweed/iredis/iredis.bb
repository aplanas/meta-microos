SUMMARY = "Terminal client for Redis with auto-completion and syntax highlighting"
DESCRIPTION = "A terminal client for redis with auto-completion and syntax \
highlighting. IRedis lets one type Redis commands, and it displays results. \
 \
IRedis is an alternative for redis-cli. In most cases, IRedis behaves \
exactly the same as redis-cli. IRedis will prevent accidentally \
running dangerous commands."
LICENSE = "BSD-3-Clause"

PV = "1.13.0"

RPM_NAME = "iredis-1.13.0-1.3.noarch.rpm"
RPM_HASH = "f94f3c3e4169e294c67647496ed7a6f37c73288c787b8a9f556376fa80951f18e500bbe38c61b99e7699b7da3509c79b9f8d3b3718a87a89e4e31f931007f7dc"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "iredis \
python3.10dist(iredis) \
python3dist(iredis)"
RDEPENDS:${PN} += "/usr/bin/python3 \
python(abi) \
python3-Pygments \
python3-click \
python3-configobj \
python3-importlib-resources \
python3-mistune \
python3-pendulum \
python3-prompt_toolkit \
python3-redis \
python3-wcwidth"

inherit rpm
