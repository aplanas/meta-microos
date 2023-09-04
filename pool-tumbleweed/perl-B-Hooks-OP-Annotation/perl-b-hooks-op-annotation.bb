SUMMARY = "annotate and delegate hooked OPs"
DESCRIPTION = "This module provides a way for XS code that hijacks OP 'op_ppaddr' \
functions to delegate to (or restore) the previous functions, whether \
assigned by perl or by another module. Typically this should be used in \
conjunction with B::Hooks::OP::Check. \
 \
'B::Hooks::OP::Annotation' makes its types and functions available to XS \
code by means of ExtUtils::Depends. Modules that wish to use these exports \
in their XS code should 'use B::OP::Hooks::Annotation' in the Perl module \
that loads the XS, and include something like the following in their \
Makefile.PL: \
 \
    use ExtUtils::MakeMaker; \
    use ExtUtils::Depends; \
 \
    our %XS_PREREQUISITES = ( \
        'B::Hooks::OP::Annotation' => '0.44', \
        'B::Hooks::OP::Check'      => '0.15', \
    ); \
 \
    our %XS_DEPENDENCIES = ExtUtils::Depends->new( \
        'Your::XS::Module', \
         keys(%XS_PREREQUISITES) \
    )->get_makefile_vars(); \
 \
    WriteMakefile( \
        NAME          => 'Your::XS::Module', \
        VERSION_FROM  => 'lib/Your/XS/Module.pm', \
        PREREQ_PM => { \
            'B::Hooks::EndOfScope' => '0.07', \
            %XS_PREREQUISITES \
        }, \
        ($ExtUtils::MakeMaker::VERSION >= 6.46 ? \
            (META_MERGE => { \
                configure_requires => { \
                    'ExtUtils::Depends' => '0.301', \
                    %XS_PREREQUISITES \
                }}) \
            : () \
        ), \
        %XS_DEPENDENCIES, \
         \
    );"
LICENSE = "Artistic-1.0 | GPL-1.0+"

PV = "0.44"

RPM_NAME = "perl-B-Hooks-OP-Annotation-0.44-3.39.aarch64.rpm"
RPM_HASH = "770e635087212466e6d4578a8089dd14899395f74cee305a2c080decdc70b00cb859361f62a9c0cf8ab55c4a0a4f8d8264c3a0c603689b5db454550d7ee6726b"

RPROVIDES:${PN} += "perl-B--Hooks--OP--Annotation \
perl-B--Hooks--OP--Annotation--Install--Files \
perl-B-Hooks-OP-Annotation"

RDEPENDS:${PN} += "libc.so.6 \
perl--MODULE-COMPAT-5.38.0 \
perl-ExtUtils--Depends"

inherit rpm
