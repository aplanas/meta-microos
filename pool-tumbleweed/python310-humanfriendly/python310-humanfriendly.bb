SUMMARY = "Human friendly input/output for text interfaces using Python"
DESCRIPTION = "The functions and classes in the humanfriendly package can be used to make \
text interfaces more user friendly. \
 \
 Some example features: \
  * Parsing and formatting numbers, file sizes, pathnames and timespans in \
    simple, human friendly formats. \
  * Easy to use timers for long running operations, with human friendly \
    formatting of the resulting timespans. \
  * Prompting the user to select a choice from a list of options by typing \
    the option’s number or a unique substring of the option. \
  * Terminal interaction including text styling (ANSI escape sequences), user \
    friendly rendering of usage messages and querying the terminal for its size."
LICENSE = "MIT"

PV = "10.0"

RPM_NAME = "python310-humanfriendly-10.0-5.1.noarch.rpm"
RPM_HASH = "4256ec790a57c2872320d5b58fcdeb0e03b13dcb6fa086fac8b123a9c63836568e4afcbec1c61c6b56e3ac34d23763b12cbe8545e34ae13dd6d7894ec6ceb272"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-humanfriendly \
python3.10dist(humanfriendly) \
python310-humanfriendly \
python3dist(humanfriendly)"

RDEPENDS:${PN} += "/bin/sh \
/usr/bin/python3.10 \
python(abi) \
python310 \
update-alternatives"

inherit rpm
