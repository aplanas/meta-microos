SUMMARY = "Basic utilities for writing tests"
DESCRIPTION = "** If you are unfamiliar with testing *read Test::Tutorial first!* ** \
 \
This is an extremely simple, extremely basic module for writing tests \
suitable for CPAN modules and other pursuits. If you wish to do more \
complicated testing, use the Test::More module (a drop-in replacement for \
this one)."
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "1.302195"

RPM_NAME = "perl-Test-Simple-1.302195-1.2.noarch.rpm"
RPM_HASH = "dbb8fe3d36aa786dcbd112f442c30d1e040748e3036c921e1874f121f4821bbdd158e2d28a80cfb6a06f215e51fcfe51c12953c94cdb260bbf033e4c58b00cf3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-Test--Builder \
perl-Test--Builder--Formatter \
perl-Test--Builder--IO--Scalar \
perl-Test--Builder--Module \
perl-Test--Builder--Tester \
perl-Test--Builder--Tester--Color \
perl-Test--Builder--Tester--Tie \
perl-Test--Builder--TodoDiag \
perl-Test--More \
perl-Test--Simple \
perl-Test--Tester \
perl-Test--Tester--Capture \
perl-Test--Tester--CaptureRunner \
perl-Test--Tester--Delegate \
perl-Test--use--ok \
perl-Test-Simple \
perl-Test2 \
perl-Test2--API \
perl-Test2--API--Breakage \
perl-Test2--API--Context \
perl-Test2--API--Instance \
perl-Test2--API--InterceptResult \
perl-Test2--API--InterceptResult--Event \
perl-Test2--API--InterceptResult--Facet \
perl-Test2--API--InterceptResult--Hub \
perl-Test2--API--InterceptResult--Squasher \
perl-Test2--API--Stack \
perl-Test2--Event \
perl-Test2--Event--Bail \
perl-Test2--Event--Diag \
perl-Test2--Event--Encoding \
perl-Test2--Event--Exception \
perl-Test2--Event--Fail \
perl-Test2--Event--Generic \
perl-Test2--Event--Note \
perl-Test2--Event--Ok \
perl-Test2--Event--Pass \
perl-Test2--Event--Plan \
perl-Test2--Event--Skip \
perl-Test2--Event--Subtest \
perl-Test2--Event--TAP--Version \
perl-Test2--Event--V2 \
perl-Test2--Event--Waiting \
perl-Test2--EventFacet \
perl-Test2--EventFacet--About \
perl-Test2--EventFacet--Amnesty \
perl-Test2--EventFacet--Assert \
perl-Test2--EventFacet--Control \
perl-Test2--EventFacet--Error \
perl-Test2--EventFacet--Hub \
perl-Test2--EventFacet--Info \
perl-Test2--EventFacet--Info--Table \
perl-Test2--EventFacet--Meta \
perl-Test2--EventFacet--Parent \
perl-Test2--EventFacet--Plan \
perl-Test2--EventFacet--Render \
perl-Test2--EventFacet--Trace \
perl-Test2--Formatter \
perl-Test2--Formatter--TAP \
perl-Test2--Hub \
perl-Test2--Hub--Interceptor \
perl-Test2--Hub--Interceptor--Terminator \
perl-Test2--Hub--Subtest \
perl-Test2--IPC \
perl-Test2--IPC--Driver \
perl-Test2--IPC--Driver--Files \
perl-Test2--Tools--Tiny \
perl-Test2--Util \
perl-Test2--Util--ExternalMeta \
perl-Test2--Util--Facets2Legacy \
perl-Test2--Util--HashBase \
perl-Test2--Util--Trace \
perl-ok"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.36.1"

inherit rpm
