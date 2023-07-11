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

RPM_NAME = "python39-humanfriendly-10.0-5.2.noarch.rpm"
RPM_HASH = "4ac24d9115eac7ed470990bc860e1cc4fb0e803dedc213500894082a9ff1d956cd0f77ece3199cd1062ecbcd9d4a45b8faaa165d62a302e587cad2b9731c57ca"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-humanfriendly \
python39-humanfriendly \
python3dist-humanfriendly"

RDEPENDS:${PN} += "/usr/bin/python3.9 \
/usr/bin/sh \
python-abi \
python39 \
update-alternatives"

inherit rpm
