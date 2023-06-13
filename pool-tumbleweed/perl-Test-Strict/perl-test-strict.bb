SUMMARY = "Check syntax, presence of use strict; and test coverage"
DESCRIPTION = "The most basic test one can write is 'does it compile ?'. This module tests \
if the code compiles and play nice with Test::Simple modules. \
 \
Another good practice this module can test is to 'use strict;' in all perl \
files. \
 \
By setting a minimum test coverage through 'all_cover_ok()', a code author \
can ensure his code is tested above a preset level of _kwality_ throughout \
the development cycle. \
 \
Along with Test::Pod, this module can provide the first tests to setup for \
a module author. \
 \
This module should be able to run under the -T flag for perl >= 5.6. All \
paths are untainted with the following pattern: 'qr|^([-+@\\w./:\\\\]+)$|' \
controlled by '$Test::Strict::UNTAINT_PATTERN'."
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "0.52"

RPM_NAME = "perl-Test-Strict-0.52-1.15.noarch.rpm"
RPM_HASH = "4062c77bbb54173c4dd2751924769484cff3fc4a19da3e7e1f26f1d79e84006bff5e639420a4a86113c2e0121a0bd789b5f7ba24ff0618aff3619d7f541fb338"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl(Test::Strict) \
perl-Test-Strict"

RDEPENDS:${PN} += "perl(:MODULE_COMPAT_5.36.0)"

inherit rpm
