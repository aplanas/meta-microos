SUMMARY = "Manage files with git, without checking their contents into git"
DESCRIPTION = "Git-annex allows managing files with git, without checking the file contents \
into git. While that may seem paradoxical, it is useful when dealing with files \
larger than git can currently easily handle, whether due to limitations in \
memory, time, or disk space. \
 \
It can store large files in many places, from local hard drives, to a large \
number of cloud storage services, including S3, WebDAV, and rsync, with a dozen \
cloud storage providers usable via plugins. Files can be stored encrypted with \
gpg, so that the cloud storage provider cannot see your data. \
git-annex keeps track of where each file is stored, so it knows how many copies \
are available, and has many facilities to ensure your data is preserved. \
 \
git-annex can also be used to keep a folder in sync between computers, noticing \
when files are changed, and automatically committing them to git and \
transferring them to other computers. The git-annex webapp makes it easy to set \
up and use git-annex this way."
LICENSE = "AGPL-3.0-or-later & GPL-3.0-or-later & BSD-2-Clause & MIT & GPL-2.0-only"

PV = "10.20230407"

RPM_NAME = "git-annex-10.20230407-1.2.aarch64.rpm"
RPM_HASH = "7a31b05f55115e225a841ffa46b15168c43c2266684911b59f1d11083933ff5eae3cd7df3e6b96361424eaf1826101a6574a184bc0d9141d650c7b60c1f6dd53"

RPROVIDES:${PN} += "git-annex"

RDEPENDS:${PN} += "desktop-file-utils \
hicolor-icon-theme \
ld-linux-aarch64.so.1 \
libatomic.so.1 \
libc.so.6 \
libffi.so.8 \
libgmp.so.10 \
libm.so.6 \
libmagic.so.1 \
libnuma.so.1 \
libsqlite3.so.0 \
libyaml-0.so.2 \
libz.so.1"

inherit rpm
