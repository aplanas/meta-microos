SUMMARY = "Basic cross-platform tests for scripts"
DESCRIPTION = "The intent of this module is to provide a series of basic tests for 80% of \
the testing you will need to do for scripts in the _script_ (or _bin_ as is \
also commonly used) paths of your Perl distribution. \
 \
It also provides similar functions for testing programs that are not Perl \
scripts. \
 \
Further, it aims to provide this functionality with perfect \
platform-compatibility, and in a way that is as unobtrusive as possible. \
 \
That is, if the program works on a platform, then *Test::Script* should \
always work on that platform as well. Anything less than 100% is considered \
unacceptable. \
 \
In doing so, it is hoped that *Test::Script* can become a module that you \
can safely make a dependency of all your modules, without risking that your \
module won't on some platform because of the dependency. \
 \
Where a clash exists between wanting more functionality and maintaining \
platform safety, this module will err on the side of platform safety."
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "1.29"

RPM_NAME = "perl-Test-Script-1.29-1.10.noarch.rpm"
RPM_HASH = "848cc6b578f6686e5b0c0482bbf75efcd775143e596899a31f76247483c45d4ab3019cef38a32c27e22d3ddd5a222450cb8b929e27bef526199e1d2a5486df9b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-Test--Script \
perl-Test-Script"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.36.1 \
perl-Capture--Tiny \
perl-Probe--Perl \
perl-Test2--API"

inherit rpm
