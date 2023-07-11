SUMMARY = "Console File Manager"
DESCRIPTION = "Ranger is a console file manager that gives you greater flexibility and a \
good overview of your files without having to leave your text console. It \
visualizes the directory tree in two dimensions: the directory hierarchy on \
one, lists of files on the other, with a preview to the right. \
 \
The default keys are similar to those of Vim, Emacs and Midnight Commander, \
though ranger is easily controllable with just the arrow keys or the mouse."
LICENSE = "GPL-3.0-or-later"

PV = "1.9.3+git20230416.478d5b6"

RPM_NAME = "ranger-1.9.3+git20230416.478d5b6-2.2.noarch.rpm"
RPM_HASH = "1443a2b2a66cd80edca14115f009afa3d9332d9f8385ad082ad101a6cfcd65a0c106aba78e711df5f3a9dd92cfe10be191cd7134c2da29a1cbf382663915247a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist-ranger-fm \
python3dist-ranger-fm \
ranger"

RDEPENDS:${PN} += "/usr/bin/bash \
/usr/bin/python3 \
file \
python-abi \
python3-curses"

inherit rpm
