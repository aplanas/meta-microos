SUMMARY = "Colored terminal output for Python's logging module"
DESCRIPTION = "The `coloredlogs` package enables colored terminal output for Python's logging_ \
module. The ColoredFormatter_ class inherits from `logging.Formatter`_ and uses \
`ANSI escape sequences`_ to render your logging messages in color. It uses only \
standard colors so it should work on any UNIX terminal. It's currently tested \
on Python 2.6, 2.7, 3.4, 3.5 and PyPy. On Windows `coloredlogs` automatically \
pulls in Colorama_ as a dependency and enables ANSI escape sequence translation \
using Colorama."
LICENSE = "MIT"

PV = "15.0.1"

RPM_NAME = "python311-coloredlogs-15.0.1-4.3.noarch.rpm"
RPM_HASH = "2c1edfd64c874777dcec3d1b5e44ca4df081f397f5267f53014628c884bdd84620bf1890534b8acdf78268a0be2711404f8bf6cea487fef7be70510b74b6efcb"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-coloredlogs \
python3.11dist-coloredlogs \
python311-coloredlogs \
python3dist-coloredlogs"

RDEPENDS:${PN} += "/usr/bin/python3.11 \
/usr/bin/sh \
python-abi \
python311-capturer \
python311-humanfriendly \
update-alternatives"

inherit rpm
