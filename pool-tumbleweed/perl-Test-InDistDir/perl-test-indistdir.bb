SUMMARY = "test environment setup for development with IDE"
DESCRIPTION = "This module helps run test scripts in IDEs like Komodo. \
 \
When running test scripts in an IDE i have to set up a project file \
defining the dist dir to run tests in and a lib dir to load additional \
modules from. Often I didn't feel like doing that, especially when i only \
wanted to do a small patch to a dist. In those cases i added a BEGIN block \
to mangle the environment for me. \
 \
This module basically is that BEGIN block. It automatically moves up one \
directory when it cannot see the test script in 't/$scriptname' and \
includes 'lib' in @INC when there's no blib present. That way the test ends \
up with almost the same environment it'd get from EUMM/prove/etc., even \
when it's actually run inside the t/ directory. \
 \
At the same time it will still function correctly when called by \
EUMM/prove/etc., since it does not change the environment in those cases."
LICENSE = "SUSE-Permissive"

PV = "1.112071"

RPM_NAME = "perl-Test-InDistDir-1.112071-9.26.noarch.rpm"
RPM_HASH = "896d6a1e139247534a413d8de19a3a0cd627c194613fd3857d12beea42f4e3369c188521a0169859db9d7048add36773598546ad26318588bbadd9980c04c817"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl(Test::InDistDir) \
perl-Test-InDistDir"
RDEPENDS:${PN} += "perl(:MODULE_COMPAT_5.36.0)"

inherit rpm
