SUMMARY = "Easily build XS extensions that depend on XS extensions"
DESCRIPTION = "This module tries to make it easy to build Perl extensions that use \
functions and typemaps provided by other perl extensions. This means that a \
perl extension is treated like a shared library that provides also a C and \
an XS interface besides the perl one. \
 \
This works as long as the base extension is loaded with the RTLD_GLOBAL \
flag (usually done with a \
 \
	sub dl_load_flags {0x01} \
 \
in the main .pm file) if you need to use functions defined in the module. \
 \
The basic scheme of operation is to collect information about a module in \
the instance, and then store that data in the Perl library where it may be \
retrieved later. The object can also reformat this information into the \
data structures required by ExtUtils::MakeMaker's WriteMakefile function. \
 \
For information on how to make your module fit into this scheme, see \
'hashref = ExtUtils::Depends::load (name)'. \
 \
When creating a new Depends object, you give it a name, which is the name \
of the module you are building. You can also specify the names of modules \
on which this module depends. These dependencies will be loaded \
automatically, and their typemaps, header files, etc merged with your new \
object's stuff. When you store the data for your object, the list of \
dependencies are stored with it, so that another module depending on your \
needn't know on exactly which modules yours depends. \
 \
For example: \
 \
  Gtk2 depends on Glib \
 \
  Gnome2::Canvas depends on Gtk2 \
 \
  ExtUtils::Depends->new ('Gnome2::Canvas', 'Gtk2'); \
     this command automatically brings in all the stuff needed \
     for Glib, since Gtk2 depends on it. \
 \
When the configuration information is saved, it also includes a class \
method called 'Inline', inheritable by your module. This allows you in your \
module to simply say at the top: \
 \
  package Mymod; \
  use parent 'Mymod::Install::Files'; # to inherit 'Inline' method \
 \
And users of 'Mymod' who want to write inline code (using Inline) will \
simply be able to write: \
 \
  use Inline with => 'Mymod'; \
 \
And all the necessary header files, defines, and libraries will be added \
for them. \
 \
The 'Mymod::Install::Files' will also implement a 'deps' method, which will \
return a list of any modules that 'Mymod' depends on - you will not \
normally need to use this: \
 \
  require Mymod::Install::Files; \
  @deps = Mymod::Install::Files->deps;"
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "0.8001"

RPM_NAME = "perl-ExtUtils-Depends-0.8001-1.9.noarch.rpm"
RPM_HASH = "8ebb8127078ee772ea0e331bb1b3ac090b03a8cdc8857c7fd5665f319966b54c47db5e08e8be28627b776f02b265a8995393f37b2c172dc40feefafb2f804196"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-ExtUtils--Depends \
perl-ExtUtils-Depends"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.36.0 \
perl-ExtUtils--MakeMaker"

inherit rpm
