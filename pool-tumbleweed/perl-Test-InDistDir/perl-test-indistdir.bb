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

RPM_NAME = "perl-Test-InDistDir-1.112071-9.27.noarch.rpm"
RPM_HASH = "218241c47ef6f6dd4b1f8804c5650356a0db8d00185e69147fdef9d1a6c012a2fbd68694117e8d4fa82da069248724535d3b02063cbbf1810246ebf5c35960f2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-Test--InDistDir \
perl-Test-InDistDir"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.36.1"

inherit rpm
