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

RPM_NAME = "perl-File-Unpack-0.70-7.13.aarch64.rpm"
RPM_HASH = "a73a817ab080696acc08938339ad31bfbd24889292eb61d684b88a585c78c9b3e3d833e2bc5065895e2023ab4242d42481c79f0be8dfdbfab156865fe7e4b8d0"

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
perl--MODULE-COMPAT-5.38.0 \
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
