SUMMARY = "Retrieve terminal size"
DESCRIPTION = "This is a unified interface to retrieve terminal size. It loads one module \
of a list of known alternatives, each implementing some way to get the \
desired terminal information. This loaded module will actually do the job \
on behalf of 'Term::Size::Any'. \
 \
Thus, 'Term::Size::Any' depends on the availability of one of these \
modules: \
 \
    Term::Size           (soon to be supported) \
    Term::Size::Perl \
    Term::Size::ReadKey  (soon to be supported) \
    Term::Size::Win32 \
 \
This release fallbacks to Term::Size::Win32 if running in Windows 32 \
systems. For other platforms, it uses the first of Term::Size::Perl, \
Term::Size or Term::Size::ReadKey which loads successfully. (To be honest, \
I disabled the fallback to Term::Size and Term::Size::ReadKey which are \
buggy by now.)"
LICENSE = "Artistic-1.0 | GPL-1.0+"

PV = "0.002"

RPM_NAME = "perl-Term-Size-Any-0.002-1.11.noarch.rpm"
RPM_HASH = "2245c0eae57350366fbeddbdac0be4e8f0ae1ee009f400142c1f1c9a7a8976b80dc394889169f489541ef9d51254724a691d94cd0dbd7b923751faff08b654ca"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-Term--Size--Any \
perl-Term-Size-Any"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.36.1 \
perl-Devel--Hide \
perl-Module--Load--Conditional \
perl-Term--Size--Perl"

inherit rpm
