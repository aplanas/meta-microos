SUMMARY = "Reads and writes XBase (dbf) files, includes DBI support"
DESCRIPTION = "DBI compliant driver for module XBase. Please refer to DBI(3) documentation \
for how to actually use the module. In the *connect* call, specify the \
directory containing the dbf files (and other, memo, etc.) as the third \
part of the connect string. It defaults to the current directory. \
 \
Note that with dbf, there is no database server that the driver would talk \
to. This DBD::XBase calls methods from XBase.pm module to read and write \
the files on the disk directly, so any limitations and features of XBase.pm \
apply to DBD::XBase as well. DBD::XBase basically adds SQL, DBI compliant \
interface to XBase.pm. \
 \
The DBD::XBase doesn't make use of index files at the moment. If you really \
need indexed access, check XBase(3) for notes about support for variour \
index types."
LICENSE = "Artistic-1.0 | GPL-1.0+"

PV = "1.08"

RPM_NAME = "perl-DBD-XBase-1.08-1.23.noarch.rpm"
RPM_HASH = "5fe5a7f395daf9f692c93d47cedb43c7681311f976447875d71ed3f7f5cb32429c64ddc2810d01268bf30a9b0a1000e7b78bd4c7756450bd4a0334746ecaaf8a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-DBD--XBase \
perl-DBD--XBase--db \
perl-DBD--XBase--dr \
perl-DBD--XBase--st \
perl-DBD-XBase \
perl-XBase \
perl-XBase--Base \
perl-XBase--Cursor \
perl-XBase--Index \
perl-XBase--IndexCursor \
perl-XBase--Memo \
perl-XBase--Memo--Apollo \
perl-XBase--Memo--Fox \
perl-XBase--Memo--dBaseIII \
perl-XBase--Memo--dBaseIV \
perl-XBase--SDBM \
perl-XBase--SQL \
perl-XBase--SQL--Expr \
perl-XBase--cdx \
perl-XBase--cdx--Page \
perl-XBase--idx \
perl-XBase--idx--Page \
perl-XBase--mdx \
perl-XBase--mdx--Page \
perl-XBase--ndx \
perl-XBase--ndx--Page \
perl-XBase--ntx \
perl-XBase--ntx--Page"

RDEPENDS:${PN} += "/usr/bin/perl \
perl--MODULE-COMPAT-5.36.0"

inherit rpm
