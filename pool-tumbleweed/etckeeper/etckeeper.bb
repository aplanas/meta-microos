SUMMARY = "Store /etc under Version Control"
DESCRIPTION = "The etckeeper program is a tool to let /etc be stored in a git, \
mercurial, bzr or darcs repository. It hooks into yum to automatically \
commit changes made to /etc during package upgrades. It tracks file \
metadata that version control systems do not normally support, but that \
is important for /etc, such as the permissions of /etc/shadow. It is \
quite modular and configurable, while also being simple to use if you \
understand the basics of working with version control."
LICENSE = "GPL-2.0-or-later"

PV = "1.18.18"

RPM_NAME = "etckeeper-1.18.18-2.3.noarch.rpm"
RPM_HASH = "f0c3af088af92ce532a1e81e3dd3c9c1035f66ae971d777b147b5fa8536f0601f30aeb7b1027ce360d1593ac133327405217d587e6929f151482e9789781f9dd"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "config-etckeeper \
etckeeper"

RDEPENDS:${PN} += "/usr/bin/sh \
systemd"

inherit rpm
