SUMMARY = "Powerful, high-performance templating for the web and beyond"
DESCRIPTION = "Mason is a powerful Perl-based templating system, designed to generate \
dynamic content of all kinds. \
 \
Unlike many templating systems, Mason does not attempt to invent an \
alternate, 'easier' syntax for templates. It provides a set of syntax and \
features specific to template creation, but underneath it is still clearly \
and proudly recognizable as Perl. \
 \
Mason is most often used for generating web pages. It has a companion web \
framework, Poet, designed to take maximum advantage of its routing and \
content generation features. It can also be used as the templating layer \
for web frameworks such as Catalyst::View::Mason2 and \
Dancer::Template::Mason2. \
 \
All documentation is indexed at the Mason::Manual manpage. \
 \
The previous major version of Mason (1.x) is available under the name the \
HTML::Mason manpage."
LICENSE = "Artistic-1.0 | GPL-1.0+"

PV = "2.24"

RPM_NAME = "perl-Mason-2.24-1.22.noarch.rpm"
RPM_HASH = "222800814b1eb4af098f856bc242c0ae7d606648f2fc3d4876b9b9b17c0e383d3db49a962adf0bf8d910aefe1190bb59bb23dcff030d1544bb4e23ecdc343b12"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-Mason \
perl-Mason--App \
perl-Mason--CodeCache \
perl-Mason--Compilation \
perl-Mason--Component \
perl-Mason--Component--ClassMeta \
perl-Mason--Component--Import \
perl-Mason--Component--Moose \
perl-Mason--DynamicFilter \
perl-Mason--Exceptions \
perl-Mason--Filters--Standard \
perl-Mason--Interp \
perl-Mason--Moose \
perl-Mason--Moose--Role \
perl-Mason--Plugin \
perl-Mason--Plugin--B \
perl-Mason--Plugin--C \
perl-Mason--Plugin--D \
perl-Mason--Plugin--Defer \
perl-Mason--Plugin--Defer--Filters \
perl-Mason--Plugin--Defer--Request \
perl-Mason--Plugin--DollarDot \
perl-Mason--Plugin--DollarDot--Compilation \
perl-Mason--Plugin--E \
perl-Mason--Plugin--H \
perl-Mason--Plugin--LvalueAttributes \
perl-Mason--Plugin--LvalueAttributes--Interp \
perl-Mason--Plugin--TidyObjectFiles \
perl-Mason--Plugin--TidyObjectFiles--Interp \
perl-Mason--PluginBundle \
perl-Mason--PluginBundle--Default \
perl-Mason--PluginBundle--F \
perl-Mason--PluginBundle--I \
perl-Mason--PluginBundle--J \
perl-Mason--PluginManager \
perl-Mason--PluginRole \
perl-Mason--Request \
perl-Mason--Result \
perl-Mason--Test--Class \
perl-Mason--Test--Overrides--Component--StrictMoose \
perl-Mason--Test--PluginBundle--G \
perl-Mason--Test--Plugins--A \
perl-Mason--Test--Plugins--Notify \
perl-Mason--Test--Plugins--Notify--Compilation \
perl-Mason--Test--Plugins--Notify--Component \
perl-Mason--Test--Plugins--Notify--Interp \
perl-Mason--Test--Plugins--Notify--Request \
perl-Mason--Test--Plugins--Upper \
perl-Mason--Test--Plugins--Upper--Request \
perl-Mason--Test--RootClass \
perl-Mason--Test--RootClass--Compilation \
perl-Mason--Test--RootClass--Component \
perl-Mason--Test--RootClass--Interp \
perl-Mason--Test--RootClass--Request \
perl-Mason--TieHandle \
perl-Mason--Types \
perl-Mason--Util \
perl-Mason--t--Autobase \
perl-Mason--t--Cache \
perl-Mason--t--CompCalls \
perl-Mason--t--Compilation \
perl-Mason--t--ComponentMeta \
perl-Mason--t--Defer \
perl-Mason--t--DollarDot \
perl-Mason--t--Errors \
perl-Mason--t--Filters \
perl-Mason--t--Globals \
perl-Mason--t--HTMLFilters \
perl-Mason--t--Interp \
perl-Mason--t--LvalueAttributes \
perl-Mason--t--Plugins \
perl-Mason--t--Reload \
perl-Mason--t--Request \
perl-Mason--t--ResolveURI \
perl-Mason--t--Sanity \
perl-Mason--t--Sections \
perl-Mason--t--Skel \
perl-Mason--t--StaticSource \
perl-Mason--t--Syntax \
perl-Mason--t--Util"

RDEPENDS:${PN} += "/usr/bin/perl \
perl--MODULE-COMPAT-5.36.0 \
perl-Capture--Tiny \
perl-Class--Load \
perl-Class--Unload \
perl-Devel--GlobalDestruction \
perl-Exception--Class \
perl-Guard \
perl-IPC--System--Simple \
perl-JSON \
perl-Log--Any \
perl-Method--Signatures--Simple \
perl-Moose \
perl-MooseX--HasDefaults \
perl-MooseX--StrictConstructor \
perl-Try--Tiny"

inherit rpm
