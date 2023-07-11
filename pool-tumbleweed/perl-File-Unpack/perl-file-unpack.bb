SUMMARY = "An strong archive file unpacker, based on mime-types"
DESCRIPTION = "File::Unpack is an unpacker for archives and files \
(bz2/gz/zip/tar/cpio/iso/rpm/deb/cab/lzma/7z/rar/...).  We call \
it strong, because it is not fooled by file suffixes, or multiply wrapped packages. \
It reliably detects mime-types and recursivly descends into each archive found \
until it finally exposes all unpackable payload contents. \
A precise logfile can be written, describing mimetypes and unpack actions. \
Most of the known archive file formats are supported. Shell-script-style \
plugins can be added to support additinal formats."
LICENSE = "GPL-1.0-or-later | Artistic-1.0"

PV = "0.70"

RPM_NAME = "perl-File-Unpack-0.70-7.12.aarch64.rpm"
RPM_HASH = "dfd0ed799a102ac4bf1c85c4a2056d0118fac336d172cfd3349ef4f96c111a39d8e4725588ccf18f3436d22d7a14c06633ee057a66155baf408b99734a9fa861"

RPROVIDES:${PN} += "perl-File--Unpack \
perl-File-Unpack"

RDEPENDS:${PN} += "/usr/bin/perl \
/usr/bin/sh \
binutils \
bzip2 \
cabextract \
cpio \
file \
file-unpack \
gzip \
lzip \
mkisofs \
p7zip-full \
perl--MODULE-COMPAT-5.36.1 \
perl-BSD--Resource \
perl-Carp \
perl-Compress--Raw--Bzip2 \
perl-Compress--Raw--Lzma \
perl-Compress--Raw--Zlib \
perl-Cwd \
perl-File--LibMagic \
perl-File--MimeInfo--Magic \
perl-File--Path \
perl-File--Temp \
perl-Filesys--Statvfs \
perl-IPC--Run \
perl-JSON \
perl-String-ShellQuote \
perl-Text--Sprintf--Named \
poppler-tools \
rpm \
shared-mime-info \
sharutils \
tar \
unzip \
xz"

inherit rpm
