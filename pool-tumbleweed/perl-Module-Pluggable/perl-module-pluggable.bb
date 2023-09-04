SUMMARY = "Automatically Give Your Module the Ability to Have Plugins"
DESCRIPTION = "Provides a simple but, hopefully, extensible way of having 'plugins' for \
your module. Obviously this isn't going to be the be all and end all of \
solutions but it works for me. \
 \
Essentially all it does is export a method into your namespace that looks \
through a search path for .pm files and turn those into class names. \
 \
Optionally it instantiates those classes for you."
LICENSE = "Artistic-1.0 | GPL-1.0+"

PV = "5.2"

RPM_NAME = "perl-Module-Pluggable-5.2-1.28.noarch.rpm"
RPM_HASH = "4c1d057d4a0586acbd05924fd69c5e1548f25d8313a20b51392f2e972259c99a6d808dbb2bd25a3946651240b993246e9b8af8894e3924c04d1cc113bbcb58cb"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-Devel--InnerPackage \
perl-Module--Pluggable \
perl-Module--Pluggable--Object \
perl-Module-Pluggable"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.38.0"

inherit rpm
