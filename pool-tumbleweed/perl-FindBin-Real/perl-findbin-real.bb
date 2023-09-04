SUMMARY = "Locate directory of original perl script"
DESCRIPTION = "Locates the full path to the script bin directory to allow the use of paths \
relative to the bin directory. \
 \
This allows a user to setup a directory tree for some software with \
directories <root>/bin and <root>/lib and then the above example will allow \
the use of modules in the lib directory without knowing where the software \
tree is installed. \
 \
If perl is invoked using the *-e* option or the perl script is read from \
'STDIN' then FindBin sets both 'Bin()' and 'RealBin()' return values to the \
current directory."
LICENSE = "GPL-1.0+ | Artistic-1.0"

PV = "1.05"

RPM_NAME = "perl-FindBin-Real-1.05-14.28.noarch.rpm"
RPM_HASH = "22b29d1da39e758cdabb240a810321372bb9c711194b551304b5fb2add910cfb1cbcd3c45db4685ea3b08c90256d0db7bdd809b610411f7ccb71495b8c71ee0c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-FindBin--Real \
perl-FindBin-Real"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.38.0"

inherit rpm
