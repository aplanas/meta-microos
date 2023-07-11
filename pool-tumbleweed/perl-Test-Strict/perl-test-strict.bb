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

RPM_NAME = "perl-Test-Strict-0.52-1.16.noarch.rpm"
RPM_HASH = "4538b1df0e4b7fd58de5041ee047f08d3140796452565f06dcdee03b06aa8d634b96291bbfed435040bff6064447455a3f11c2c65a1d27d039b17ac85cf20f8f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-Test--Strict \
perl-Test-Strict"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.36.1"

inherit rpm
