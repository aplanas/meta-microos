SUMMARY = "Tools for Manipulating PostScript Files"
DESCRIPTION = "This archive contains utilities for manipulating PostScript documents. \
Page selection and rearrangement are supported, including arrangement \
into signatures for booklet printing, and page merging for n-up \
printing. \
 \
psbook      rearranges pages into signatures \
 \
psselect    selects pages and page ranges \
 \
pstops      performs general page rearrangement and selection \
 \
psnup       put multiple pages per physical sheet of paper \
 \
psresize    alter document paper size \
 \
epsffit     fits an EPSF file to a given bounding box \
 \
You will find a README in /usr/share/doc/packages/psutils/ which also \
describes several Perl scripts for importing PostScript files. A manual \
page for each ps utility is also included."
LICENSE = "GPL-3.0-or-later"

PV = "2.08"

RPM_NAME = "psutils-2.08-2.2.aarch64.rpm"
RPM_HASH = "6eb14a93850b3b8bc877a30abac2880b1bc3d96c6fb603ffc2ac1120cada93d40884b796ed6e9d2a42b6efc303b1e26885923d58604033103e743beb65e62d06"

RPROVIDES:${PN} += "perl(PSUtils) \
psutils \
psutils(aarch-64)"

RDEPENDS:${PN} += "/usr/bin/perl \
libpaper-tools \
perl \
perl(IPC::Run3)"

inherit rpm
