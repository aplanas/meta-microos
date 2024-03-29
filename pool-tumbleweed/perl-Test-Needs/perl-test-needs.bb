SUMMARY = "Skip tests when modules not available"
DESCRIPTION = "Skip test scripts if modules are not available. The requested modules will \
be loaded, and optionally have their versions checked. If the module is \
missing, the test script will be skipped. Modules that are found but fail \
to compile will exit with an error rather than skip. \
 \
If used in a subtest, the remainder of the subtest will be skipped. \
 \
Skipping will work even if some tests have already been run, or if a plan \
has been declared. \
 \
Versions are checked via a '$module->VERSION($wanted_version)' call. \
Versions must be provided in a format that will be accepted. No extra \
processing is done on them. \
 \
If 'perl' is used as a module, the version is checked against the running \
perl version ($]). The version can be specified as a number, dotted-decimal \
string, v-string, or version object. \
 \
If the 'RELEASE_TESTING' environment variable is set, the tests will fail \
rather than skip. Subtests will be aborted, but the test script will \
continue running after that point."
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "0.002010"

RPM_NAME = "perl-Test-Needs-0.002010-1.3.noarch.rpm"
RPM_HASH = "9871a1d795383100193a4d43213ffe9c7d1bab0fc415b9fb04cff8fb7659fec341109c44bec7a79f9f4d6fdbfaef7d3e7875f5286d87e456183383f6da8ffb2f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-Test--Needs \
perl-Test-Needs"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.38.0"

inherit rpm
