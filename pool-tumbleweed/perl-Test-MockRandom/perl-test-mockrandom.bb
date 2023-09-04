SUMMARY = "Replaces random number generation with non-random number generation"
DESCRIPTION = "This perhaps ridiculous-seeming module was created to test routines that \
manipulate random numbers by providing a known output from 'rand'. Given a \
list of seeds with 'srand', it will return each in turn. After seeded \
random numbers are exhausted, it will always return 0. Seed numbers must be \
of a form that meets the expected output from 'rand' as called with no \
arguments -- i.e. they must be between 0 (inclusive) and 1 (exclusive). In \
order to facilitate generating and testing a nearly-one number, this module \
exports the function 'oneish', which returns a number just fractionally \
less than one. \
 \
Depending on how this module is called with 'use', it will export 'rand' to \
a specified package (e.g. a class being tested) effectively overriding and \
intercepting calls in that package to the built-in 'rand'. It can also \
override 'rand' in the current package or even globally. In all of these \
cases, it also exports 'srand' and 'oneish' to the current package in order \
to control the output of 'rand'. See USAGE for details. \
 \
Alternatively, this module can be used to generate objects, with each \
object maintaining its own distinct seed array."
LICENSE = "Apache-2.0"

PV = "1.01"

RPM_NAME = "perl-Test-MockRandom-1.01-1.24.noarch.rpm"
RPM_HASH = "1dbd232f5a34b1e0d71d9360c49b8789c47efbf13c1b75a083f690163641a7c681cdafad670424be583f81a591968efbc54005dfe2c7784c2052550bc9502763"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-Test--MockRandom \
perl-Test-MockRandom"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.38.0"

inherit rpm
