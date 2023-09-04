SUMMARY = "Create a Fake ShareDir for your modules for testing"
DESCRIPTION = "'Test::File::ShareDir' is some low level plumbing to enable a distribution \
to perform tests while consuming its own 'share' directories in a manner \
similar to how they will be once installed. \
 \
This allows 'File::ShareDir' to see the _latest_ version of content instead \
of simply whatever is installed on whichever target system you happen to be \
testing on. \
 \
*Note:* This module only has support for creating 'new' style share dirs \
and are NOT compatible with old File::ShareDirs. \
 \
For this reason, unless you have File::ShareDir 1.00 or later installed, \
this module will not be usable by you."
LICENSE = "Artistic-1.0 | GPL-1.0+"

PV = "1.001002"

RPM_NAME = "perl-Test-File-ShareDir-1.001002-1.25.noarch.rpm"
RPM_HASH = "abe5f9e5483247c5675a0901a1894f96b306517f634744687e3824fd379c38c5e38d97f7bd89314697eb5ce428132ee40f8242b1c9549cc0661eccc5e19e13d0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-Test--File--ShareDir \
perl-Test--File--ShareDir--Dist \
perl-Test--File--ShareDir--Module \
perl-Test--File--ShareDir--Object--Dist \
perl-Test--File--ShareDir--Object--Inc \
perl-Test--File--ShareDir--Object--Module \
perl-Test--File--ShareDir--TempDirObject \
perl-Test--File--ShareDir--Utils \
perl-Test-File-ShareDir"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.38.0 \
perl-Class--Tiny \
perl-File--Copy--Recursive \
perl-File--ShareDir \
perl-Path--Tiny \
perl-Scope--Guard \
perl-parent"

inherit rpm
