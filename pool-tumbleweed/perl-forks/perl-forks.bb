SUMMARY = "Drop-in replacement for Perl threads using fork()"
DESCRIPTION = "The 'forks' pragma allows a developer to use threads without having to have \
a threaded perl, or to even run 5.8.0 or higher. \
 \
Refer to the the threads manpage module for ithreads API documentation. \
Also, use \
 \
    perl -Mforks -e 'print $threads::VERSION' \
 \
to see what version of the threads manpage you should refer to regarding \
supported API features. \
 \
There were a number of goals that I am trying to reach with this \
implementation. \
 \
    Using this module *only* makes sense if you run on a system that has an \
    implementation of the 'fork' function by the Operating System. Windows \
    is currently the only known system on which Perl runs which does *not* \
    have an implementation of 'fork'. Therefore, it *doesn't* make any \
    sense to use this module on a Windows system. And therefore, a check is \
    made during installation barring you from installing on a Windows \
    system."
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "0.36"

RPM_NAME = "perl-forks-0.36-1.27.aarch64.rpm"
RPM_HASH = "3ef4323b0008125801ae79dc350f780bfc6798b0bac45ba99b87363f6567b3115c953668c0677f098a825d7bbda5e85fad7f333966d333e5cf9156f7dfd9e1e3"

RPROVIDES:${PN} += "perl-forks \
perl-forks--shared \
perl-threads--shared--array \
perl-threads--shared--handle \
perl-threads--shared--hash \
perl-threads--shared--scalar"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
perl--MODULE-COMPAT-5.38.0 \
perl-Acme--Damn \
perl-Devel--Symdump \
perl-List--MoreUtils \
perl-Sys--SigAction"

inherit rpm
