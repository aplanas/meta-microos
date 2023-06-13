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

RPM_NAME = "perl-Test-MockRandom-1.01-1.22.noarch.rpm"
RPM_HASH = "171f571d79550f1e85a626c8fddfc17075b99c5192976ab8fa9b9cc7afce52b9569ac81603b673c352b2a00be25f3b0760e8aab5c7b4a484698683103f4d36a9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl(Test::MockRandom) \
perl-Test-MockRandom"

RDEPENDS:${PN} += "perl(:MODULE_COMPAT_5.36.0)"

inherit rpm
