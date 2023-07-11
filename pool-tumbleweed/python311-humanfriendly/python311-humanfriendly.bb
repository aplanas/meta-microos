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

RPM_NAME = "python311-humanfriendly-10.0-5.2.noarch.rpm"
RPM_HASH = "885d96af4f3966954edf95d0d66d04398e1f1062b85639cd83e95d7dcf4aa52b8bc83ea6fb0861ed49dff64e057cc78f1d677253c30db8f72b16fb03c000609d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-humanfriendly \
python3.11dist-humanfriendly \
python311-humanfriendly \
python3dist-humanfriendly"

RDEPENDS:${PN} += "/usr/bin/python3.11 \
/usr/bin/sh \
python-abi \
python311 \
update-alternatives"

inherit rpm
