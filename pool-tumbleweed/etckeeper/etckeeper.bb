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

RPM_NAME = "etckeeper-1.18.18-2.2.noarch.rpm"
RPM_HASH = "c90ed7c881c73275b6e2ded5ed80f41eaa6eb9267173d18474ad50cfe2bd5839cfd0df4ed9ffeddc005b2d640ed3b644c919c6c16b60f13ed3f5116e30c46cd9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "config(etckeeper) \
etckeeper"

RDEPENDS:${PN} += "/bin/sh \
systemd"

inherit rpm
