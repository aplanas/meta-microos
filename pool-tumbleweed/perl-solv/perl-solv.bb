SUMMARY = "Perl bindings for the libsolv library"
DESCRIPTION = "Perl bindings for libsolv."
LICENSE = "BSD-3-Clause"

PV = "0.7.24"

RPM_NAME = "perl-solv-0.7.24-1.3.aarch64.rpm"
RPM_HASH = "b70a795358ab5008eedbc0211d0a2354b98eca7b406e86dfefecead0562ca7214f6e4086b1c4d32920380bf5b6dae217f1e06bf1d2ee841f5e9d4a47051af33a"

RPROVIDES:${PN} += "perl-solv \
perl-solv--Alternative \
perl-solv--Chksum \
perl-solv--Dataiterator \
perl-solv--Datamatch \
perl-solv--Datapos \
perl-solv--Decision \
perl-solv--Decisionset \
perl-solv--Dep \
perl-solv--Job \
perl-solv--Pool \
perl-solv--Pool-repo-iterator \
perl-solv--Pool-solvable-iterator \
perl-solv--Problem \
perl-solv--Repo \
perl-solv--Repo-solvable-iterator \
perl-solv--Ruleinfo \
perl-solv--Selection \
perl-solv--Solution \
perl-solv--Solutionelement \
perl-solv--SolvFp \
perl-solv--Solver \
perl-solv--Solvsig \
perl-solv--Transaction \
perl-solv--TransactionClass \
perl-solv--XRepodata \
perl-solv--XRule \
perl-solv--XSolvable \
perl-solvc"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libbz2.so.1 \
libc.so.6 \
liblzma.so.5 \
librpm.so.9 \
librpmio.so.9 \
libxml2.so.2 \
libz.so.1 \
libzstd.so.1 \
perl"

inherit rpm
