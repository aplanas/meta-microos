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

RPM_NAME = "perl-File-Unpack-0.70-7.11.aarch64.rpm"
RPM_HASH = "536071867dc00e49ee139742d093e1af34060fe438ed130801a53fcc6c0defef83de20327184b22da5847661ac902a6deb7379c9f164b3feacb3fff71c97be6b"

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
perl--MODULE-COMPAT-5.36.0 \
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
