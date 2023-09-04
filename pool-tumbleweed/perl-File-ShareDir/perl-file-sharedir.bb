SUMMARY = "Locate per-dist and per-module shared files"
DESCRIPTION = "The intent of File::ShareDir is to provide a companion to Class::Inspector \
and File::HomeDir, modules that take a process that is well-known by \
advanced Perl developers but gets a little tricky, and make it more \
available to the larger Perl community. \
 \
Quite often you want or need your Perl module (CPAN or otherwise) to have \
access to a large amount of read-only data that is stored on the \
file-system at run-time. \
 \
On a linux-like system, this would be in a place such as /usr/share, \
however Perl runs on a wide variety of different systems, and so the use of \
any one location is unreliable. \
 \
Perl provides a little-known method for doing this, but almost nobody is \
aware that it exists. As a result, module authors often go through some \
very strange ways to make the data available to their code. \
 \
The most common of these is to dump the data out to an enormous Perl data \
structure and save it into the module itself. The result are enormous \
multi-megabyte .pm files that chew up a lot of memory needlessly. \
 \
Another method is to put the data 'file' after the __DATA__ compiler tag \
and limit yourself to access as a filehandle. \
 \
The problem to solve is really quite simple. \
 \
  1. Write the data files to the system at install time. \
 \
  2. Know where you put them at run-time. \
 \
Perl's install system creates an 'auto' directory for both every \
distribution and for every module file. \
 \
These are used by a couple of different auto-loading systems to store code \
fragments generated at install time, and various other modules written by \
the Perl 'ancient masters'. \
 \
But the same mechanism is available to any dist or module to store any sort \
of data."
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "1.118"

RPM_NAME = "perl-File-ShareDir-1.118-1.14.noarch.rpm"
RPM_HASH = "c99baf4c0e1abab0518bee81480ab076fcb2cf7d8f25ae0e35689867f0dbcc8da6c281d653de29ef68121bd63f36562e96a7ef67d1e64d67111cc9a2899f30ef"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-File--ShareDir \
perl-File-ShareDir"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.38.0 \
perl-Class--Inspector"

inherit rpm
