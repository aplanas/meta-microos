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

RPM_NAME = "python39-coloredlogs-15.0.1-4.3.noarch.rpm"
RPM_HASH = "0de17d9e38f7186a586043771002e4c9c9255c28a66d35e993de7703dd82281dcb5a7ac43b45af291f9057ad15c43a1ee1e100b4407b2a8df95a674695ce04b9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-coloredlogs \
python39-coloredlogs \
python3dist-coloredlogs"

RDEPENDS:${PN} += "/usr/bin/python3.9 \
/usr/bin/sh \
python-abi \
python39-capturer \
python39-humanfriendly \
update-alternatives"

inherit rpm
