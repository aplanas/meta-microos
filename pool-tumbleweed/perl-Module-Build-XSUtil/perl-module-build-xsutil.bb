SUMMARY = "Module::Build class for building XS modules"
DESCRIPTION = "Module::Build::XSUtil is subclass of Module::Build for support building XS \
modules. \
 \
This is a list of a new parameters in the Module::Build::new method: \
 \
* needs_compiler_c99 \
 \
This option checks C99 compiler's availability. If it's not available, \
Build.PL exits by 0. \
 \
* needs_compiler_cpp \
 \
This option checks C++ compiler's availability. If it's not available, \
Build.PL exits by 0. \
 \
In addition, append 'extra_compiler_flags' and 'extra_linker_flags' for \
C++. \
 \
* generate_ppport_h \
 \
Genereate ppport.h by Devel::PPPort. \
 \
* generate_xshelper_h \
 \
Genereate xshelper.h which is a helper header file to include EXTERN.h, \
perl.h, XSUB.h and ppport.h, and defines some portability stuff which are \
not supported by ppport.h. \
 \
It is porting from Module::Install::XSUtil. \
 \
* cc_warnings \
 \
Enable compiler warnings flag. It is enable by default. \
 \
* -g options \
 \
If invoke Build.PL with '-g' option, It will build with debug options."
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "0.19"

RPM_NAME = "perl-Module-Build-XSUtil-0.19-1.16.aarch64.rpm"
RPM_HASH = "dd3969db86f64b0ea1ccf990d4a1cecf1c18567b8d63a3a09223eee4943326412cf031ad18159989678f7e254c11621be64339b0ef8d89bd6e2cc61b1a456a73"

RPROVIDES:${PN} += "perl-Module--Build--XSUtil \
perl-Module-Build-XSUtil"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.36.1 \
perl-Devel--CheckCompiler \
perl-ExtUtils--CBuilder \
perl-parent"

inherit rpm
