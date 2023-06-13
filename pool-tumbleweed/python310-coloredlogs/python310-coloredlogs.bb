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

RPM_NAME = "python310-coloredlogs-15.0.1-4.1.noarch.rpm"
RPM_HASH = "bea36f6791fcf544e25ea9430b06ef7b6c5391accb782cf41a23e43405c67f52bd16c05d20ffd7deb8b9e40e8e66fda4884fba6419eec2aeae519ffd7ff26543"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-coloredlogs \
python3.10dist(coloredlogs) \
python310-coloredlogs \
python3dist(coloredlogs)"

RDEPENDS:${PN} += "/bin/sh \
/usr/bin/python3.10 \
python(abi) \
python310-capturer \
python310-humanfriendly \
update-alternatives"

inherit rpm
