SUMMARY = "Perl extension for maintaining test directories"
DESCRIPTION = "Testing code can involve making sure that files are created and deleted as \
expected. Doing this manually can be error prone, as it's easy to forget a \
file, or miss that some unexpected file was added. This module simplifies \
maintaining test directories by tracking their status as they are modified \
or tested with this API, making it simple to test both individual files, as \
well as to verify that there are no missing or unknown files. \
 \
The idea is to use this API to create a temporary directory and populate an \
initial set of files. Then, whenever something in the directory is changes, \
use the test methods to verify that the change happened as expected. At any \
time, it is simple to verify that the contents of the directory are exactly \
as expected. \
 \
Test::Directory implements an object-oriented interface for managing test \
directories. It tracks which files it knows about (by creating or testing \
them via its API), and can report if any files were missing or unexpectedly \
added. \
 \
There are two flavors of methods for interacting with the directory. \
_Utility_ methods simply return a value (i.e. the number of files/errors) \
with no output, while the _Test_ functions use Test::Builder to produce the \
approriate test results and diagnostics for the test harness. \
 \
The directory will be automatically cleaned up when the object goes out of \
scope; see the _clean_ method below for details."
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "0.052"

RPM_NAME = "perl-Test-Directory-0.052-1.3.noarch.rpm"
RPM_HASH = "57431f14abcad4d3dd753a12bf1cd347abaced4cd4e8f58e0c7b51734bfcf009e4a31c864495f385578952d92eb7c4ac4e81602aa136b3a1f924453c01a5e0cb"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-Test--Directory \
perl-Test-Directory"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.38.0"

inherit rpm
