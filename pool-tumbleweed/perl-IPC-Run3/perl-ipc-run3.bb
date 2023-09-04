SUMMARY = "Run a Subprocess with Input/Ouput Redirection"
DESCRIPTION = "This module allows you to run a subprocess and redirect stdin, stdout, \
and/or stderr to files and perl data structures. It aims to satisfy 99% of \
the need for using 'system', 'qx', and 'open3' with a simple, extremely \
Perlish API. \
 \
Speed, simplicity, and portability are paramount. (That's speed of Perl \
code; which is often much slower than the kind of buffered I/O that this \
module uses to spool input to and output from the child command.)"
LICENSE = "BSD-2-Clause | GPL-2.0+ | Artistic-1.0"

PV = "0.048"

RPM_NAME = "perl-IPC-Run3-0.048-1.28.noarch.rpm"
RPM_HASH = "f7ee19ddfa21ff4dff22b098a0e2879299eade6017168caa5f80c3e398663390b4c2586efceabdbbe0d5607ba19001a57947e1bf7bba73262c37a3a39c93a0f4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-IPC--Run3 \
perl-IPC--Run3--ProfArrayBuffer \
perl-IPC--Run3--ProfLogReader \
perl-IPC--Run3--ProfLogger \
perl-IPC--Run3--ProfPP \
perl-IPC--Run3--ProfReporter \
perl-IPC-Run3"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.38.0"

inherit rpm
