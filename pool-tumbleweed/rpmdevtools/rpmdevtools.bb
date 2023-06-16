SUMMARY = "RPM Development Tools"
DESCRIPTION = "This package contains scripts and (X)Emacs support files to aid in \
development of RPM packages. \
rpmdev-setuptree    Create RPM build tree within user's home directory \
rpmdev-diff         Diff contents of two archives \
rpmdev-newspec      Creates new .spec from template \
rpmdev-rmdevelrpms  Find (and optionally remove) 'development' RPMs \
rpmdev-checksig     Check package signatures using alternate RPM keyring \
rpminfo             Print information about executables and libraries \
rpmdev-md5/sha*     Display checksums of all files in an archive file \
rpmdev-vercmp       RPM version comparison checker \
spectool            Expand and download sources and patches in specfiles \
rpmdev-wipetree     Erase all files within dirs created by rpmdev-setuptree \
rpmdev-extract      Extract various archives, 'tar xvf' style \
rpmdev-bumpspec     Bump revision in specfile \
...and many more."
LICENSE = "GPL-2.0-only & GPL-2.0-or-later"

PV = "8.10"

RPM_NAME = "rpmdevtools-8.10-7.9.noarch.rpm"
RPM_HASH = "73735047c8b9893925a2e09feb1e6c3ca6c9bd7ed1daa9f192131ae5e714af024cb67da4e20f2dda99143f734829650ed7e2e7a3185fd3a2f07fca5bd5b0ea50"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "config-rpmdevtools \
rpmdevtools"

RDEPENDS:${PN} += "/usr/bin/bash \
/usr/bin/perl \
/usr/bin/python3 \
/usr/bin/sh \
bash-completion \
cpio \
curl \
distribution-release \
fakeroot \
python3-rpm"

inherit rpm
