SUMMARY = "Provide an interface to ZIP archive files"
DESCRIPTION = "The Archive::Zip module allows a Perl program to create, manipulate, read, \
and write Zip archive files. \
 \
Zip archives can be created, or you can read from existing zip files. \
 \
Once created, they can be written to files, streams, or strings. Members \
can be added, removed, extracted, replaced, rearranged, and enumerated. \
They can also be renamed or have their dates, comments, or other attributes \
queried or modified. Their data can be compressed or uncompressed as \
needed. \
 \
Members can be created from members in existing Zip files, or from existing \
directories, files, or strings. \
 \
This module uses the Compress::Raw::Zlib library to read and write the \
compressed streams inside the files. \
 \
One can use Archive::Zip::MemberRead to read the zip file archive members \
as if they were files."
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "1.68"

RPM_NAME = "perl-Archive-Zip-1.68-1.14.noarch.rpm"
RPM_HASH = "8970c07e943406ebcbad188fb8853e84ab55620019a8759631ec1a511441c25e5cb1b3f5076e72d32260b8aa4514a55dddcecf730712b244ada70dea78ee5eea"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-Archive--Zip \
perl-Archive--Zip--Archive \
perl-Archive--Zip--BufferedFileHandle \
perl-Archive--Zip--DirectoryMember \
perl-Archive--Zip--FileMember \
perl-Archive--Zip--Member \
perl-Archive--Zip--MemberRead \
perl-Archive--Zip--MockFileHandle \
perl-Archive--Zip--NewFileMember \
perl-Archive--Zip--StringMember \
perl-Archive--Zip--Tree \
perl-Archive--Zip--ZipFileMember \
perl-Archive-Zip"

RDEPENDS:${PN} += "/usr/bin/perl \
perl--MODULE-COMPAT-5.36.1 \
perl-Compress--Raw--Zlib"

inherit rpm
