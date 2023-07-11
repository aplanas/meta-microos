SUMMARY = "Write Perl Subroutines in Other Programming Languages"
DESCRIPTION = "The Inline module allows you to put source code from other programming \
languages directly 'inline' in a Perl script or module. The code is \
automatically compiled as needed, and then loaded for immediate access from \
Perl. \
 \
Inline saves you from the hassle of having to write and compile your own \
glue code using facilities like XS or SWIG. Simply type the code where you \
want it and run your Perl as normal. All the hairy details are handled for \
you. The compilation and installation of your code chunks all happen \
transparently; all you will notice is the delay of compilation on the first \
run. \
 \
The Inline code only gets compiled the first time you run it (or whenever \
it is modified) so you only take the performance hit once. Code that is \
Inlined into distributed modules (like on the CPAN) will get compiled when \
the module is installed, so the end user will never notice the compilation \
time. \
 \
Best of all, it works the same on both Unix and Microsoft Windows. See \
Inline- Support for support information."
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "0.86"

RPM_NAME = "perl-Inline-0.86-2.8.noarch.rpm"
RPM_HASH = "378d2439891fc1c8b8e1a0bd867ce7ed3b916f7a5e970ca3dea4447de2f71fafb47c0bfdc8329d07a7f369dc7dddaff78b4a7a376a9ffcfc35e22474a133db89"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-Foo--Tester \
perl-Inline \
perl-Inline--Foo \
perl-Inline--MakeMaker \
perl-Inline--denter"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.36.1 \
perl-version"

inherit rpm
