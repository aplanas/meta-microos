SUMMARY = "Debian package management system"
DESCRIPTION = "This package contains tools for working with Debian packages. It makes \
it possible to create and extract Debian packages. If Alien is \
installed, the packages can be converted to RPMs. \
 \
This package contains the following Debian packages: dpkg, dselect, \
dpkg-doc, dpkg-dev."
LICENSE = "GPL-2.0-or-later"

PV = "1.21.22"

RPM_NAME = "dpkg-1.21.22-1.2.aarch64.rpm"
RPM_HASH = "21cce801bb08646b4f06142d35fa37e2aaf089ef4ddc5beffd4f0098a6d43aa3bbf73c2e27c3f63edad69113f8af3ffd3a32a70c92303c887ebd5eb9d2ce26ab"

RPROVIDES:${PN} += "deb \
dpkg \
dpkg-dev \
dpkg-doc \
dselect \
perl-Dpkg \
perl-Dpkg--Arch \
perl-Dpkg--Build--Info \
perl-Dpkg--BuildEnv \
perl-Dpkg--BuildFlags \
perl-Dpkg--BuildInfo \
perl-Dpkg--BuildOptions \
perl-Dpkg--BuildProfiles \
perl-Dpkg--BuildTypes \
perl-Dpkg--Changelog \
perl-Dpkg--Changelog--Debian \
perl-Dpkg--Changelog--Entry \
perl-Dpkg--Changelog--Entry--Debian \
perl-Dpkg--Changelog--Parse \
perl-Dpkg--Checksums \
perl-Dpkg--Compression \
perl-Dpkg--Compression--FileHandle \
perl-Dpkg--Compression--Process \
perl-Dpkg--Conf \
perl-Dpkg--Control \
perl-Dpkg--Control--Changelog \
perl-Dpkg--Control--Fields \
perl-Dpkg--Control--FieldsCore \
perl-Dpkg--Control--Hash \
perl-Dpkg--Control--HashCore \
perl-Dpkg--Control--HashCore--Tie \
perl-Dpkg--Control--Info \
perl-Dpkg--Control--Tests \
perl-Dpkg--Control--Tests--Entry \
perl-Dpkg--Control--Types \
perl-Dpkg--Deps \
perl-Dpkg--Deps--AND \
perl-Dpkg--Deps--KnownFacts \
perl-Dpkg--Deps--Multiple \
perl-Dpkg--Deps--OR \
perl-Dpkg--Deps--Simple \
perl-Dpkg--Deps--Union \
perl-Dpkg--Dist--Files \
perl-Dpkg--ErrorHandling \
perl-Dpkg--Exit \
perl-Dpkg--File \
perl-Dpkg--Getopt \
perl-Dpkg--Gettext \
perl-Dpkg--IPC \
perl-Dpkg--Index \
perl-Dpkg--Interface--Storable \
perl-Dpkg--Lock \
perl-Dpkg--OpenPGP \
perl-Dpkg--OpenPGP--Backend \
perl-Dpkg--OpenPGP--Backend--GnuPG \
perl-Dpkg--OpenPGP--Backend--SOP \
perl-Dpkg--OpenPGP--Backend--Sequoia \
perl-Dpkg--OpenPGP--ErrorCodes \
perl-Dpkg--OpenPGP--KeyHandle \
perl-Dpkg--Package \
perl-Dpkg--Path \
perl-Dpkg--Shlibs \
perl-Dpkg--Shlibs--Cppfilt \
perl-Dpkg--Shlibs--Objdump \
perl-Dpkg--Shlibs--Objdump--Object \
perl-Dpkg--Shlibs--Symbol \
perl-Dpkg--Shlibs--SymbolFile \
perl-Dpkg--Source--Archive \
perl-Dpkg--Source--BinaryFiles \
perl-Dpkg--Source--Format \
perl-Dpkg--Source--Functions \
perl-Dpkg--Source--Package \
perl-Dpkg--Source--Package--V1 \
perl-Dpkg--Source--Package--V2 \
perl-Dpkg--Source--Package--V3--Bzr \
perl-Dpkg--Source--Package--V3--Custom \
perl-Dpkg--Source--Package--V3--Git \
perl-Dpkg--Source--Package--V3--Native \
perl-Dpkg--Source--Package--V3--Quilt \
perl-Dpkg--Source--Patch \
perl-Dpkg--Source--Quilt \
perl-Dpkg--Substvars \
perl-Dpkg--Vars \
perl-Dpkg--Vendor \
perl-Dpkg--Vendor--Debian \
perl-Dpkg--Vendor--Default \
perl-Dpkg--Vendor--Devuan \
perl-Dpkg--Vendor--Ubuntu \
perl-Dpkg--Version \
perl-Dselect--Ftp"

RDEPENDS:${PN} += "/usr/bin/perl \
/usr/bin/sh \
coreutils \
cpio \
ld-linux-aarch64.so.1 \
libbz2.so.1 \
libc.so.6 \
libcrypto.so.3 \
liblzma.so.5 \
libncursesw.so.6 \
libselinux.so.1 \
libtinfo.so.6 \
libz.so.1 \
make \
patch \
perl--MODULE-COMPAT-5.38.0 \
perl-Date--Parse \
update-alternatives"

inherit rpm
