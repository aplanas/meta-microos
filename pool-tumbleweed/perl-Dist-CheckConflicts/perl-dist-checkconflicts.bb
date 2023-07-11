SUMMARY = "declare version conflicts for your dist"
DESCRIPTION = "One shortcoming of the CPAN clients that currently exist is that they have \
no way of specifying conflicting downstream dependencies of modules. This \
module attempts to work around this issue by allowing you to specify \
conflicting versions of modules separately, and deal with them after the \
module is done installing. \
 \
For instance, say you have a module 'Foo', and some other module 'Bar' uses \
'Foo'. If 'Foo' were to change its API in a non-backwards-compatible way, \
this would cause 'Bar' to break until it is updated to use the new API. \
'Foo' can't just depend on the fixed version of 'Bar', because this will \
cause a circular dependency (because 'Bar' is already depending on 'Foo'), \
and this doesn't express intent properly anyway - 'Foo' doesn't use 'Bar' \
at all. The ideal solution would be for there to be a way to specify \
conflicting versions of modules in a way that would let CPAN clients update \
conflicting modules automatically after an existing module is upgraded, but \
until that happens, this module will allow users to do this manually. \
 \
This module accepts a hash of options passed to its 'use' statement, with \
these keys being valid: \
 \
* -conflicts \
 \
  A hashref of conflict specifications, where keys are module names, and \
  values are the last broken version - any version greater than the \
  specified version should work. \
 \
* -also \
 \
  Additional modules to get conflicts from (potentially recursively). This \
  should generally be a list of modules which use Dist::CheckConflicts, \
  which correspond to the dists that your dist depends on. (In an ideal \
  world, this would be intuited directly from your dependency list, but the \
  dependency list isn't available outside of build time). \
 \
* -dist \
 \
  The name of the distribution, to make the error message from \
  check_conflicts more user-friendly. \
 \
The methods listed below are exported by this module into the module that \
uses it, so you should call these methods on your module, not \
Dist::CheckConflicts. \
 \
As an example, this command line can be used to update your modules, after \
installing the 'Foo' dist (assuming that 'Foo::Conflicts' is the module in \
the 'Foo' dist which uses Dist::CheckConflicts): \
 \
    perl -MFoo::Conflicts -e'print '$_\\n' \
        for map { $_->{package} } Foo::Conflicts->calculate_conflicts' | cpanm \
 \
As an added bonus, loading your conflicts module will provide warnings at \
runtime if conflicting modules are detected (regardless of whether they are \
loaded before or afterwards)."
LICENSE = "Artistic-1.0 | GPL-1.0+"

PV = "0.11"

RPM_NAME = "perl-Dist-CheckConflicts-0.11-1.26.noarch.rpm"
RPM_HASH = "e3f30f80ea7be80842c08213933a706e2a252355cf374bf465759dcd351da64aa74181c4263476113bf087d81fd047f1b56c68c47d3ad9aa0c2c9d4c19b69d63"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-Dist--CheckConflicts \
perl-Dist-CheckConflicts"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.36.1 \
perl-Module--Runtime"

inherit rpm
