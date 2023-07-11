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

RPM_NAME = "perl-FindBin-Real-1.05-14.27.noarch.rpm"
RPM_HASH = "dd79e3927723f5444145beb4ac2e50c1f37cdd3d2d1195269e1f031dcd91645c020332f382857f1fa782865fbb59b64d53a13f79f614a760163527f86614e54c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-FindBin--Real \
perl-FindBin-Real"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.36.1"

inherit rpm
