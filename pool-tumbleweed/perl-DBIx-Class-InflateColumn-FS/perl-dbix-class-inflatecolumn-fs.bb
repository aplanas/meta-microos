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

RPM_NAME = "perl-DBIx-Class-InflateColumn-FS-0.01007-2.17.noarch.rpm"
RPM_HASH = "b488ec618f320956addea364b37db441afa531ee26451af04161e82cb8e668ee8c72835d6a291edfd088a25fdf6ad0a5fc4ba542f01fb9b37845474a12854bc2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-DBIx--Class--InflateColumn--FS \
perl-DBIx--Class--InflateColumn--FS--ResultSet \
perl-DBIx-Class-InflateColumn-FS"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.36.0 \
perl-DBD--SQLite \
perl-DBICx--TestDatabase \
perl-DBIx--Class \
perl-DBIx--Class--UUIDColumns \
perl-Path--Class"

inherit rpm
