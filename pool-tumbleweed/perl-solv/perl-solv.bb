SUMMARY = "Perl bindings for the libsolv library"
DESCRIPTION = "Perl bindings for libsolv."
LICENSE = "BSD-3-Clause"

PV = "0.7.24"

RPM_NAME = "perl-solv-0.7.24-1.4.aarch64.rpm"
RPM_HASH = "b14f264f14792d323ff15a2439a9bdce8f885121bee1d8969be4fcf71de3d4f0cc8247ab8e569e37c8cca4bb6014ad9879832c67db9821aa97ae4a5a3bac8f8a"

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
