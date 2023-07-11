SUMMARY = "Temporary directories that stick around when tests fail"
DESCRIPTION = "This module works with Test::More to create temporary directories that \
stick around if tests fail. \
 \
It is loosely based on Test::TempDir, but with less complexity, greater \
portability and zero non-core dependencies. (Capture::Tiny is recommended \
for testing.) \
 \
The tempdir and in_tempdir functions are exported by default. \
 \
If the current directory is writable, the root for directories will be \
_./tmp_. Otherwise, a File::Temp directory will be created wherever \
temporary directories are stored for your system. \
 \
Every _*.t_ file gets its own subdirectory under the root based on the test \
filename, but with slashes and periods replaced with underscores. For \
example, _t/foo.t_ would get a test-file-specific subdirectory \
_./tmp/t_foo_t/_. Directories created by tempdir get put in that directory. \
This makes it very easy to find files later if tests fail. \
 \
The test-file-specific name is consistent from run-to-run. If an old \
directory already exists, it will be removed. \
 \
When the test file exits, if all tests passed, then the test-file-specific \
directory is recursively removed. \
 \
If a test failed and the root directory is _./tmp_, the test-file-specific \
directory sticks around for inspection. (But if the root is a File::Temp \
directory, it is always discarded). \
 \
If nothing is left in _./tmp_ (i.e. no other test file failed), then \
_./tmp_ is cleaned up as well (unless it's a symlink). \
 \
This module attempts to avoid race conditions due to parallel testing. In \
extreme cases, the test-file-specific subdirectory might be created as a \
regular File::Temp directory rather than in _./tmp_. In such a case, a \
warning will be issued."
LICENSE = "Apache-2.0"

PV = "0.018"

RPM_NAME = "perl-Test-TempDir-Tiny-0.018-1.18.noarch.rpm"
RPM_HASH = "906cccca9197ef682eb58e01d7c4c695c593f6e701d61bcf66063637e304204855e288c425f8319aa2f85e0041383e501586c2ef16683fe88fc7f20fbff5b527"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-Test--TempDir--Tiny \
perl-Test-TempDir-Tiny"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.36.1 \
perl-File--Path \
perl-File--Temp"

inherit rpm
