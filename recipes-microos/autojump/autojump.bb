SUMMARY = "A faster way to navigate the filesystem from a shell"
DESCRIPTION = "autojump is a faster way to navigate one's filesystem. It works by \
maintaining a database of the directories one uses the most from \
the command line. \
 \
Directories must be visited first before they can be jumped to."
LICENSE = "GPL-3.0-or-later"

PV = "22.5.3"

RPM_NAME = "autojump-22.5.3-2.4.noarch.rpm"
RPM_HASH = "b6525edb913d79ca185fdf3046f7a7f4875cb6755cc14c21d341b85f9f38778d26a70344dcd5536bbf14f5a62d798c2c60f181cc40387207e91f4452f8712444"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "autojump config(autojump)"
RDEPENDS:${PN} += "/usr/bin/python3 python(abi)"

inherit rpm
