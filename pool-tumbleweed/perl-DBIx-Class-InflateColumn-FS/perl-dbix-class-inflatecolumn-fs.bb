SUMMARY = "Inflate/deflate columns to Path::Class::File objects"
DESCRIPTION = "Provides inflation to a Path::Class::File object allowing file system \
storage of BLOBS. \
 \
The storage path is specified with 'fs_column_path'. Each file receives a \
unique name, so the storage for all FS columns can share the same path. \
 \
Within the path specified by 'fs_column_path', files are stored in \
sub-directories based on the first 2 characters of the unique file names. \
Up to 256 sub-directories will be created, as needed. Override \
'_fs_column_dirs' in a derived class to change this behavior. \
 \
'fs_new_on_update' will create a new file name if the file has been \
updated."
LICENSE = "Artistic-1.0 | GPL-1.0+"

PV = "0.01007"

RPM_NAME = "perl-DBIx-Class-InflateColumn-FS-0.01007-2.18.noarch.rpm"
RPM_HASH = "db50d5d94a16aee29e6d0d1085060bf8ec49eaea22687d9c767270a64bacaa6c8f1b75e562248ef245139decfa7b08bce9d78ba69e17ce160298da43e60ebb60"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-DBIx--Class--InflateColumn--FS \
perl-DBIx--Class--InflateColumn--FS--ResultSet \
perl-DBIx-Class-InflateColumn-FS"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.36.1 \
perl-DBD--SQLite \
perl-DBICx--TestDatabase \
perl-DBIx--Class \
perl-DBIx--Class--UUIDColumns \
perl-Path--Class"

inherit rpm
