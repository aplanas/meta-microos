SUMMARY = "Window Manager Icons, themable icon distribution"
DESCRIPTION = "The Window Manager Icons is an efficient icon distribution designed to \
be standardized and configurable.  Includes several themed icon sets, \
scripts, and configurations for several window managers. \
 \
 \
 \
Authors: \
-------- \
    Mikhael Goikhman <migo@homemail.com> \
    Olivier Chapuis <olivier.chapuis@free.fr>"
LICENSE = "GPL-2.0+"

PV = "0.4.0"

RPM_NAME = "wm-icons-0.4.0-17.17.noarch.rpm"
RPM_HASH = "d00525b70fa68a03579dffec2dfa8d7502ca88c83f1eb81daec2e32c1fd97688940e471d3bd907b6ad4dd463a860027e3116122371df6ce400942bd35d44f06d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "wm-icons"

RDEPENDS:${PN} += "/usr/bin/sh"

inherit rpm
