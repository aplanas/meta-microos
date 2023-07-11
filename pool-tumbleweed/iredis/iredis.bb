SUMMARY = "Terminal client for Redis with auto-completion and syntax highlighting"
DESCRIPTION = "A terminal client for redis with auto-completion and syntax \
highlighting. IRedis lets one type Redis commands, and it displays results. \
 \
IRedis is an alternative for redis-cli. In most cases, IRedis behaves \
exactly the same as redis-cli. IRedis will prevent accidentally \
running dangerous commands."
LICENSE = "BSD-3-Clause"

PV = "1.13.0"

RPM_NAME = "iredis-1.13.0-1.4.noarch.rpm"
RPM_HASH = "b7a58c64177e6687cfbe35f186f54232ac8eef8565f29cb6980aa3917f5c56ce1dff060b4277e2fdced75eeac7ae5afbd00b714d83d16e2102ba0176cf881d4a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "iredis \
python3.11dist-iredis \
python3dist-iredis"

RDEPENDS:${PN} += "/usr/bin/python3 \
python-abi \
python3-Pygments \
python3-click \
python3-configobj \
python3-importlib-resources \
python3-mistune \
python3-pendulum \
python3-prompt-toolkit \
python3-redis \
python3-wcwidth"

inherit rpm
