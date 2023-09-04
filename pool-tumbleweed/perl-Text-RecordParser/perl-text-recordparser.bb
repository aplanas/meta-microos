SUMMARY = "Read Record-Oriented Files"
DESCRIPTION = "This module is for reading record-oriented data in a delimited text file. \
The most common example have records separated by newlines and fields \
separated by commas or tabs, but this module aims to provide a consistent \
interface for handling sequential records in a file however they may be \
delimited. Typically this data lists the fields in the first line of the \
file, in which case you should call 'bind_header' to bind the field name \
(or not, and it will be called implicitly). If the first line contains \
data, you can still bind your own field names via 'bind_fields'. Either \
way, you can then use many methods to get at the data as arrays or hashes."
LICENSE = "GPL-2.0-only"

PV = "1.6.5"

RPM_NAME = "perl-Text-RecordParser-1.6.5-3.9.noarch.rpm"
RPM_HASH = "b471a7ea68eec33ea46093eba40c9c114bb4a4c7e2ee26b3ea80126229bfb33e5767ddd1dcb984321ddee822dc7bf94781883f62163e85a9765db10a45ed2a28"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-Text--RecordParser \
perl-Text--RecordParser--Object \
perl-Text--RecordParser--Tab \
perl-Text-RecordParser"

RDEPENDS:${PN} += "/usr/bin/perl \
perl--MODULE-COMPAT-5.38.0 \
perl-Class--Accessor \
perl-IO--Scalar \
perl-List--MoreUtils \
perl-Readonly \
perl-Text--Autoformat"

inherit rpm
