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

RPM_NAME = "python310-humanfriendly-10.0-5.2.noarch.rpm"
RPM_HASH = "83a3137ad662d654784485149cfa5375875b2ea1f000190bcb534fb5ff18da56b1c8cb15f39af70c62a4ffdf717c893b0029735c41f745b13e11de815e4f7600"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-humanfriendly \
python310-humanfriendly \
python3dist-humanfriendly"

RDEPENDS:${PN} += "/usr/bin/python3.10 \
/usr/bin/sh \
python-abi \
python310 \
update-alternatives"

inherit rpm
