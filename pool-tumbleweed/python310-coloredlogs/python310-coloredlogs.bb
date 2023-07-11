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

RPM_NAME = "python310-coloredlogs-15.0.1-4.3.noarch.rpm"
RPM_HASH = "56304b137e4b4e1e51a2c2b38892d0a5547ae9e06afdfe95b66de23f02eff0e5ef441aac2276f3aa46e2c8e54ec5e4db858ae17a603264935e28daf57e625399"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-coloredlogs \
python310-coloredlogs \
python3dist-coloredlogs"

RDEPENDS:${PN} += "/usr/bin/python3.10 \
/usr/bin/sh \
python-abi \
python310-capturer \
python310-humanfriendly \
update-alternatives"

inherit rpm
