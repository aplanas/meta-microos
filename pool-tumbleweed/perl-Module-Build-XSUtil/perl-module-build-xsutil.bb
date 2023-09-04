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

RPM_NAME = "perl-Module-Build-XSUtil-0.19-1.17.aarch64.rpm"
RPM_HASH = "17e3f1666cce870f0b9f3a18c512380e291a02e16567999027f2432fd1e16ee9cfacd14d781ac02068a2fb09861af816a80a39bb1ba1d8244ddf4ef4f85b9bc9"

RPROVIDES:${PN} += "perl-Module--Build--XSUtil \
perl-Module-Build-XSUtil"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.38.0 \
perl-Devel--CheckCompiler \
perl-ExtUtils--CBuilder \
perl-parent"

inherit rpm
