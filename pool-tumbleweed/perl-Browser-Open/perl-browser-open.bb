SUMMARY = "Open a browser in a given URL"
DESCRIPTION = "The functions optionaly exported by this module allows you to open URLs in \
the user browser. \
 \
A set of known commands per OS-name is tested for presence, and the first \
one found is executed. With an optional parameter, all known commands are \
checked. \
 \
The the 'open_browser' manpage uses the 'system()' function to execute the \
command. If you want more control, you can get the command with the the \
'open_browser_cmd' manpage or the 'open_browser_cmd_all' manpage functions \
and then use whatever method you want to execute it."
LICENSE = "Artistic-1.0 | GPL-1.0+"

PV = "0.04"

RPM_NAME = "perl-Browser-Open-0.04-5.28.noarch.rpm"
RPM_HASH = "5b823ecdd2059ae25f4c3a5bc705213630205c030f3d5bf9fd99b3bb23ab9461ef1cfa96a601422428d8136c5228b8599c5f4071d10e85e1f7a2f80069e0df12"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-Browser--Open \
perl-Browser-Open"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.38.0 \
perl-Test--More \
perl-parent"

inherit rpm
