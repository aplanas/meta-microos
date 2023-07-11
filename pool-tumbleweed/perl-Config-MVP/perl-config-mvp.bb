SUMMARY = "Multivalue-property package-oriented configuration"
DESCRIPTION = "MVP is a mechanism for loading configuration (or other information) for \
libraries. It doesn't read a file or a database. It's a helper for things \
that do. \
 \
The idea is that you end up with a Config::MVP::Sequence object, and that \
you can use that object to fully configure your library or application. The \
sequence will contain a bunch of Config::MVP::Section objects, each of \
which is meant to provide configuration for a part of your program. Most of \
these sections will be directly related to a Perl library that you'll use \
as a plugin or helper. Each section will have a name, and every name in the \
sequence will be unique. \
 \
This is a pretty abstract set of behaviors, so we'll provide some more \
concrete examples that should help explain how things work."
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "2.200013"

RPM_NAME = "perl-Config-MVP-2.200013-1.3.noarch.rpm"
RPM_HASH = "cd60a07dd222776ccab208fd270805fb2d5cbd52a45c4bbf08c524f0fbfcccc057a944ab1708b0d9c10c7784f3e0f369e82b9e6d95ec1c13b5c53b58ba431698"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-Config--MVP \
perl-Config--MVP--Assembler \
perl-Config--MVP--Assembler--WithBundles \
perl-Config--MVP--Error \
perl-Config--MVP--Reader \
perl-Config--MVP--Reader--Findable \
perl-Config--MVP--Reader--Findable--ByExtension \
perl-Config--MVP--Reader--Finder \
perl-Config--MVP--Reader--Hash \
perl-Config--MVP--Section \
perl-Config--MVP--Sequence \
perl-Config-MVP"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.36.1 \
perl-Class--Load \
perl-Module--Pluggable--Object \
perl-Moose \
perl-Moose--Role \
perl-Moose--Util--TypeConstraints \
perl-MooseX--OneArgNew \
perl-Params--Util \
perl-Role--HasMessage \
perl-Role--Identifiable--HasIdent \
perl-StackTrace--Auto \
perl-Test--More \
perl-Throwable \
perl-Tie--IxHash \
perl-Try--Tiny"

inherit rpm
