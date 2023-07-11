SUMMARY = "Debian package management system"
DESCRIPTION = "This package contains tools for working with Debian packages. It makes \
it possible to create and extract Debian packages. If Alien is \
installed, the packages can be converted to RPMs. \
 \
This package contains the following Debian packages: dpkg, dselect, \
dpkg-doc, dpkg-dev."
LICENSE = "GPL-2.0-or-later"

PV = "1.21.8"

RPM_NAME = "dpkg-1.21.8-2.2.aarch64.rpm"
RPM_HASH = "9cd9e7cd114ac899d50f48f1e20fa4233c5bf705ad5fffb34f234a99903054c229b41075c5bae8e196b26b572fb5137567cd33f9a3e043fd8fbe84fff85d4f58"

RPROVIDES:${PN} += "deb \
dpkg \
dpkg-dev \
dpkg-doc \
dselect \
perl-Dpkg \
perl-Dpkg--Arch \
perl-Dpkg--Build--Env \
perl-Dpkg--Build--Info \
perl-Dpkg--Build--Types \
perl-Dpkg--BuildFlags \
perl-Dpkg--BuildOptions \
perl-Dpkg--BuildProfiles \
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
liblzma.so.5 \
libmd.so.0 \
libncursesw.so.6 \
libselinux.so.1 \
libtinfo.so.6 \
libz.so.1 \
make \
patch \
perl--MODULE-COMPAT-5.36.1 \
perl-Date--Parse \
update-alternatives"

inherit rpm
