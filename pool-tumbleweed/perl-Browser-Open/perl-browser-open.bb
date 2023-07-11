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

RPM_NAME = "perl-Browser-Open-0.04-5.27.noarch.rpm"
RPM_HASH = "ca8e2d14fd7753b55a26e237cad62b571de6533e891384b8158555fa9fb54512c26815b663c05ca17f37d7b0b8a7cb73c9530dedc95ed0553ce6813584ec0004"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-Browser--Open \
perl-Browser-Open"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.36.1 \
perl-Test--More \
perl-parent"

inherit rpm
