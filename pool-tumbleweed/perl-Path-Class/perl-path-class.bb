SUMMARY = "Cross-platform path specification manipulation"
DESCRIPTION = "'Path::Class' is a module for manipulation of file and directory \
specifications (strings describing their locations, like \
''/home/ken/foo.txt'' or ''C:\\Windows\\Foo.txt'') in a cross-platform \
manner. It supports pretty much every platform Perl runs on, including \
Unix, Windows, Mac, VMS, Epoc, Cygwin, OS/2, and NetWare. \
 \
The well-known module File::Spec also provides this service, but it's sort \
of awkward to use well, so people sometimes avoid it, or use it in a way \
that won't actually work properly on platforms significantly different than \
the ones they've tested their code on. \
 \
In fact, 'Path::Class' uses 'File::Spec' internally, wrapping all the \
unsightly details so you can concentrate on your application code. Whereas \
'File::Spec' provides functions for some common path manipulations, \
'Path::Class' provides an object-oriented model of the world of path \
specifications and their underlying semantics. 'File::Spec' doesn't create \
any objects, and its classes represent the different ways in which paths \
must be manipulated on various platforms (not a very intuitive concept). \
'Path::Class' creates objects representing files and directories, and \
provides methods that relate them to each other. For instance, the \
following 'File::Spec' code: \
 \
 my $absolute = File::Spec->file_name_is_absolute( \
                  File::Spec->catfile( @dirs, $file ) \
                ); \
 \
can be written using 'Path::Class' as \
 \
 my $absolute = Path::Class::File->new( @dirs, $file )->is_absolute; \
 \
or even as \
 \
 my $absolute = file( @dirs, $file )->is_absolute; \
 \
Similar readability improvements should happen all over the place when \
using 'Path::Class'. \
 \
Using 'Path::Class' can help solve real problems in your code too - for \
instance, how many people actually take the 'volume' (like 'C:' on Windows) \
into account when writing 'File::Spec'-using code? I thought not. But if \
you use 'Path::Class', your file and directory objects will know what \
volumes they refer to and do the right thing. \
 \
The guts of the 'Path::Class' code live in the Path::Class::File and \
Path::Class::Dir modules, so please see those modules' documentation for \
more details about how to use them."
LICENSE = "Artistic-1.0 | GPL-1.0+"

PV = "0.37"

RPM_NAME = "perl-Path-Class-0.37-1.23.noarch.rpm"
RPM_HASH = "af92c150c195ae42035773a2de65be5d11dfeac7e78beb8f4663e415a7239418939f2553214e9786568ef422eed35877a5eb8f19d3ab18e34afa44a1a43c2b00"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-Path--Class \
perl-Path--Class--Dir \
perl-Path--Class--Entity \
perl-Path--Class--File \
perl-Path-Class"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.38.0 \
perl-File--Spec \
perl-Perl--OSType \
perl-parent"

inherit rpm
